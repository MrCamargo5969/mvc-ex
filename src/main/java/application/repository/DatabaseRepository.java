package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Database;

public interface DatabaseRepository extends CrudRepository<Database, Long> {
    
}
