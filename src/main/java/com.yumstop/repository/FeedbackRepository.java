package com.yumstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yumstop.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
