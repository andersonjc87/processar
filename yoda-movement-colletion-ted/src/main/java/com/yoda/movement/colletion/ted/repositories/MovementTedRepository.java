package com.yoda.movement.colletion.ted.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoda.movement.colletion.ted.entities.MovementTedEntity;

@Repository
public interface MovementTedRepository extends JpaRepository<MovementTedEntity, Long> {

}
