package com.salon.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salon.java.entity.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon, String > {

}
