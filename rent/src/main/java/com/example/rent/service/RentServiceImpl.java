package com.example.rent.service;

import com.example.rent.dao.RentDAOImpl;
import com.example.rent.dto.RentResponseDTO;
import com.example.rent.entity.Rent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {
    private final RentDAOImpl rentDAO;
    @Override
    public void insert(Rent rent) {
        rentDAO.insert(rent);
    }
    @Override
    public Rent findById(Long id) {
        return rentDAO.findById(id);
    }
    @Override
    public void delete(Long id) {
        rentDAO.delete(id);
    }
    @Override
    public void update(Rent rent) {
        rentDAO.update(rent);
    }
    @Override
    public List<RentResponseDTO> findAll() {
        List<Rent> rents = rentDAO.findAll();
        List<RentResponseDTO> rentlist = new ArrayList<>();
        RentResponseDTO rentdto = null;
        for (Rent rent : rents) {
            rentdto = new RentResponseDTO(rent.getRentDate(),rent.getReturnDate(),rent.getState(),
                                        rent.getArticleId(),rent.getBorrowerId());
            rentlist.add(rentdto);
        }
        return rentlist;
    }

}
