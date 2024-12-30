package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl rentService;

    @PostMapping("/insert")
    public String insert(@RequestBody User user) {
        rentService.insert(user);
        return "Rent Insert +++++++++++++++";
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return rentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        rentService.delete(id);
        return "Rent deleted successfully! delete -------";
    }

    @PostMapping("/update")
    public String update(@RequestBody User user) {
        rentService.update(user);
        return "Rent updated successfully!update update upupupupup";
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return rentService.findAll();
    }
}
