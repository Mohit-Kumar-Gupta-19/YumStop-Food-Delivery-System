package com.yumstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.yumstop.model.Feedback;
import com.yumstop.repository.FeedbackRepository;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepo;

    @GetMapping("/feedback")
    public String feedbackPage() {
        return "feedback";
    }

    @PostMapping("/feedback")
    public String submitFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
        return "redirect:/dashboard";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }
}
