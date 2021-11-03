package br.com.alineavila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alineavila.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
