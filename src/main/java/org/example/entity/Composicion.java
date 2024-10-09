package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Composicion {

    @Column(name = "c", nullable = true)
    private BigDecimal C;

    @Column(name = "cr", nullable = true)
    private BigDecimal CR;

    @Column(name = "mn", nullable = true)
    private BigDecimal MN;

    @Column(name = "ni", nullable = true)
    private BigDecimal NI;

    @Column(name = "p", nullable = true)
    private BigDecimal P;

    @Column(name = "s", nullable = true)
    private BigDecimal S;

    @Column(name = "si", nullable = true)
    private BigDecimal SI;

    public BigDecimal getC() {
        return C;
    }

    public void setC(BigDecimal c) {
        C = c;
    }

    public BigDecimal getCR() {
        return CR;
    }

    public void setCR(BigDecimal CR) {
        this.CR = CR;
    }

    public BigDecimal getMN() {
        return MN;
    }

    public void setMN(BigDecimal MN) {
        this.MN = MN;
    }

    public BigDecimal getNI() {
        return NI;
    }

    public void setNI(BigDecimal NI) {
        this.NI = NI;
    }

    public BigDecimal getP() {
        return P;
    }

    public void setP(BigDecimal p) {
        P = p;
    }

    public BigDecimal getS() {
        return S;
    }

    public void setS(BigDecimal s) {
        S = s;
    }

    public BigDecimal getSI() {
        return SI;
    }

    public void setSI(BigDecimal SI) {
        this.SI = SI;
    }
}
