package com.testwpl.www.testwpl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Person {
    @Id
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
