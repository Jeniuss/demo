package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
@Table(name = "experimental", schema = "plant")
public class ExperimentalEntity {
    private Long id;
    private Double temperature;
    private Double humidityAir;
    private Double humiditySoil;
    private Double potSize;
    private Double water;
    private Double humidityAfter;
    private Double increasingHumidity;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperimentalEntity that = (ExperimentalEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(temperature, that.temperature) && Objects.equals(humidityAir, that.humidityAir) && Objects.equals(humiditySoil, that.humiditySoil) && Objects.equals(potSize, that.potSize) && Objects.equals(water, that.water) && Objects.equals(humidityAfter, that.humidityAfter) && Objects.equals(increasingHumidity, that.increasingHumidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, humidityAir, humiditySoil, potSize, water, humidityAfter, increasingHumidity);
    }
}
