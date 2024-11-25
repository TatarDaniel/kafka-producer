package com.apx.kafka.producer.repository;

import com.apx.kafka.producer.model.InfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<InfoEntity,Long> {
}
