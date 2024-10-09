package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Dimension {

    @Column(name = "thickness", nullable = true)
    private BigDecimal thickness;

    @Column(name = "width", nullable = true)
    private BigDecimal width;

    @Column(name = "length", nullable = true)
    private BigDecimal length;

    public BigDecimal getThickness() {
        return thickness;
    }

    public void setThickness(BigDecimal thickness) {
        this.thickness = thickness;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    // Getters y setters
}