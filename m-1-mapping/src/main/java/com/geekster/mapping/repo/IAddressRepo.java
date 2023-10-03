package com.geekster.mapping.repo;

import com.geekster.mapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAddressRepo extends JpaRepository<Address,Integer> {

    @Query(value = "select * from address where address_id =:addressId",nativeQuery = true)
    Address getAddressById(Integer addressId);
}
