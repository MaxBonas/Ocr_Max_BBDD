package org.example.entity;

import jakarta.persistence.*;

@Embeddable
public class PropiedadesMecanicas {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "Rm", column = @Column(name = "Rm_test1")),
            @AttributeOverride(name = "Rp02", column = @Column(name = "Rp02_test1")),
            @AttributeOverride(name = "A50", column = @Column(name = "A50_test1")),
            @AttributeOverride(name = "HRB", column = @Column(name = "HRB_test1"))
    })
    private Test test1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "Rm", column = @Column(name = "Rm_test2")),
            @AttributeOverride(name = "Rp02", column = @Column(name = "Rp02_test2")),
            @AttributeOverride(name = "A50", column = @Column(name = "A50_test2")),
            @AttributeOverride(name = "HRB", column = @Column(name = "HRB_test2"))
    })
    private Test test2;

    // Getters y setters
}
