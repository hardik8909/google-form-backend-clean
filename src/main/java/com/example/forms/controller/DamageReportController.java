package com.example.forms.controller;

import com.example.forms.Repository.DamageReportRepository;
import com.example.forms.Service.DamageReportService;
import com.example.forms.entity.DamageReport;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/damage")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class DamageReportController {

    private final DamageReportService service;
    private final DamageReportRepository repo;

    // GET ALL REPORTS
    @GetMapping("/all")
    public List<DamageReport> getAllReports() {

        return service.getAllReports();
    }

    // SUBMIT FORM
    @PostMapping("/submit")
    public String submitForm(
            @RequestBody DamageReport report
    ) {

        repo.save(report);

        return "Saved";
    }
}