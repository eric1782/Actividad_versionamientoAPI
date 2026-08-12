# Actividad: Versionando Mi Código

Microservicio básico construido con Spring Boot, desarrollado como parte de la actividad de versionado semántico con Git.

## 🚀 Tecnologías

- Java 17
- Spring Boot 3.x
- Maven

## 📋 Requisitos previos

- JDK 17 instalado
- Maven (o usar el wrapper incluido `mvnw` / `mvnw.cmd`)

## ▶️ Cómo ejecutar el proyecto

Desde la raíz del proyecto:

```bash
./mvnw spring-boot:run
```

En Windows (PowerShell):

```powershell
.\mvnw.cmd spring-boot:run
```

La aplicación quedará disponible en `http://localhost:8080`.

## 📡 Endpoints disponibles

### GET /api/status

Devuelve el estado del microservicio.

**Respuesta ejemplo:**
```json
{
  "status": "OK",
  "message": "Microservicio funcionando correctamente"
}
```

### POST /api/sum

Recibe dos números y devuelve su suma.

**Body esperado:**
```json
{
  "a": 5,
  "b": 3
}
```

**Respuesta exitosa:**
```json
{
  "a": 5,
  "b": 3,
  "result": 8
}
```

**Respuesta si falta algún campo (400 Bad Request):**
```json
{
  "error": "Los campos 'a' y 'b' son obligatorios"
}
```

## 📝 Historial de versionado semántico

| Commit | Tipo | Versión | Descripción |
|--------|------|---------|-------------|
| 1 | `feat` | 1.0.0 | Creación del microservicio y endpoint GET /api/status |
| 2 | `feat` | 1.1.0