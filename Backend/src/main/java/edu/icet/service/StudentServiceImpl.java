package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentrepository;

    @Value("${student.institute}")
    String institute;


    public Iterable<StudentEntity> getStudent(){
      return studentrepository.findAll();
    }

    public void createStudent(Student student){
        StudentEntity studentEntity= new StudentEntity();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        studentEntity.setBatch(student.getBatch());
        studentEntity.setInstitute(institute);
        studentrepository.save(studentEntity);

    }

    @Override
    public Iterable<StudentEntity> getStudentByFirstName(String firstName) {
        return studentrepository.findByFirstName(firstName);
    }

    @Override
    public Iterable<StudentEntity> getStudentByFistNameAndLastName(String firstName, String lastName) {
        return studentrepository.findByFirstNameAndLastName(firstName,lastName);
    }

    @Override
    public long deleteByFirstName(String firstName){
        return studentrepository.deleteByFirstName(firstName);


    }


}
