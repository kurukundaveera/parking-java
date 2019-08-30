package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.ParkingAllocation;
import java.lang.Integer;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface ParkingAllocationRepository extends JpaRepository<ParkingAllocation, Integer>{
	
	
List<ParkingAllocation> findByParkingIdAndAvailableDate(Integer parkingid,LocalDate availableDate);
}
