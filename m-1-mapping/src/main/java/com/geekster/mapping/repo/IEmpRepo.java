package com.geekster.mapping.repo;

import com.geekster.mapping.model.Address;
import com.geekster.mapping.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmpRepo extends JpaRepository<Emp,Long> {

    List<Emp> findByAddress(Address address);
@Modifying
@Query(value = "delete from emp where emp_id =:empId", nativeQuery = true)
    void deleteEmpById(Long empId);
}
