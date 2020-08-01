package com.gid.gidassistant.controllers;

import com.gid.gidassistant.model.Interest;
import com.gid.gidassistant.services.InterestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/interests")
public class InterestsController {

    @Autowired
    private InterestsService service;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllInterests() {
        try {
            return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
        } catch (InternalError | Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> addInterest(@RequestHeader("token") String token,
                                         @RequestBody Interest interest){
        try {
            if(service.addInterest(interest))
                return new ResponseEntity<>(HttpStatus.OK);
            return new ResponseEntity<>("Interest with such name already exists!", HttpStatus.CONFLICT);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*@DeleteMapping("/delete")
    public ResponseEntity<?> deleteInterest() {
        return
    }*/
}
