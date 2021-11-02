package com.group24.hostelroommapping.repository;

import com.group24.hostelroommapping.models.HostelStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelStatusRepository extends JpaRepository<HostelStatus, Long> {
}
