package br.com.alineavila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alineavila.data.vo.PersonVO;
import br.com.alineavila.services.PersonVOService;

@RestController
@RequestMapping("/PersonVO")
public class PersonControler {

	@Autowired
	private PersonVOService services;

	@GetMapping
	public List<PersonVO> findAll() {
		return services.findAll();
	}

	@GetMapping("/{id}")
	public PersonVO findById(@PathVariable("id") Long id) {
		return services.findById(id);
	}

	@PostMapping
	public PersonVO create(@RequestBody PersonVO PersonVO) {
		return services.create(PersonVO);
	}

	@PutMapping
	public PersonVO update(@RequestBody PersonVO PersonVO) {
		return services.update(PersonVO);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?>  delete(@PathVariable("id") Long id) {
		services.delete(id);
		return ResponseEntity.ok().build();
	}

}
