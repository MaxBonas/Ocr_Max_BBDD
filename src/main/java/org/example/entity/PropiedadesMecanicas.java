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

    public Test getTest1() {
        return test1;
    }

    public void setTest1(Test test1) {
        this.test1 = test1;
    }

    public Test getTest2() {
        return test2;
    }

    public void setTest2(Test test2) {
        this.test2 = test2;
    }

    // Getters y setters
}
