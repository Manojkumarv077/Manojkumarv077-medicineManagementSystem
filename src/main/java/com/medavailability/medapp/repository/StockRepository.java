package com.medavailability.medapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medavailability.medapp.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    List<Stock> findByMedicine_NameContainingIgnoreCase(String name);
}
