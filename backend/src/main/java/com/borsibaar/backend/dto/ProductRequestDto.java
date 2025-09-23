package com.borsibaar.backend.dto;

import java.math.BigDecimal;

public record ProductRequestDto(
        String name,
        String description,
        BigDecimal currentPrice,
        Long categoryId
) {}
