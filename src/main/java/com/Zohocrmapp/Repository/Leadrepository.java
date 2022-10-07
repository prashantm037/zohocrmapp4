package com.Zohocrmapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Zohocrmapp.Entity.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
