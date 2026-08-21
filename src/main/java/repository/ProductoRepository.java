package com.maestria_arquitectura.backendcrud.repository;

import com.maestria_arquitectura.backendcrud.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Hereda todos los métodos CRUD: save(), findAll(), findById(), deleteById(), etc.
}