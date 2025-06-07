package com.maxiguias.maxigestion.maxigestion.controlador;

import com.maxiguias.maxigestion.maxigestion.modelo.Terminado;
import com.maxiguias.maxigestion.maxigestion.repositorio.TerminadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TerminadoRestController {

    @Autowired
    private TerminadoRepository terminadoRepository;

    @GetMapping("/productos/{productoId}/terminados")
    public List<Terminado> getTerminadosByProducto(@PathVariable Long productoId) {
        System.out.println("Buscando terminados para producto ID: " + productoId);
        List<Terminado> terminados = terminadoRepository.findByProductoId(productoId);
        System.out.println("Terminados encontrados: " + terminados.size());
        return terminados;
    }
}
