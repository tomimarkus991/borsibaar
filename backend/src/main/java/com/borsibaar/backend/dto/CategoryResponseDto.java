package com.borsibaar.backend.dto;

public record CategoryResponseDto(
        Long id,
        String name,
        Boolean dynamicPricing
) {}
