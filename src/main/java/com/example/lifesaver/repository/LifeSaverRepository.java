package com.example.lifesaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lifesaver.model.BloodRegistration;

@Repository
public interface LifeSaverRepository extends  JpaRepository<BloodRegistration, Long>  {

}
