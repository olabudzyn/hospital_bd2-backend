package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.PerioperativeRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerioperativeRoomRepository extends JpaRepository<PerioperativeRoom, Long> {
}
