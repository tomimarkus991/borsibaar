package com.borsibaar.backend.controller;

import com.borsibaar.backend.dto.ProductRequestDto;
import com.borsibaar.backend.dto.ProductResponseDto;
import com.borsibaar.backend.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto create(@RequestBody @Valid ProductRequestDto request) {
        return service.create(request);
    }

    @GetMapping("/{id}")
    public ProductResponseDto get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public ProductResponseDto delete(@PathVariable Long id) {
        return service.getById(id);
    }

}
