package com.example.tablecreation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tablecreation.entity.contact;

@Repository
public interface contactrepository extends JpaRepository<contact, Long> {

}
