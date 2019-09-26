package com.yoda.movement.colletion.ted.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.yoda.movement.colletion.ted.entities.MovementTedEntity;
import com.yoda.movement.colletion.ted.repositories.MovementTedRepository;

import org.springframework.data.domain.Pageable;

@Service
public class MovementTedService {

	@Autowired
	private	MovementTedRepository repository;
	
	public Page<MovementTedEntity> getAll(Pageable pageable) {
		return repository.findAll(pageable);
	
	}
	
	public MovementTedEntity get(Long subEmitterId) {
		Optional<MovementTedEntity> subEmitterOp = repository.findById(subEmitterId);
		
		if(subEmitterOp.isPresent()) {
			return subEmitterOp.get();
		}
		
		return null;
	}
}
