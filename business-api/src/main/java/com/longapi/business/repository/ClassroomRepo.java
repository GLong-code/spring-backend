package com.longapi.business.repository;

import com.longapi.business.dao.ClassroomDao;
import com.longapi.business.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ClassroomRepo extends JpaRepository<ClassRoom,Integer>, ClassroomDao {
}
