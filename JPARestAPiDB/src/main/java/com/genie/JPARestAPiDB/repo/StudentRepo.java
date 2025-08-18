package com.genie.JPARestAPiDB.repo;

import com.genie.JPARestAPiDB.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer> {

//
//#)JPA ake interface run time pe jvm ki responsibility it give functionality
//            jitni bhi predefine method hai database sec communicate  ki voe hmre Student repo me  ajye ga


}
