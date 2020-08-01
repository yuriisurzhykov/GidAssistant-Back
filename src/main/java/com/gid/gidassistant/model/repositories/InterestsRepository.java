package com.gid.gidassistant.model.repositories;

import com.gid.gidassistant.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestsRepository extends JpaRepository<Interest, Integer> {
    boolean existsByName(String name);
}
