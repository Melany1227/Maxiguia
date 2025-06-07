package com.maxiguias.maxigestion.maxigestion.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "FACTURAS")
@Data
public class Factura {
    @Id
    @Column(name = "ID_FACTURA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_EMPRESA")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "DOCUMENTO_USUARIO")
    private Usuario usuario;

    @Column(name = "FIRMA_DIGITAL")
    private String firmaDigital;

    @Column(name = "FECHA_VENTA")
    private LocalDate fechaVenta;

    @Column(name = "DESCRIPCION_VENTA")
    private String descripcionVenta;

    @Column(name = "TOTAL_FACTURA")
    private BigDecimal totalFactura;

    @ManyToOne
    @JoinColumn(name = "ID_CUIDAD")
    private Ciudad ciudad;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles;

}
