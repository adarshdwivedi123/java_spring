package com.genie.JPARestAPiDB.controller;

import com.genie.JPARestAPiDB.entity.Student;
import com.genie.JPARestAPiDB.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("api/std")
public class StudentController {
    @Autowired
    private  StudentService service;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student>getAllStudents()
    {
        List<Student>allStudentData = service.getAllStudentData();
        return  allStudentData;
    }
//    http://localhost:8080/api/std/2
//    @GetMapping("/{id}")
//    public Optional<Student> getStudentById(@PathVariable Integer id){
//            return  service.getStudentById(id);
//    }

    //one more way
//isme api std tk uthaye ga
//    http://localhost:8080/api/std?id=1
    @GetMapping
    public Optional<Student> getStudentById(@RequestParam Integer id){
        return  service.getStudentById(id);
    }


//    @GetMapping,
//    public Optional<Student> getStudentById(@RequestParam Integer id ,@RequestParam String name){
//        return  service.getStudentById(id);
//    }
//

    //update krne ke  liye hm student ka object lneeg nr
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id , @RequestBody Student student)
    {
        Student updatedStudent = service.updateStudent(id,student);
        return  updatedStudent;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        try {
            service.deleteStudent(id);
            return ResponseEntity.ok("Student deleted successfully");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
