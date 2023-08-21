package edu.icet.controller;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping
    public Iterable<StudentEntity> getStudent(String name){
        return service.getStudent();
    }

    @GetMapping("/{firstName}")
    public Iterable<StudentEntity> getStudentByFirstName(@PathVariable
                                                             String firstName){
        return service.getStudentByFirstName(firstName);
    }

    @GetMapping("/{firstName}/{lastName}")
    public Iterable<StudentEntity> getStudentByFirstNameAndLastName(@PathVariable
                                                             String firstName,
                                                                   @PathVariable
                                                                   String lastName){

        return service.getStudentByFistNameAndLastName(firstName,lastName);
    }

    @PostMapping
    public void createStatement(@RequestBody Student student){
        service.createStudent(student);
    }

    @DeleteMapping("/{firstName}")
    public long deleteByFirstName(@PathVariable String firstName){
        return service.deleteByFirstName(firstName);
    }


}
