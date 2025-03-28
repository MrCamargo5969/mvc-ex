package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Database;

public interface Repository extends CrudRepository<Database, Long> {
    
}
