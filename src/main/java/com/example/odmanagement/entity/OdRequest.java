package com.example.odmanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "od_requests")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OdRequest{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long odId;

    @Column(name = "reg_no")
    private String regNo; // This links to the Student's regNo

    private LocalDate fromDate;
    private LocalDate toDate;
    private String subject;
    
    @Column(columnDefinition = "TEXT")
    private String reason;
    
    private String attachmentPath;

    // Default status is PENDING for every new application
    private String status = "PENDING"; 
    
    private String rejectionReason;

    private LocalDateTime appliedAt = LocalDateTime.now();
    private LocalDateTime decisionAt;
}
