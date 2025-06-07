package com.maxiguias.maxigestion.maxigestion.repositorio;

import com.maxiguias.maxigestion.maxigestion.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Consulta nativa para obtener datos del objeto Oracle
    @Query(value = """
        SELECT
            u.documento,
            u.primer_apellido,
            u.segundo_apellido,
            u.usuario,
            u.contrasena,
            u.tipo_usuario,
            u.perfiles_id_perfil,
            u.info_persona.nombre as nombre,
            u.info_persona.direccion as direccion,
            TO_CHAR(u.info_persona.telefono) as telefono
        FROM usuarios u
        ORDER BY u.documento
        """, nativeQuery = true)
    List<Object[]> findAllUsuariosWithObjectData();
}
