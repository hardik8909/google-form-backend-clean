package com.example.forms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "damageReport")
public class DamageReport {
    @Id
    private String id;

    private String date;
    private String location;
    private String arrivalDate;
    private String arrivalTime;

    private String measurements;
    private String damageDescription;

    private String pipeSize;
    private String pipeMaterial;
    private String opPressure;

    private String damagingEquipment;

    private String excavatorName;
    private String excavatorAddress;

    private String ticket;
    private String ticketNumber;

    private String finalDamageDescription;
    private String mapPicture;

    private String recordInfo;

    private String materialUsed;

}
