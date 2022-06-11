package com.longapi.business.repository;

import com.longapi.business.dao.StudentDao;
import com.longapi.business.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>, StudentDao {

}
