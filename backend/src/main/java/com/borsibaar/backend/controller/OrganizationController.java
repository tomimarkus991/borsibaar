package com.borsibaar.backend.controller;

import com.borsibaar.backend.dto.OrganizationRequestDto;
import com.borsibaar.backend.dto.OrganizationResponseDto;
import com.borsibaar.backend.service.OrganizationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationResponseDto create(@RequestBody @Valid OrganizationRequestDto request) {
        return organizationService.create(request);
    }

    @GetMapping("/{id}")
    public OrganizationResponseDto get(@PathVariable Long id) {
        return organizationService.getById(id);
    }

    @GetMapping
    public List<OrganizationResponseDto> getAll() {
        return organizationService.getAll();
    }

}
