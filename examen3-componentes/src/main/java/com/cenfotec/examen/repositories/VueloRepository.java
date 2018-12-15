package com.cenfotec.examen.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.examen.entities.Vuelo;

public interface VueloRepository extends MongoRepository<Vuelo, String> {
}
