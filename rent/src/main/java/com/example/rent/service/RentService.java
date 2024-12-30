package com.example.rent.service;

import com.example.rent.dto.RentResponseDTO;
import com.example.rent.entity.Rent;

import java.util.ArrayList;
import java.util.List;

public interface RentService {
    void insert(Rent rent);
    Rent findById(Long id);
    void delete(Long id);
    void update(Rent rent);
    List<RentResponseDTO> findAll() ;
}
