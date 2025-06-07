package com.maxiguias.maxigestion.maxigestion.repositorio;

import com.maxiguias.maxigestion.maxigestion.modelo.Terminado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TerminadoRepository extends JpaRepository<Terminado, Long> {

    @Query("SELECT t FROM Terminado t WHERE t.idProducto = :productoId")
    List<Terminado> findByProductoId(@Param("productoId") Long productoId);
}
