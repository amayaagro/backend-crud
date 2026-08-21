package com.maestria_arquitectura.backendcrud.service;

import com.maestria_arquitectura.backendcrud.model.Producto;
import com.maestria_arquitectura.backendcrud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    // Obtener un producto por ID
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    // Guardar un nuevo producto
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Actualizar un producto existente
    public Producto actualizar(Long id, Producto productoActualizado) {
        return productoRepository.findById(id)
                .map(productoExistente -> {
                    productoExistente.setNombre(productoActualizado.getNombre());
                    productoExistente.setDescripcion(productoActualizado.getDescripcion());
                    productoExistente.setPrecio(productoActualizado.getPrecio());
                    return productoRepository.save(productoExistente);
                }).orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
    }

    // Eliminar un producto
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}