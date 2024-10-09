package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Test {

    @Column(name = "Rm", nullable = true)
    private String Rm;

    @Column(name = "Rp02", nullable = true)
    private String Rp02;

    @Column(name = "A50", nullable = true)
    private String A50;

    @Column(name = "HRB", nullable = true)
    private String HRB;
}