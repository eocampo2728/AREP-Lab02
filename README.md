# Implementacion LinkedList

## Description
Este programa es una implementacion de una LinkedList compatible con la clase List de java y permite calcular la media y desviacion estandar de un grupo de numeros.

Esta implementacion de LinkedList tiene para calcular variables estadisticas utilizando LinkedList

La calculadora contiene las sigueientes operaciones:

  1. Media
  2. Desviacion estandar	

## Getting Started
Para correr este programa, solo necesita clonar el repositorio y abrirlo en [NetBeans](https://netbeans.org/), o en cualquier compilador que soporte proyectos maven.

## Install
Para hacer la instalacion de esta libreria, se debe clonar el repositorio:
![ins](https://github.com/eocampo2728/AREP-Lab01/blob/master/resources/cap01.PNG?raw=true)

Ya con el repositorio clonado en su dispositivo, se puede compilar mediante cualquier compilador.

## Test
Para probar este programa se necesita compilarlo en cualquier compilador, esta libreria tiene una clase de pruebas llamada CalculadoraComplejosTest.

![test](https://github.com/eocampo2728/AREP-Lab01/blob/master/resources/cap02.PNG?raw=true)

En esta clase se encuentran todas las pruebas de la libreria. Para correr las pruebas solo se necesita ejecutar los comandos:
```
mvn compile
mvn test
```

## Use
Para usar esta libreria lo unico que se necesita hacer es importa la libreria, en el programa en el que se decea utilizarlo.
Esta libreria cuenta con dos clases principales y una de pruebas, las clases principales son LinkedList y Calculator
Los metodos implementados de LinkedList son:

```java
public boolean add(Object o)
public int size()
public boolean isEmpty()
public Object get(int index)
public boolean equals(LinkedList list)
```

Los metodos implementados de Calculator son:

```java
public static double mean(LinkedList elements)
public static double standardDeviation(LinkedList elements)
```


## Autor
Eduardo Ocampo

## Build With
Este Programa fue creado en Java y utilizando la herramienta [NetBeans](https://netbeans.org/).
