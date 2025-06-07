package com.maxiguias.maxigestion.maxigestion.repositorio;

import com.maxiguias.maxigestion.maxigestion.modelo.Terminado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TerminadoRepository extends JpaRepository<Terminado, Long> {

    // Consulta nativa para asegurar que funcione con Oracle
    @Query(value = "SELECT * FROM terminados WHERE id_producto = :productoId", nativeQuery = true)
    List<Terminado> findByProductoId(@Param("productoId") Long productoId);

    // Método alternativo para debugging
    @Query("SELECT t FROM Terminado t WHERE t.idProducto = :productoId")
    List<Terminado> findByProductoIdJPQL(@Param("productoId") Long productoId);
}
