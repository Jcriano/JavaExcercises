import java.util.Scanner;

public class excercises1 {
    public static void main( String[] args){

        //Ejercicio N1: Calcular el área de un triángulo

        //Descripción de la actividad en consola
        System.out.println("Ejercicio N1, Calcular el área de un triángulo");

        //Asignación de valores a las variables de "base" y "altura"
        double base = 12;
        double altura = 8;

        //Asignación a la variable "area" de la operación para calcular el área de un triángulo
        double area = (base * altura)/2;

        // Impresión por consola del resultado
        System.out.println("La base de un triángulo con base " + base + " y con altura " + altura + " es " + area);


        //Ejercicio N2: Ingresar dos números por la consola y sumarlos.

        // Para que el programa pueda leer los datos ingresados por el usuario
        Scanner ingreso = new Scanner(System.in);

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N2, Ingresar dos números por la consola y sumarlos.");

        //Texto de ingreso al usuario 1
        System.out.println("Ingrese el primer número");

        //Asignación a las variables de los valores ingresados por el usuario
        double num1 = ingreso.nextDouble();

        //Texto de ingreso al usuario 1
        System.out.println("Ingrese el segundo número");

        //Asignación a las variables de los valores ingresados por el usuario
        double num2 = ingreso.nextDouble();

        //Asignación de la variable con la operación suma
        double sum = num1 + num2;

        //Impresión en pantalla del resultado de la suma
        System.out.println("La suma de " + num1 + " mas " + num2 + " es igual a " + sum);

        //Ejercicio N3: Ingresar un número y visualizar el número elevado al cuadrado.

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N3, Ingresar un número y visualizar el número elevado al cuadrado.");

        //Texto de ingreso del valor al usuario
        System.out.println("Ingrese el número a operar");

        //Asignación de valor ingresado por el usuario a la variable
        double numeroIngresado = ingreso.nextDouble();

        //Asignación de la operación a una variable
        double numeroElevado = Math.pow(numeroIngresado, 2);

        //Impresión por consola del resultado de la operación
        System.out.println(numeroIngresado + " elevado al cuadrado es igual a " + numeroElevado);

        //Ejercicio N4: Escribir un programa que convierta de euros a dólares..

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N4, Escribir un programa que convierta de euros a dólares.");

        //Asignación de variables a el valor del dolar
        double valorDolar = 1.07;

        //Texto de ingreso del valor al usuario
        System.out.println("Ingrese el total de euros");

        //Ingreso de los euros de parte del usuario
        double euro = ingreso.nextDouble();

        //Operación de conversión de euros a dolar
        double valor = valorDolar * euro;

        //Impresión en pantalla de la conversión
        System.out.println(euro + " euros, son " + valor + " dolares");

        //Ejercicio N5: Escribir un programa que pida el lado de un cuadrado y calcule el valor del área y del perímetro.

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N5, Escribir un programa que pida el lado de un cuadrado y calcule el valor del área y del perímetro.");

        //Impresión de texto para el usuario
        System.out.println("Ingrese el lado del cuadrado en CM");

        //Ingreso del valor de parte del usuario
        double lado = ingreso.nextDouble();

        //Asignación de las operaciones a las variables correspondientes
        double areaCuadrado = lado * lado;
        double perimetroCuadrado = lado * 4;

        // Impresion de resultados en la consola
        System.out.println("El área del cuadrado será de " + areaCuadrado + " cm2 y el perímetro de " + perimetroCuadrado + " cm");

        //Ejercicio N6:Escribir un programa que determine el área y el volúmen de un cilindro.

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N6, Escribir un programa que determine el área y el volúmen de un cilindro.");

        //Ingreso del los valores de parte del usuario
        System.out.println("Ingrese el valor de la base del cilindro en cm");
        double baseCilindro = ingreso.nextDouble();

        System.out.println("Ingrese el valor de la altura del cilindro en cm");
        double alturaCilindro = ingreso.nextDouble();

        //Asignación de las variables a las operaciones
        double volumenCilindro = (Math.PI * Math.pow(baseCilindro, 2) * alturaCilindro);
        double areaCilindro = (((Math.PI *2) * (alturaCilindro * baseCilindro)) + ((Math.PI * 2) * Math.pow(baseCilindro, 2)));

        //Impresión en pantalla de los resultados
        System.out.println("El volumen del cilindro es de " + volumenCilindro + " cm3 y el area del cilindro es de " + areaCilindro + " cm2");

        //Ejercicio N7:Escribir un programa que lea el radio de una circunferencia y calcule la longitud de la misma y el área del círculo inscrito.

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N7, Escribir un programa que lea el radio de una circunferencia y calcule la longitud de la misma y el área del círculo inscrito.");

        //Ingreso de los valores de parte del usuario
        System.out.println("Ingrese el radio de la circunferencia");
        double radCircunferencia = ingreso.nextDouble();

        //Asignación de operaciones a las variables
        double logCircunf = (Math.PI * 2) * radCircunferencia;
        double areaCircunf = Math.PI * (Math.pow(radCircunferencia, 2));

        // Impresion en consola de los resultados de las operaciones
        System.out.println("La longitud de la circunferencia es de " + logCircunf + " y el área de la circunferencia es de " + areaCircunf);

        //Ejercicio N8: Calcular el promedio de tres (3) números ingresados por teclado.

        //Descripción de la actividad en consola
        System.out.println(" ");
        System.out.println("Ejercicio N8, Calcular el promedio de tres (3) números ingresados por teclado.");

        // Inicialización de variables
        double sumNotas = 0;
        double promedioNotas = 0;

        //Salida en pantalla de cantidad de notas a ingresar
        System.out.println("Ingrese cantidad de notas: ");

        //Imgreso de cantidad de notas de parte del usuario
        double cantNotas = ingreso.nextDouble();

        //Bucle for ue nos ayuda a determinar la suma de notas correspondiente a la cantidad de notas ingresadas
        for (double i = 1; i <= cantNotas; i++){
            //Impresion por consola de ingreso de notas
            System.out.println("Ingrese nota " + i + " de " + cantNotas + ":");

            //Ingreso de las notas en consola y asignación de operación
            double ingNotas=ingreso.nextDouble();
            sumNotas = sumNotas + ingNotas;
        }
        //Realización de la operación de promedio
        promedioNotas = sumNotas/cantNotas;

        //Impresión del resultado en pantalla
        System.out.println("El promedio de las notas es de: " + promedioNotas);
    }
}
