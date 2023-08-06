package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service

public class StudentServiceImpl implements StudentService{
    public ArrayList<Student> getStudent(){

        ArrayList<Student> list= new ArrayList();

        list.add(new Student("Frank","ICET"));
        list.add(new Student("Thilina","ICET"));
        list.add(new Student("Thilina","ICET"));

        return list;
    }
}
