package com.longapi.business.repository;

import com.longapi.business.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepo extends JpaRepository<ClassRoom,Integer> {
}
