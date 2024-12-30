package com.example.rent.repository;

import com.example.rent.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RentRepository extends JpaRepository<Rent, Long> {

}
