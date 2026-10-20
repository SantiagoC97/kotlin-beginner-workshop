# Introducción a Kotlin - Fundamentos de programación

**Curso:** Desarrollo de Aplicaciones Móviles  
**Estudiante:** Santiago Cano Orozco  
**Lenguaje de programación:** Kotlin

## Descripción

Este repositorio contiene el desarrollo de los ocho ejercicios del taller Introducción a Kotlin - Fundamentos de programación. Su propósito es aplicar conceptos fundamentales del lenguaje, incluyendo variables, tipos de datos, estructuras de control, colecciones, funciones, clases y manejo seguro de valores nulos.

Los ejercicios se desarrollan de forma independiente y pueden ejecutarse utilizando Kotlin Playground con la plataforma JVM.

## Ejercicios

| Carpeta | Ejercicio | Estado |
|---|---|---|
| exercise-01 | Calculadora básica | Desarrollado |
| exercise-02 | Clasificación de estudiantes | Desarrollado |
| exercise-03 | Tabla de multiplicar | Desarrollado |
| exercise-04 | Análisis de una lista | Desarrollado |
| exercise-05 | Funciones matemáticas | Desarrollado |
| exercise-06 | Gestión de productos | Pendiente |
| exercise-07 | Agenda de contactos | Pendiente |
| exercise-08 | Manejo de valores nulos | Pendiente |

## Instrucciones de ejecución

1. Ingresar a https://play.kotlinlang.org/.
2. Seleccionar la plataforma JVM.
3. Abrir la carpeta del ejercicio que se desea ejecutar.
4. Copiar el contenido de su archivo `Main.kt`.
5. Pegar el código en el editor de Kotlin Playground.
6. Presionar **Run** para ejecutar el programa.
7. Revisar los resultados y modificar los valores de entrada para realizar nuevas pruebas.

Cada archivo contiene su propia función `main()` y se ejecuta individualmente.

## Ejercicio 01 - Calculadora básica

Implementa una calculadora con las operaciones de suma, resta, multiplicación y división mediante la estructura `when`. Incluye una validación que impide dividir entre cero y un mensaje para operadores no válidos.

**Prueba inicial:** con los valores 12.0 y 4.0, utilizando el operador de división, el resultado esperado es 3.0.


## Ejercicio 02 - Clasificación de estudiantes

Calcula el promedio de tres calificaciones y determina
si un estudiante está aprobado o reprobado. También
identifica si alcanzó un promedio excelente.

El programa valida que las calificaciones estén entre
0.0 y 5.0 antes de realizar los cálculos.

**Prueba inicial:** con las notas 4.0, 4.5 y 5.0,
el promedio es 4.5. El estudiante está aprobado
y obtiene un promedio excelente.


## Ejercicio 03 - Tabla de multiplicar

Genera la tabla de multiplicar de un número entero
desde el 1 hasta el 10 mediante un ciclo `for`.

El programa utiliza un acumulador para calcular
la suma de los diez resultados y mostrarla al final.

**Prueba inicial:** para el número 7, se obtiene
la tabla del 7 y una suma total de 385.


## Ejercicio 04 - Análisis de una lista

Analiza una colección de diez números enteros utilizando
una lista y un ciclo `for`.

El programa muestra los elementos, calcula su suma
y promedio, identifica los valores mayor y menor,
y determina cuántos números son pares e impares.

**Prueba inicial:** con la lista definida en el programa,
se obtiene una suma de 137, un promedio de 13.7,
un máximo de 30, un mínimo de 4, cinco números
pares y cinco impares.


## Ejercicio 05 - Funciones matemáticas

Implementa tres funciones para realizar operaciones
y comprobaciones matemáticas:

- isPrime(number: Int): determina si un número es primo.
- factorial(number: Int): calcula el factorial de un
  entero no negativo, hasta 20.
- isEven(number: Int): verifica si un número es par.

Las tres funciones se ejecutan desde `main()`.

El cálculo del factorial utiliza el tipo `Long` y
controla los valores fuera del rango permitido.

**Prueba inicial:** se verifica que 7 es primo,
el factorial de 5 es 120 y 10 es un número par.


## Referencias

- Documentación oficial de Kotlin: https://kotlinlang.org/docs/
- Kotlin Tour: https://kotlinlang.org/docs/kotlin-tour-hello-world.html
- Kotlin Playground: https://play.kotlinlang.org/
