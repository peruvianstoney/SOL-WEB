package com.example.proyecto.web.grupo1.roles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
@Table(name="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String cargo;
}
