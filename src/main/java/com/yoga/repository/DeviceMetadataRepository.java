package com.yoga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoga.model.DeviceMetadata;

public interface DeviceMetadataRepository extends JpaRepository<DeviceMetadata, Long> {

    List<DeviceMetadata> findByUserId(Long userId);
}

