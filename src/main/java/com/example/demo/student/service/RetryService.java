package com.example.demo.student.service;

import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public interface RetryService {
    @Retryable(value = RuntimeException.class)
    void retryService(String sql);

}