package com.example.rent.dao;

import com.example.rent.entity.Rent;
import com.example.rent.repository.RentRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class RentDAOImpl implements RentDAO {
    private final RentRepository rentRepository;
    @Override
    public void insert(Rent rent) {
        rentRepository.save(rent);
    }
    @Override
    public Rent findById(Long id) {
        return rentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rent not found"));
    }
    @Override
    public void delete(Long id) {
        rentRepository.deleteById(id);
    }
    @Override
    public void update(Rent rent) {
        rentRepository.save(rent);
    }
    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }
}




/*
@Repository
@AllArgsConstructor
public class RentDAOImpl implements RentDAO {
    private final EntityManager em;
    @Override
    public void insert(Rent dto) {
        em.persist(dto);
        em.flush();
    }

    @Override
    public Rent findById(Long id) {
        return em.find(Rent.class, id);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Rent dto) {

    }

    @Override
    public List<Rent> findAll() {
        return List.of();
    }
}
*/
