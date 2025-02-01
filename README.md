
# Lab02CVDS  
##### 29/01/2025  

---

### ===== Integrantes =====  
- **Alejandro Prieto**  
- **María Paula Sánchez Macías**

---
## LA HERRAMIENTA MAVEN
### ¿Cuál es su mayor utilidad?  
Maven es una herramienta que maneja proyectos de construcción, asegurando que el proyecto esté en un estado consistente. Además, gestiona automáticamente las librerías necesarias para el desarrollo del proyecto, todo basado en el concepto de **Project Object Model (POM)**.

---

### Fases de Maven
- Facilitar el proceso de construcción.
- Producir una construcción de sistema uniforme.
- Generar información de calidad sobre el proyecto.
- Fomentar buenas prácticas de desarrollo.

---

### Ciclo de vida de la construcción
- **Default**  
- **Clean**  
- **Site**

---

### ¿Para qué sirven los Plugins?  
Los **plugins** son herramientas que permiten extender la funcionalidad de Maven, cargando complementos que facilitan tareas como la compilación del código, la ejecución de pruebas, entre otras.

---

### ¿Qué es y para qué sirve el repositorio central de Maven?  
Es un **lugar de almacenamiento en la nube** donde se guardan las librerías y dependencias que nuestro proyecto Java puede usar. Estas dependencias se definen en el archivo `pom.xml`, y Maven se encarga de descargarlas automáticamente al iniciar el proyecto. De esta manera, se evita la gestión manual de librerías, la búsqueda de actualizaciones y la necesidad de compartirlas entre desarrolladores.

---

## EJERCICIO DE LAS FIGURAS
### 1. CREAR UN PROYECTO CON MAVEN
Para crear un archivo **mvn** escribimos en el terminal, el siguiente comando:  
`mvn archetype:generate -Dfilter=maven-archetype-quickstart`    
![Ejecucion de ese comando en pantalla](https://github.com/hakki17/Lab02CVDS/blob/main/img/1.%20Ejecutar%20Comando.png)

Comando:   
Comando que nos permite ver la estructura formada por el proyecto que acabamos de generar   
`tree /f`  
![Como se veria tree en pantalla](https://github.com/hakki17/Lab02CVDS/blob/main/img/2.%20Tree.png)

### 2. AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
Realizamos el cambio y se ve asi:  
![Como se ve el cambio en el archivo pom.xml]()

### 3. COMPILAR Y EJECUTAR
Compilamos el codigo:  
![Muestra de lo que nos muestra el terminal]()

Aca la explicacion sobre el objetivo del parametro `package`:  
- **Objetivo:**
- **Parametro 1:** Explicacion  


Para ejecutar un proyecto maven desde la linea de comandos usamos el comando:  
`Comando`


### 4. HACER EL ESQUELETO DE LA APLICACIÓN

### 5. EJECUCIONES
#### - **Sin parametros**

#### - **Parámetro: Qwerty**

#### - **Parámetro: Pentagon**

#### - **Parámetro: Hexagon**


### 6. QUÉ ES EL GIT IGNORE
El .gitignore es un archivo para poder configurar que carpetas o archivos identificandolos por terminacion ".jar" o "nombre" para evitar llenar el repositorio de cosas que no nos sirven tenerlas en el repositorio o archivos "basura"