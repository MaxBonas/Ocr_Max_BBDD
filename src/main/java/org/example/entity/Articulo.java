package org.example.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "our_order_n")
    private String ourOrderN;

    @Column(name = "your_order_n")
    private String yourOrderN;

    @Column(name = "grade")
    private String grade;

    @Column(name = "finish")
    private String finish;

    @Column(name = "coil_box")
    private String coilBox;

    @Embedded
    private Dimension dimension;

    @Column(name = "quantity")
    private Integer quantity;

    @Embedded
    private Composicion composicion;

    @Embedded
    private PropiedadesMecanicas propiedadesMecanicas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOurOrderN() {
        return ourOrderN;
    }

    public void setOurOrderN(String ourOrderN) {
        this.ourOrderN = ourOrderN;
    }

    public String getYourOrderN() {
        return yourOrderN;
    }

    public void setYourOrderN(String yourOrderN) {
        this.yourOrderN = yourOrderN;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getCoilBox() {
        return coilBox;
    }

    public void setCoilBox(String coilBox) {
        this.coilBox = coilBox;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Composicion getComposicion() {
        return composicion;
    }

    public void setComposicion(Composicion composicion) {
        this.composicion = composicion;
    }

    public PropiedadesMecanicas getPropiedadesMecanicas() {
        return propiedadesMecanicas;
    }

    public void setPropiedadesMecanicas(PropiedadesMecanicas propiedadesMecanicas) {
        this.propiedadesMecanicas = propiedadesMecanicas;
    }
}
