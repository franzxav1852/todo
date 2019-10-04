package com.everis.springbootjprexamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjprexamen.model.Description;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, Integer>{

}
