package com.example.rent.controller;

import com.example.rent.dto.RentResponseDTO;
import com.example.rent.entity.Rent;
import com.example.rent.service.RentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
@AllArgsConstructor
public class RentController {
    private final RentServiceImpl rentService;

    @PostMapping("/insert")
    public String insert(@RequestBody Rent rent) {
        rentService.insert(rent);
        return "Rent Insert +++++++++++++++";
    }

    @GetMapping("/{id}")
    public Rent findById(@PathVariable Long id) {
        return rentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        rentService.delete(id);
        return "Rent deleted successfully! delete -------";
    }

    @PostMapping("/update")
    public String update(@RequestBody Rent rent) {
        rentService.update(rent);
        return "Rent updated successfully!update update upupupupup";
    }

    @GetMapping("/list")
    public List<RentResponseDTO> findAll() {
        return rentService.findAll();
    }
}
