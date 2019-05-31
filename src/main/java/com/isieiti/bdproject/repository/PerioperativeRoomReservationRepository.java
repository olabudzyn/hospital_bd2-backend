package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.PerioperativeRoomReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerioperativeRoomReservationRepository extends JpaRepository<PerioperativeRoomReservation, Long> {
}
