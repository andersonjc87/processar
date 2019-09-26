package com.yoda.movement.colletion.ted.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yoda.movement.colletion.ted.entities.MovementColletionEntity;
import com.yoda.movement.colletion.ted.repositories.MovementColletionRepository;

@Service
public class MovementColletionService {
    
    @Autowired
    private MovementColletionRepository repository;
    
    public Page<MovementColletionEntity> getAll(Pageable pageable) {
		return repository.findAll(pageable);
	
	}
	
	public MovementColletionEntity get(Long movColletionId) {
		Optional<MovementColletionEntity> colletionOp = repository.findById(movColletionId);
		
		if(colletionOp.isPresent()) {
			return colletionOp.get();
		}
		
		return null;
	}
	
}
