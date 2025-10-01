package com.borsibaar.backend.dto;

import jakarta.validation.constraints.NotBlank;

public record OrganizationRequestDto(
        @NotBlank String name
) {
}
