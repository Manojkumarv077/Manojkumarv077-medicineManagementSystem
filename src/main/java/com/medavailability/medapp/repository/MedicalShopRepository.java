package com.medavailability.medapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medavailability.medapp.model.MedicalShop;

public interface MedicalShopRepository extends JpaRepository<MedicalShop, Integer> {
    List<MedicalShop> findByLocation(String location);
}
