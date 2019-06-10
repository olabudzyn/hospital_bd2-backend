package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Permission;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionRepository repository;

    public Permission findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Permission", "id", id));
    }
}
