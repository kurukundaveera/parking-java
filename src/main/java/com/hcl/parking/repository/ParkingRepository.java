package com.hcl.parking.repository;
/***
 * @author Anuradha
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.Parking;
import java.lang.Integer;
import java.util.List;
@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {
	
	List<Parking> findByUserId(Integer userid);

}
