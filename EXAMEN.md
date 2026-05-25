# Temario del Examen

Este documento detalla los aspectos clave que entran en el examen basándose en los documentos de `@docs` y los ejercicios implementados en `src`.

## 1. Álgebra Relacional (AR)
El examen cubre los fundamentos del modelo relacional y la manipulación de datos mediante operadores algebraicos:

- **Operadores Básicos:**
  - Selección ($\sigma$): Filtrar filas según una condición.
  - Proyección ($\pi$): Seleccionar columnas específicas.
  - Unión ($\cup$): Combinar resultados de dos consultas compatibles.
  - Intersección ($\cap$): Filas comunes en ambos conjuntos.
  - Diferencia ($-$) o ($ \setminus $): Filas presentes en un conjunto pero no en otro.
  - Producto Cartesiano ($\times$): Combinación de todas las filas de dos tablas.
- **Operadores de Join (Combinación):**
  - Join Natural ($\bowtie$): Unión basada en atributos con el mismo nombre.
  - Theta Join ($\bowtie_{\theta}$): Join con una condición específica.
  - Outer Joins (Left, Right, Full): Inclusión de filas que no tienen coincidencia.
- **Traducción:** Capacidad de convertir consultas de lenguaje natural a expresiones de AR y viceversa.

## 2. SQL (Structured Query Language)
Se enfoca en la creación, modificación y consulta de bases de datos relacionales (específicamente MySQL):

- **DDL (Data Definition Language):**
  - `ALTER TABLE`: Añadir (`ADD`), modificar (`ALTER/MODIFY`) o eliminar (`DROP`) columnas.
  - `CONSTRAINT`: Definición de restricciones (`UNIQUE`, `PRIMARY KEY`, `FOREIGN KEY`).
- **DML (Data Manipulation Language):**
  - `SELECT`: Consultas básicas y avanzadas.
  - `DISTINCT`: Eliminación de duplicados.
  - `WHERE`: Condiciones complejas con `AND`, `OR`, `BETWEEN`, `LIKE` (uso de `%` y `_`), `IS NULL`.
  - `ORDER BY`: Ordenación de resultados (`ASC`, `DESC`).
  - `JOIN`: Uso de `INNER JOIN`, `LEFT JOIN`, `NATURAL JOIN`.
  - `Funciones de Agregación`: `COUNT`, `SUM`, `AVG`, etc.
  - `INSERT INTO`: Inserción de nuevas tuplas.
  - `UPDATE`: Modificación de datos existentes, incluyendo el uso de subconsultas.
  - `DELETE`: Eliminación de registros.
- **Vistas (Views):** Creación y consulta de vistas para simplificar el acceso a datos.
- **Subconsultas:** Uso de consultas anidadas dentro de cláusulas `WHERE` o sentencias `UPDATE/DELETE`.

## 3. JDBC (Java Database Connectivity)
Implementación en Java para interactuar con bases de datos MySQL:

- **Configuración Inicial:**
  - Carga del driver: `Class.forName("com.mysql.jdbc.Driver")`.
  - Establecimiento de conexión: `DriverManager.getConnection(url, user, password)`.
- **Ejecución de Sentencias:**
  - `Statement`: Para consultas estáticas (`executeQuery`, `executeUpdate`).
  - `PreparedStatement`: Uso de parámetros variables (`?`) para seguridad y eficiencia (`setString`, `setInt`).
- **Manejo de Resultados:**
  - `ResultSet`: Recorrido de resultados con `rs.next()` y extracción de datos (`getString`, `getInt`, etc.).
  - `ResultSetMetaData`: Obtención de información sobre la estructura de la tabla dinámicamente (`getColumnCount`, `getColumnName`).
- **Gestión de Errores:**
  - Manejo de `SQLException` mediante bloques `try-catch`.
- **Interacción con el Usuario:**
  - Uso de `Scanner` para parametrizar consultas JDBC.
