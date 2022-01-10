package Aufgabe1;

import java.util.Objects;

public class Offerte {

    private Integer id;
    private String unternehmensname;
    private Double preis;
    private Double mehrwertsteuer;
    private String adresse;
    private Ort ort;

    public Offerte(Integer id, String unternehmensname, Double preis, Double mehrwertsteuer, String adresse, Ort ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.preis = preis;
        this.mehrwertsteuer = mehrwertsteuer;
        this.adresse = adresse;
        this.ort = ort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public Double getMehrwertsteuer() {
        return mehrwertsteuer;
    }

    public void setMehrwertsteuer(Double mehrwertsteuer) {
        this.mehrwertsteuer = mehrwertsteuer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offerte offerten)) return false;
        return Objects.equals(getId(), offerten.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Offerten{" +
                "id=" + id +
                ", unternehmensname='" + unternehmensname + '\'' +
                ", preis=" + preis +
                ", mehrwertsteuer=" + mehrwertsteuer +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }
}
