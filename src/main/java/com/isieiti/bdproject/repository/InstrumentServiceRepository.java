package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.InstrumentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentServiceRepository extends JpaRepository<InstrumentService, Long> {
}
