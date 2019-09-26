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

import com.yoda.movement.colletion.ted.entities.MovementColletionEntity;
import com.yoda.movement.colletion.ted.services.MovementColletionService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path="/movementColletionTed")
public final class MovementColletionResource {

	@Autowired
	private MovementColletionService service;
	
	@ResponseBody
	@GetMapping(path = "/colletion")
    @ApiOperation(value = "Data search movemento collection")
    public ResponseEntity<?> getAll(Pageable pageable) {   	
    	
		Page<MovementColletionEntity> colletion = service.getAll(pageable);
		
		if(colletion == null) {
			return (ResponseEntity<?>) ResponseEntity.noContent();
		}
		return ResponseEntity.ok(colletion);
	
    }
    
	@ResponseBody
    @GetMapping(path = "/colletion/{id}")
    @ApiOperation(value = "Data search movemento individual collection")
    public ResponseEntity<?> get(@PathVariable Long id) {   	
   
		MovementColletionEntity colletion = service.get(id);
		
		if(colletion == null) {
			return ResponseEntity.noContent()
							     .build();
		}
		return ResponseEntity.ok(colletion);
	
    }  

}
