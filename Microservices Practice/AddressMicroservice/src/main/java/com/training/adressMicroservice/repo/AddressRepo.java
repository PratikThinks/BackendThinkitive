package com.training.adressMicroservice.repo;

import com.training.adressMicroservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

    @Query(nativeQuery = true, value = "select ma.id,ma.lane_1,ma.pincode,ma.state,ma.employee_id from microservises.employee as me join microservises.address as ma on me.id = ma.employee_id where me.id=:employeeid")
    Address findAdressByEmployeeId(@Param("employeeid") int employeeId);
}
