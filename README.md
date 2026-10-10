# Menu interactivo - Informe de Practica #1 Java

Proyecto de consola que integra los ejercicios del informe en un menu numerado.

## Estructura y relacion entre paquetes

```text
MenuInteractivo/
└── src/
    ├── menu/
    │   └── MenuPrincipal.java
    └── ejercicios/
        └── EjerciciosJava.java
```

Las carpetas son paquetes Java: `menu` y `ejercicios`. La conexion se hace desde `MenuPrincipal.java` mediante:

```java
import ejercicios.EjerciciosJava;
```

`MenuPrincipal` contiene el bucle `while (true)`, la validacion con `if` y el `switch` que llama los metodos publicos de `EjerciciosJava`.

## Como compilar y ejecutar

Se necesita tener instalado el JDK y que los comandos `java` y `javac` funcionen en la terminal.

### macOS, Linux o terminal de VS Code

Desde la carpeta `MenuInteractivo` ejecuta:

```bash
javac -encoding UTF-8 -d out src/ejercicios/EjerciciosJava.java src/menu/MenuPrincipal.java
java -cp out menu.MenuPrincipal
```

### Windows CMD o PowerShell

Desde la carpeta `MenuInteractivo` ejecuta los mismos comandos:

```bat
javac -encoding UTF-8 -d out src\ejercicios\EjerciciosJava.java src\menu\MenuPrincipal.java
java -cp out menu.MenuPrincipal
```

En VS Code puedes abrir la carpeta `MenuInteractivo`, abrir una terminal integrada y ejecutar los comandos anteriores.

## Uso

- El menu presenta 28 opciones relacionadas con la actividad.
- El menu se mantiene ejecutandose con `while (true)` y vuelve a aparecer al terminar cada ejercicio.
- La opcion `0` termina el programa para evitar dejarlo atrapado en un ciclo infinito.
- La opcion 4 pide dos enteros y muestra suma, resta, multiplicacion, division y modulo. El programa valida la division por cero con `if`.
- Si se escribe una opcion que no sea un entero o que este fuera del rango, se informa el error y se vuelve al menu.

## Nota sobre los ejercicios

Los ejemplos estan preparados para practicar los temas del encargo y de los dos PDF adjuntos. Las opciones 8-23 toman como base los ejemplos de tipos primitivos y salida por consola de la carpeta creada anteriormente; deben compararse con los enunciados del profesor antes de entregar el informe final.
