package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.RoomService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomServiceRepository extends JpaRepository<RoomService, Long> {
}
