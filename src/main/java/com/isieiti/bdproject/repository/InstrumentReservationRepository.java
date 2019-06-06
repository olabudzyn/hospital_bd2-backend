package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.InstrumentReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentReservationRepository extends JpaRepository<InstrumentReservation, Long> {
}
