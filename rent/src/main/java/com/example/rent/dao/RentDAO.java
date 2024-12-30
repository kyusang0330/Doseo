package com.example.rent.dao;

import com.example.rent.entity.Rent;

import java.util.List;

public interface RentDAO {
    void insert(Rent rent);
    Rent findById(Long id);
    void delete(Long id);
    void update(Rent rent);
    List<Rent> findAll();
}
