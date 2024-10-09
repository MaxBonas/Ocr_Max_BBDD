package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Composicion {

    @Column(name = "c", nullable = true)
    private String C;

    @Column(name = "cr", nullable = true)
    private String CR;

    @Column(name = "mn", nullable = true)
    private String MN;

    @Column(name = "ni", nullable = true)
    private String NI;

    @Column(name = "p", nullable = true)
    private String P;

    @Column(name = "s", nullable = true)
    private String S;

    @Column(name = "si", nullable = true)
    private String SI;

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public BigDecimal getCr() {
        return cr;
    }

    public void setCr(BigDecimal cr) {
        this.cr = cr;
    }

    public BigDecimal getMn() {
        return mn;
    }

    public void setMn(BigDecimal mn) {
        this.mn = mn;
    }

    public BigDecimal getNi() {
        return ni;
    }

    public void setNi(BigDecimal ni) {
        this.ni = ni;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public BigDecimal getSi() {
        return si;
    }

    public void setSi(BigDecimal si) {
        this.si = si;
    }

    // Getters y setters
}
