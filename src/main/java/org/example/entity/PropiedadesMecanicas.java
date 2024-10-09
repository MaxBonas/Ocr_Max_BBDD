package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PropiedadesMecanicas {

    @Column(name = "rm")
    private String rm;

    @Column(name = "rp02")
    private String rp02;

    @Column(name = "a50")
    private String a50;

    @Column(name = "hrb")
    private String hrb;

    // Getters y setters
}
