package com.example.odmanagement.service;

import com.example.odmanagement.entity.OdRequest;
import com.example.odmanagement.repository.odRepository; // Matches your filename
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OdService {

    @Autowired
    private odRepository odRepo; // Removed the 'dRepository' typo

    public OdRequest applyOd(OdRequest request) {
        request.setStatus("PENDING");
        return odRepo.save(request);
    }

    public List<OdRequest> getStudentHistory(String regNo) {
        return odRepo.findByRegNo(regNo);
    }

    public OdRequest updateStatus(Long id, String status, String reason) {
        OdRequest od = odRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("OD Request not found"));
        
        od.setStatus(status);
        od.setRejectionReason(reason);
        return odRepo.save(od);
    }
}
