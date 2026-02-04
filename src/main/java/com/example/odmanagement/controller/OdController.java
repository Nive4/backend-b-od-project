package com.example.odmanagement.controller;

import com.example.odmanagement.entity.*;
import com.example.odmanagement.repository.*;
import com.example.odmanagement.service.OdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/od")
@CrossOrigin(origins = "*")
public class OdController {

    @Autowired
    private OdService odService;

    @Autowired
    private odRepository odRepo; // Match lowercase

    @Autowired
    private StudentRepository studentRepo; // Match the new file you created

    @GetMapping("/students/all")
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @PostMapping("/apply")
    public OdRequest apply(@RequestBody OdRequest request) {
        return odService.applyOd(request);
    }
}