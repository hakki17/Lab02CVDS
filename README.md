
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
![Como se veria tree en pantalla](https://github.com/hakki17/Lab02CVDS/blob/main/img/1.2.%20Tree-ramasMAVEN.png)

### 2. AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
Realizamos el cambio y se ve asi:  
![Como se ve el cambio en el archivo pom.xml al cambiar la version del compilador](https://github.com/hakki17/Lab02CVDS/blob/main/img/2.%20Cambiar%20version%20compilador.png)

![Como se ve el cambio en el archivo pom.xml al cambiar la version del compilador](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.2%20POM%20con%20plugin.png)

### 3. COMPILAR Y EJECUTAR
Archivo de Java con el "Hello World"

![codigo Java "HelloWorld"](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.3%20HelloWorldJAVA.png)  

Compilamos el codigo: 

![Muestra de lo que nos muestra el terminal](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.4.%20mvn-Upackage.png)   
![VER.2-build success](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.5%20mvn-Upackage2.png)  

Ejecutamos el codigo:

![Ejecución Hello Wolrd con mvn](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.6%20.%20EjecutarMVN.png)  

Aca la explicacion sobre el objetivo del parametro `package`:  
- **Objetivo:** El comando "package" sirve para crear un archivo ejecutable de un proyecto que puedas compartir o ejecutar directamente. Entre sus beneficios esta que no requiere instalación en el repositorio local, verifica que el proyecto se construye correctamente y crea un archivo distribuible

- ***clean***: Elimina la carpeta target y archivos compilados
- ***compile***: Compila el código fuente
- ***test***: Ejecuta las pruebas unitarias
- ***install***: Instala el paquete en el repositorio local
- ***deploy***: Copia el paquete al repositorio remoto

#### ¿Cómo enviar parámetros al plugin "exec"?
`mvn exec:java -Dexec.args="tuParametro"`
Ej:  
`mvn exec:java -Dexec.args="Alejo Y Mapu"`

#### Configuración y ejecución en JAVA con argumentos
Se configura el Java para que reciba argumentos y produzca el mensaje dependiendo de su entrada  
![conf JAVA-args](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.7.%20Java%20ARGS.png)

Se ejecuta  
![Ejecución JAVA-args](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.8%20resultado%20JAVA-args.png)


#### Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
Solo recibe el primer parámetro no el segundo.

### Saludo compuesto
Codigo de JAVA  

![conf JAVA-nombre compuesto](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.9.%20JAVA%20compuesta.png)

Resultado que nos dió al ejecutar el código  

![ej JAVA-nombre compuesto](https://github.com/hakki17/Lab02CVDS/blob/main/img/3.10%20resultado%20JAVA%20compuesta.png)

### 4. HACER EL ESQUELETO DE LA APLICACIÓN  
Se crea tanto el paquete edu.eci.cvds.patterns.shapes como el paquete edu.eci.cvds.patterns.shapes.concrete

Creamos una interfaz llamada Shape.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes

![Creacion Shapes](https://github.com/hakki17/Lab02CVDS/blob/main/img/4.1%20Creacion%20Shapes.png)  

Creamos una enumeración llamada RegularShapeType.java en el mismo directorio de antes

![Regular SHapes](https://github.com/hakki17/Lab02CVDS/blob/main/img/4.2%20Regular%20shapes.png)

- ***1. Triangle class***
- ***2. Quadrilateral class***
- ***3. Pentagon class***
- ***4. Hexagon class***

![Creacion clases](https://github.com/hakki17/Lab02CVDS/blob/main/img/4.3%20Creacion%20Clases.png)    
#### **¿Cuál fábrica hiciste?**  
Utilicé el patrón **Abstract Factory** para crear una fábrica que, en el futuro, podamos modificar fácilmente en caso de ser necesario. Esto se debe a que es en este punto donde se crean las instancias de las clases "Triangle", "Pentagon", "Hexagon" y "Quadrilateral". De este modo, se facilita la modificación o adición de nuevas figuras geométricas en el futuro.

#### **¿Cuál es mejor?**  
En nuestro caso, consideramos que la mejor opción es el patrón Abstract Factory, ya que nos permite cambiar fácilmente esta fábrica en el futuro por otra que genere nuevas figuras o incluso otro tipo de figuras (por ejemplo, figuras 3D). Esto facilita el mantenimiento y la expansión, ya que solo sería necesario modificar la fábrica en lugar de crear fábricas separadas para cada tipo de objeto, como lo seria con el metodo factory.

![Shape Factory](https://github.com/hakki17/Lab02CVDS/blob/main/img/4.4%20Shape%20Factory.png)  

### 5. EJECUCIONES
##### 1. **Sin parametros**  
![Resultado](https://github.com/hakki17/Lab02CVDS/blob/main/img/5.1%20Ejecuci%C3%B3n%20sin%20par%C3%A1metro.png)
##### 2. **Parámetro: Qwerty**  
![Resultado](https://github.com/hakki17/Lab02CVDS/blob/main/img/5.2%20Par%C3%A1metro%20Qwerty.png)
##### 3. **Parámetro: Pentagon**  
![Resultado](https://github.com/hakki17/Lab02CVDS/blob/main/img/5.3%20Par%C3%A1metro%20Pentagon.png)
##### 4. **Parámetro: Hexagon**  
![Resultado](https://github.com/hakki17/Lab02CVDS/blob/main/img/5.4%20Par%C3%A1metro%20Hexagon.png)

#### **¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**  
Todas las funciones entregan un valor o una respuesta del programa dependiendo del argumento de entrada. En este caso, la única que da la respuesta "correcta" es **Hexagon**, ya que nuestra clase numeradora, *ReguarShapeType*, proporciona los tipos de objetos. Cuando no tenemos otros objetos disponibles y la fábrica devuelve null si el tipo no "existe", el resultado indica que la respuesta no es correcta. El caso de Pentagon fue debido a un error de mayúsculas, ya que la "p" estaba en minúsculas.

### 6. QUÉ ES EL GIT IGNORE
El archivo .gitignore se utiliza para configurar qué carpetas o archivos, identificados por su extensión (como .jar) o por su nombre, deben ser ignorados por Git. Esto ayuda a evitar que el repositorio se llene de archivos innecesarios o "basura" que no deberían formar parte del repositorio.