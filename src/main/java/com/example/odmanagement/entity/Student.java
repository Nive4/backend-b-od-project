package com.example.odmanagement.entity; // This must match your folder path

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students") // This matches the table you imported from CSV
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "reg_no")
    private String regNo;

    private String studentName;
    private String dob;
    private String gender;
    private String studentEmail;
    private String studentMobile;
    private String fatherName;
    private String motherName;
    private String district;
    private String state;
    
    // We keep 'active' as a String or Boolean depending on your CSV
    private String active; 
}