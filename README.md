# API REST - Gestión de Productos

API REST desarrollada con Spring Boot para gestionar un catálogo de productos.

## Tecnologías
- Java 25
- Spring Boot 3.4
- PostgreSQL
- Spring Data JPA
- Maven

## Endpoints

### Productos
- `GET /api/productos` - Listar todos los productos
- `GET /api/productos/{id}` - Obtener producto por ID
- `POST /api/productos` - Crear nuevo producto
- `PUT /api/productos/{id}` - Actualizar producto
- `DELETE /api/productos/{id}` - Eliminar producto

## Configuración

1. Crear base de datos PostgreSQL: `productos_db`
2. Configurar credenciales en `application.properties`
3. Ejecutar: `./mvnw spring-boot:run`

## Ejemplo de uso

**Crear producto:**
```json
POST /api/productos
{
  "nombre": "Laptop HP",
  "descripcion": "Laptop de 15 pulgadas",
  "precio": 15000.00,
  "stock": 10,
  "categoria": "Electrónica"
}
```