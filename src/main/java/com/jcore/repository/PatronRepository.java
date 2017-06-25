package com.jcore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jcore.model.Patron;

@Repository
public interface PatronRepository extends MongoRepository<Patron, String>{

}
