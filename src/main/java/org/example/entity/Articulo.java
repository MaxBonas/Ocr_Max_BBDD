package org.example.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "proveedor", nullable = true)
    private String proveedor;

    @Column(name = "our_order_n", nullable = false)
    private String ourOrderN;

    @Column(name = "your_order_n", nullable = true)
    private String yourOrderN;

    @Column(name = "grade", nullable = true)
    private String grade;

    @Column(name = "finish", nullable = true)
    private String finish;

    @Column(name = "coil_box", nullable = true)
    private String coilBox;

    // Dimensiones embebidas
    @Embedded
    private Dimension dimension;

    // Cantidad puede ser una lista de valores (corrigiendo el tipo de dato a List<String>)
    @ElementCollection
    @CollectionTable(name = "cantidad", joinColumns = @JoinColumn(name = "articulo_id"))
    @Column(name = "cantidad")
    private List<String> quantity;

    // Composición embebida
    @Embedded
    private Composicion composicion;

    // Propiedades Mecánicas embebidas
    @Embedded
    private PropiedadesMecanicas propiedadesMecanicas;

    // Observaciones (remarks) como lista de strings
    @ElementCollection
    @CollectionTable(name = "remarks", joinColumns = @JoinColumn(name = "articulo_id"))
    @Column(name = "remark")
    private List<String> remarks;

    // Resultado de la inspección
    @Column(name = "inspection_result", nullable = true)
    private String inspectionResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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

    public List<String> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<String> quantity) {
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

    public List<String> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<String> remarks) {
        this.remarks = remarks;
    }

    public String getInspectionResult() {
        return inspectionResult;
    }

    public void setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
    }
}
