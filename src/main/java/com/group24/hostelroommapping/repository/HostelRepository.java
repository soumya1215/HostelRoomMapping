package com.group24.hostelroommapping.repository;

import com.group24.hostelroommapping.models.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {
}

