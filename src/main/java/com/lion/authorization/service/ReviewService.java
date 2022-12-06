package com.mustache.bbs.service;

import com.lion.authorization.domain.entity.Hospital;
import com.lion.authorization.domain.entity.Review;
import com.mustache.bbs.domain.dto.reviewDto.ReviewCreateRequest;
import com.mustache.bbs.domain.dto.reviewDto.ReviewCreateResponse;
import com.mustache.bbs.domain.dto.reviewDto.ReviewSelectResponse;
import com.mustache.bbs.domain.entity.Hospital;
import com.mustache.bbs.domain.entity.Review;
import com.mustache.bbs.repository.HospitalRepository;
import com.mustache.bbs.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    
}
