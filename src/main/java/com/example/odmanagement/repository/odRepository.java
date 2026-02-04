package com.example.odmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.odmanagement.entity.OdRequest;

@Repository
public interface odRepository extends JpaRepository<OdRequest, Long> {
}