package com.maxiguias.maxigestion.maxigestion.controlador;

import com.maxiguias.maxigestion.maxigestion.modelo.Producto;
import com.maxiguias.maxigestion.maxigestion.modelo.Terminado;
import com.maxiguias.maxigestion.maxigestion.repositorio.TerminadoRepository;
import com.maxiguias.maxigestion.maxigestion.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TerminadoRestController {

    @Autowired
    private TerminadoRepository terminadoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/productos/{productoId}/terminados")
    public List<Terminado> getTerminadosByProducto(@PathVariable Long productoId) {
        System.out.println("=== CONTROLADOR REST ===");
        System.out.println("Buscando terminados para producto ID: " + productoId);

        try {
            List<Terminado> terminados = terminadoRepository.findByProductoId(productoId);
            System.out.println("Terminados encontrados: " + terminados.size());

            for (Terminado terminado : terminados) {
                System.out.println("Terminado ID: " + terminado.getId() +
                        ", Medida: " + terminado.getMedidaTerminadoProducto() +
                        ", Precio Público: " + terminado.getPrecioPublico());
            }

            return terminados;
        } catch (Exception e) {
            System.err.println("Error al buscar terminados: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/productos/all")
    public List<Producto> getAllProductos() {
        System.out.println("=== OBTENIENDO TODOS LOS PRODUCTOS ===");
        try {
            List<Producto> productos = productoRepository.findAll();
            System.out.println("Productos encontrados: " + productos.size());
            return productos;
        } catch (Exception e) {
            System.err.println("Error al obtener productos: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
