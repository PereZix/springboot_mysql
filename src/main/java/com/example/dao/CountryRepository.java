package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	
}
