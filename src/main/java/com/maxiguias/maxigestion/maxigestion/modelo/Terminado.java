package com.maxiguias.maxigestion.maxigestion.modelo;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TERMINADOS")
public class Terminado {

    @Id
    @Column(name = "ID_TERMINADO")
    private Long id;

    @Column(name = "ID_PRODUCTO")
    private Long idProducto;

    @Column(name = "MEDIDA_TERMINADO_PRODUCTO")
    private BigDecimal medidaTerminadoProducto;

    @Column(name = "PRECIO_PUBLICO")
    private BigDecimal precioPublico;

    @Column(name = "PRECIO_X_MAYOR")
    private BigDecimal precioXMayor;

    @Column(name = "PRECIO_X_ENCARGO")
    private BigDecimal precioXEncargo;

    // Constructor vacío
    public Terminado() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getMedidaTerminadoProducto() {
        return medidaTerminadoProducto;
    }

    public void setMedidaTerminadoProducto(BigDecimal medidaTerminadoProducto) {
        this.medidaTerminadoProducto = medidaTerminadoProducto;
    }

    public BigDecimal getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(BigDecimal precioPublico) {
        this.precioPublico = precioPublico;
    }

    public BigDecimal getPrecioXMayor() {
        return precioXMayor;
    }

    public void setPrecioXMayor(BigDecimal precioXMayor) {
        this.precioXMayor = precioXMayor;
    }

    public BigDecimal getPrecioXEncargo() {
        return precioXEncargo;
    }

    public void setPrecioXEncargo(BigDecimal precioXEncargo) {
        this.precioXEncargo = precioXEncargo;
    }

    @Override
    public String toString() {
        return "Terminado{" +
                "id=" + id +
                ", idProducto=" + idProducto +
                ", medidaTerminadoProducto=" + medidaTerminadoProducto +
                ", precioPublico=" + precioPublico +
                '}';
    }
}
