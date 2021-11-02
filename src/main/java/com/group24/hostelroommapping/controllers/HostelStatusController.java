package com.group24.hostelroommapping.controllers;

import com.group24.hostelroommapping.models.HostelStatus;
import com.group24.hostelroommapping.repository.HostelStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class HostelStatusController {

    @Autowired
    private HostelStatusRepository hostelStatusRepository;

    @GetMapping("/hostelstatus")
    public List<HostelStatus> getAllHostelStatus() {return hostelStatusRepository.findAll();}

    @PostMapping("/hostelstatus")
    public HostelStatus createHostelStatus (@RequestBody HostelStatus hostelStatus) {return hostelStatusRepository.save(hostelStatus);}

    @GetMapping("/hostelstatus/{id}")
    public ResponseEntity<HostelStatus> getHostelById(@PathVariable Long id){
        HostelStatus hostelStatus = hostelStatusRepository.findById(id).orElseThrow();
        return  ResponseEntity.ok(hostelStatus);
    }

    @PutMapping("/hostelstatus/{id}")
    public ResponseEntity<HostelStatus> updateHostelStatus(@PathVariable Long id, @RequestBody HostelStatus hostelStatusDetails){
        HostelStatus hostelStatus = hostelStatusRepository.findById(id).orElseThrow();
        hostelStatus.setAvailableBed(hostelStatusDetails.getAvailableBed());
        hostelStatus.setFeature(hostelStatusDetails.getFeature());
        hostelStatus.setHostelType(hostelStatusDetails.getHostelType());
        hostelStatus.setRoomNo(hostelStatusDetails.getRoomNo());
        HostelStatus updatedHostelStatus = hostelStatusRepository.save(hostelStatus);
        return ResponseEntity.ok(updatedHostelStatus);
    }

    @DeleteMapping("/hostelstatus/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteHostelStatus(@PathVariable Long id){
        HostelStatus hostelStatus = hostelStatusRepository.findById(id).orElseThrow();
        hostelStatusRepository.delete(hostelStatus);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
