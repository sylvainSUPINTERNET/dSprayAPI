package com.dspray.api.repositories;

import com.dspray.api.collections.Announce;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncesRepository extends MongoRepository<Announce, String> {

    // public Customer findByFirstName(String firstName);
    // public List<Customer> findByLastName(String lastName);
  
  }