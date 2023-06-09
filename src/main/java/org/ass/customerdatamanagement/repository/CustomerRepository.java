package org.ass.customerdatamanagement.repository;

import java.util.List;

import org.ass.customerdatamanagement.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

    List<CustomerEntity> findByName(String name);
    
    @Query("select c FROM CustomerEntity WHERE c.name=:name AND c.email=:email ")
    List<CustomerEntity>validate(@Param("name") String name,@Param("email")String email);
    
}
