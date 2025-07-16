package com.medavailability.medapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medavailability.medapp.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
    List<Medicine> findByNameContainingIgnoreCase(String name);
}
