package com.gabryelmorais.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabryelmorais.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
