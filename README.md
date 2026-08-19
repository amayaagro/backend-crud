# Backend CRUD - API RESTful con Spring Boot

## Descripción del Proyecto

Este proyecto es el backend de una aplicación web que implementa servicios **API REST** para realizar operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar) sobre una base de datos. Fue desarrollado como parte de la **Actividad Sumativa** de la Unidad 2 del módulo **Arquitectura de Aplicaciones Web** a nivel de maestría.

La API permite gestionar productos con los siguientes atributos:
- **id**: Identificador único (autogenerado)
- **nombre**: Nombre del producto
- **descripción**: Descripción breve
- **precio**: Valor numérico del producto

## Arquitectura de la Solución

El proyecto sigue una **arquitectura por capas (Layered Architecture)** que garantiza una clara separación de responsabilidades, facilitando el mantenimiento y la escalabilidad del código.

## Estructura de Paquetes
```
com.maestria_arquitectura.backendcrud/
├── controller/          # Controladores REST
│   ├── ProductoController.java
│   └── GlobalExceptionHandler.java  # Manejo global de errores
├── service/             # Lógica de negocio
│   └── ProductoService.java
├── repository/          # Acceso a datos (JPA)
│   └── ProductoRepository.java
└── model/               # Entidades / Modelo de datos
    └── Producto.java
```
## Tecnologías Utilizadas

| Tecnología          | Descripción                                                   |
|---------------------|---------------------------------------------------------------|
| **Spring Boot 3.2** | Framework para aplicaciones Java empresariales                |
| **Spring Data JPA** | ORM para acceso a datos (Hibernate) 		                      |
| **H2 Database**     | Base de datos en memoria para desarrollo                      |
| **Lombok**          | Reduce código boilerplate (getters, setters)                  |
| **Maven**           | Gestión de dependencias y construcción                        |
| **Java 21**         | Lenguaje de programación (LTS)                                |


## Endpoints de la API

| Método HTTP | Endpoint              | Descripción                      | Código de Éxito        |
|-------------|-----------------------|----------------------------------|------------------------|
| **POST**    | `/api/productos`      | Crear un nuevo producto          | 201 Created            |
| **GET**     | `/api/productos`      | Obtener todos los productos      | 200 OK                 |
| **GET**     | `/api/productos/{id}` | Obtener un producto por ID       | 200 OK / 404 Not Found |
| **PUT**     | `/api/productos/{id}` | Actualizar un producto existente | 200 OK / 404 Not Found |
| **DELETE**  | `/api/productos/{id}` | Eliminar un producto             | 204 No Content         |

## Requisitos Previos

JDK 17 o 21 (Descargar)
IntelliJ IDEA o cualquier IDE compatible
Postman o Insomnia para probar la API

## Características Destacadas

CRUD completo implementado con Spring Data JPA
Manejo global de errores con @ControllerAdvice
Inyección de dependencias usando @Autowired
Base de datos H2 para desarrollo rápido
Código limpio y organizado siguiendo principios SOLID
Arquitectura por capas fácilmente escalable
Respuestas HTTP con códigos de estado apropiados

**Nota:** Este proyecto fue desarrollado como parte de una actividad académica y no está destinado para uso en producción.
