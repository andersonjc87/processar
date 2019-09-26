package com.yoda.movement.colletion.ted.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yoda.movement.colletion.ted.entities.MovementTedEntity;
import com.yoda.movement.colletion.ted.services.MovementTedService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path="/movementColletionTed")
public final class MovementTedResource {

	@Autowired
	private MovementTedService service;
	
	@ResponseBody
	@GetMapping(path = "/ted")
    @ApiOperation(value = "Data search movemento ted")
    public ResponseEntity<?> getAll(Pageable pageable) {   	
    	
		Page<MovementTedEntity> subEmitters = service.getAll(pageable);
		
		if(subEmitters == null) {
			return (ResponseEntity<?>) ResponseEntity.noContent();
		}
		return ResponseEntity.ok(subEmitters);
	
    }
    
	@ResponseBody
	@ApiOperation(value = "Data search movemento ted by Id")
	@GetMapping(path = "/ted/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {   	
   
		MovementTedEntity subEmitter = service.get(id);
		
		if(subEmitter == null) {
			return ResponseEntity.noContent()
							     .build();
		}
		return ResponseEntity.ok(subEmitter);
	
    }
    
}
