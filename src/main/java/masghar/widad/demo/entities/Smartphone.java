package masghar.widad.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private String brand;

    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    // Constructors, getters, and setters

    public Smartphone() {
    }

    public Smartphone(String serialNumber, String brand, LocalDate releaseDate, Status status) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.releaseDate = releaseDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Enum for status
    public enum Status {
        AVAILABLE,
        BORROWED
    }
}
