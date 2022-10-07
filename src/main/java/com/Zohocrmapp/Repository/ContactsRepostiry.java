package com.Zohocrmapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Zohocrmapp.Entity.Contacts;

public interface ContactsRepostiry extends JpaRepository<Contacts, Long> {

}
