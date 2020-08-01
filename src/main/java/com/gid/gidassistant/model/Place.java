package com.gid.gidassistant.model;

import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "place")
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String name;
}
