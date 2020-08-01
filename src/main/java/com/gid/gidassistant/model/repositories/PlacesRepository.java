package com.gid.gidassistant.model.repositories;

import com.gid.gidassistant.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacesRepository extends JpaRepository<Place, Integer> {
}
