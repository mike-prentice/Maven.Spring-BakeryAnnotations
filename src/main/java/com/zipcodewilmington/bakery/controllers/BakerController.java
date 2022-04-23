package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.services.BakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BakerController {
    @Autowired
    private BakerService service;

    public BakerController(BakerService service) {
        this.service = service;
    }
@GetMapping
    public ResponseEntity<Iterable<Baker>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }
@GetMapping
    public ResponseEntity<Baker> show(@RequestParam Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
@PostMapping
    public ResponseEntity<Baker> create(Baker baker) {
        return new ResponseEntity<>(service.create(baker), HttpStatus.CREATED);
    }
@PutMapping
    public ResponseEntity<Baker> update(@PathVariable Long id, @PathVariable Baker baker) {
        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
    }
@DeleteMapping
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
