package com.example.forms.Service;

import com.example.forms.Repository.DamageReportRepository;
import com.example.forms.entity.DamageReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageReportService {
    @Autowired
    public DamageReportRepository repo;
    public DamageReport saveReport(DamageReport damageReport){
        return repo.save(damageReport);
    }
    public List<DamageReport> getAllReports(){
        return repo.findAll();
    }
    public DamageReport getReportById(String id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Report Not Found")
                );
    }

    public void deleteReport(String id) {
        repo.deleteById(id);
    }
}
