package com.maxiguias.maxigestion.maxigestion.modelo;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "TERMINADOS")
@Data
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

}
