package com.genie.JPARestAPiDB.services;

import com.genie.JPARestAPiDB.entity.Student;
import com.genie.JPARestAPiDB.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
// iski implmentiaon run time pe dega jpa
    private StudentRepo studentRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudentData() {
        List<Student> list = studentRepo.findAll();
        return list;
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    public Student updateStudent(Integer id, @RequestBody Student student) {
        Optional<Student> studentId = studentRepo.findById(id);
        Student stud = null;
        if (studentId.isPresent()) {
            Student dbStudentObject = studentId.get();
            dbStudentObject.setAge(student.getAge());
            dbStudentObject.setEmail(student.getEmail());
            dbStudentObject.setName(student.getName());
            stud = studentRepo.save(dbStudentObject);
        } else {
            System.out.println("Data not present in db");
        }
        return stud;
    }
//     public Student deleteStudent(Integer id){
//           Student deleteStudent =studentRepo.deleteById(id);
//     }
//}
}