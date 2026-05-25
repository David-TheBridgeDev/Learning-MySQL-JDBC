# Learning MySQL and JDBC

Este repositorio está diseñado para ayudarte a dar tus primeros pasos con **MySQL** y **JDBC** en Java utilizando **IntelliJ IDEA**. Incluye una configuración de base de datos con Docker y un proyecto Maven listo para importar.

---

## 🚀 Guía de Instalación en Windows 11

Sigue estos pasos para preparar tu entorno.

### 1. Instalar Herramientas Necesarias

*   **Git:** Para gestionar el código. [Descargar aquí](https://git-scm.com/download/win).
*   **Docker Desktop:** Para la base de datos. [Descargar aquí](https://www.docker.com/products/docker-desktop/).
*   **IntelliJ IDEA:** El IDE recomendado. [Descargar Community Edition](https://www.jetbrains.com/idea/download/).
    *   *Nota:* IntelliJ ya incluye soporte para Maven y suele traer su propio JDK, lo que facilita mucho el proceso.

### 2. Clonar el Repositorio

Abre una terminal y ejecuta:

```bash
git clone https://github.com/TU_USUARIO/Learning-MySQL-JDBC.git
cd Learning-MySQL-JDBC
```

### 3. Levantar la Base de Datos

Con Docker Desktop abierto, ejecuta en la raíz del proyecto:

```bash
docker-compose up -d
```

### 4. Abrir en IntelliJ IDEA

1.  Abre IntelliJ IDEA.
2.  Selecciona **Open** y busca la carpeta del proyecto `Learning-MySQL-JDBC`.
3.  IntelliJ detectará el archivo `pom.xml`. Si te pregunta, selecciona **Open as Project**.
4.  Espera a que IntelliJ descargue las dependencias (el conector de MySQL) automáticamente. Verás una barra de progreso en la esquina inferior derecha.

### 5. Ejecutar el Proyecto

1.  Navega en el proyecto hasta: `src/main/java/com/example/Main.java`.
2.  Haz clic derecho sobre el archivo `Main.java` o dentro del código.
3.  Selecciona **Run 'Main.main()'**.

---

## 🛠️ ¿Cómo funciona Maven aquí?

Aunque solo usemos archivos `Main.java`, el archivo `pom.xml` es fundamental porque le dice a IntelliJ:
*   "Descarga el conector oficial de MySQL".
*   "Configura el proyecto para usar Java 17".
*   "Incluye las librerías necesarias en el Classpath automáticamente".

De esta forma, no tienes que descargar archivos `.jar` manualmente ni configurar rutas complejas en el IDE.

---

## 📊 Datos de Conexión (MySQL en Docker)

*   **Host:** `localhost`
*   **Puerto:** `3306`
*   **Base de Datos:** `learning_db`
*   **Usuario:** `user`
*   **Contraseña:** `password`

---

## 🛑 Detener el entorno

Cuando termines, puedes apagar el contenedor para ahorrar memoria:

```bash
docker-compose down
```
