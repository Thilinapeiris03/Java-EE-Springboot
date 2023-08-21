package edu.icet.repository;

import edu.icet.dao.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

    Iterable<StudentEntity> findByFirstName(String firstName);

    Iterable<StudentEntity> findByFirstNameAndLastName(String firstName, String lastName);

    long deleteByFirstName(String firstName);

}

