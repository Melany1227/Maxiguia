package com.maxiguias.maxigestion.maxigestion.repositorio;

import com.maxiguias.maxigestion.maxigestion.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Consulta nativa para asegurar que traiga todos los productos
    @Query(value = "SELECT * FROM productos ORDER BY nombre_guia", nativeQuery = true)
    List<Producto> findAllProductosNative();

    // Método por defecto
    @Query("SELECT p FROM Producto p ORDER BY p.nombre")
    List<Producto> findAllOrdered();
}

