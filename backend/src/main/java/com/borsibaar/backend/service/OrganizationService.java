package com.borsibaar.backend.service;

import com.borsibaar.backend.dto.OrganizationRequestDto;
import com.borsibaar.backend.dto.OrganizationResponseDto;
import com.borsibaar.backend.entity.Organization;
import com.borsibaar.backend.mapper.OrganizationMapper;
import com.borsibaar.backend.repository.OrganizationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.OffsetDateTime;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final OrganizationMapper organizationMapper;

    public OrganizationService(OrganizationRepository organizationRepository, OrganizationMapper organizationMapper) {
        this.organizationRepository = organizationRepository;
        this.organizationMapper = organizationMapper;
    }


    @Transactional
    public OrganizationResponseDto create(OrganizationRequestDto request) {
        Organization organization = organizationMapper.toEntity(request);
        organization.setCreatedAt(OffsetDateTime.now());
        Organization saved = organizationRepository.save(organization);
        return organizationMapper.toResponse(saved);
    }

    @Transactional(readOnly = true)
    public OrganizationResponseDto getById(Long id) {
        Organization organization = organizationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Organization not found: " + id));
        return organizationMapper.toResponse(organization);
    }
}
