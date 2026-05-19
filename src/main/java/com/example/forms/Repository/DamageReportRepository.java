package com.example.forms.Repository;

import com.example.forms.entity.DamageReport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DamageReportRepository extends MongoRepository<DamageReport,String> {
}
