package com.gid.gidassistant.services;

import com.gid.gidassistant.model.Interest;
import com.gid.gidassistant.model.repositories.InterestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestsService {

    @Autowired
    private InterestsRepository interestsRepository;

    public List<Interest> getAll() {
        return interestsRepository.findAll();
    }

    public boolean addInterest(Interest interest) {
        try{
            if(interestsRepository.existsByName(interest.getName()))
                return false;
            interestsRepository.save(interest);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
