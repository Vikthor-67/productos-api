package API_REST.productos_api.servicio;

import API_REST.productos_api.modelo.Producto;
import API_REST.productos_api.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    //obtener todos los productor
    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }

    //obtener un producto por ID
    public Optional<Producto> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    //crear o actualizar un producto
    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    //eliminar un producto
    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }
}