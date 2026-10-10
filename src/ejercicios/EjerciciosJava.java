package ejercicios;

import java.util.Scanner;

/**
 * Metodos que resuelven los ejercicios del menu.
 * Esta clase esta en el paquete ejercicios y es importada por menu.MenuPrincipal.
 */
public class EjerciciosJava {
    private EjerciciosJava() { }

    public static void ejercicio01_HolaMundoCMD() {
        System.out.println("Hola Mundo desde Java (simulacion del ejercicio de CMD).");
        System.out.println("Para probarlo por CMD, consulta las instrucciones del README.");
    }

    public static void ejercicio02_HolaMundoVSC() {
        System.out.println("Hola Mundo desde Visual Studio Code.");
    }

    public static void ejercicio03_TiposPrimitivos() {
        byte numeroByte = 120;
        short numeroShort = 32000;
        int numeroInt = 1000000;
        long numeroLong = 9000000000L;
        float numeroFloat = 23.5F;
        double numeroDouble = 15999.99;
        char caracter = 'J';
        boolean activo = true;

        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + activo);
        System.out.println("String (tipo de referencia): Java");
    }

    /** Ejercicio de la guia: dos enteros y suma, resta, multiplicacion, division y modulo. */
    public static void ejercicio04_OperadoresAritmeticos(Scanner teclado) {
        int a = leerEntero(teclado, "Ingresa el primer numero entero: ");
        int b = leerEntero(teclado, "Ingresa el segundo numero entero: ");

        System.out.println("\nPrimer numero: " + a);
        System.out.println("Segundo numero: " + b);
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        if (b != 0) {
            System.out.println("Division entera: " + (a / b));
            System.out.println("Modulo (residuo): " + (a % b));
            System.out.println("Division decimal: " + ((double) a / b));
        } else {
            System.out.println("No se puede dividir ni calcular el modulo usando cero como divisor.");
        }
    }

    public static void ejercicio05_PrecedenciaYDivision() {
        System.out.println("10 + 2 * 3 = " + (10 + 2 * 3));
        System.out.println("(10 + 2) * 3 = " + ((10 + 2) * 3));
        System.out.println("7 / 2 como int = " + (7 / 2));
        System.out.println("7.0 / 2 como double = " + (7.0 / 2));
    }

    public static void ejercicio06_OperadoresIncrementales() {
        int a = 5;
        System.out.println("Valor inicial a = " + a);
        System.out.println("Preincremento ++a devuelve: " + (++a));
        System.out.println("Postincremento a++ devuelve: " + (a++));
        System.out.println("Despues de a++: " + a);
        System.out.println("Predecremento --a devuelve: " + (--a));
        System.out.println("Postdecremento a-- devuelve: " + (a--));
        System.out.println("Valor final de a: " + a);
    }

    public static void ejercicio07_OperadoresCombinados() {
        int a = 20;
        System.out.println("Valor inicial: " + a);
        a += 5;  System.out.println("Despues de += 5: " + a);
        a -= 3;  System.out.println("Despues de -= 3: " + a);
        a *= 2;  System.out.println("Despues de *= 2: " + a);
        a /= 4;  System.out.println("Despues de /= 4: " + a);
        a %= 3;  System.out.println("Despues de %= 3: " + a);
    }

    /** Ejercicio 1 del taller de println: salida y variables. */
    public static void ejercicio08_PrintlnBasico() {
        String nombre = "Lucia";
        int edad = 19;
        double promedio = 4.2;
        boolean activo = true;
        System.out.println("=== Perfil ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio + " | Activo: " + activo);
    }

    /** Ejercicio 2 del taller: tabla de tipos, tamanos y ejemplos. */
    public static void ejercicio09_PrintVsPrintln() {
        System.out.println("Tipo   | Bits | Ejemplo");
        System.out.println("------------------------");
        System.out.println("byte   | 8    | -7");
        System.out.println("int    | 32   | 123456");
        System.out.println("double | 64   | 3.1416");
        System.out.println("char   | 16   | A");
    }

    /** Ejercicio 3 del taller: casting controlado double a int. */
    public static void ejercicio10_SecuenciasEscape() {
        double x = 9.99;
        int xEntero = (int) x;
        double perdida = x - xEntero;
        System.out.println("x (double) = " + x);
        System.out.println("xEntero (int) = " + xEntero);
        System.out.printf("perdida = %.2f%n", perdida);
    }

    /** Ejercicio 4 del taller: desbordamiento de byte. */
    public static void ejercicio11_TipoByteShort() {
        byte b = 127;
        System.out.println("b = " + b);
        b++;
        System.out.println("b + 1 = " + b); // El byte pasa de 127 a -128 por overflow.
    }

    /** Ejercicio 5 del taller: area y perimetro del rectangulo. */
    public static void ejercicio12_TipoIntLong() {
        double base = 7.5;
        double altura = 3.2;
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }

    /** Ejercicio 6 del taller: precedencia y parentesis. */
    public static void ejercicio13_TipoFloatDouble() {
        System.out.println("10 + 2 * 3 = " + (10 + 2 * 3));
        System.out.println("(10 + 2) * 3 = " + ((10 + 2) * 3));
    }

    /** Ejercicio 7 del taller: booleanos y comparaciones. */
    public static void ejercicio14_TipoChar() {
        int a = 12;
        int b = 5;
        System.out.println("a>b: " + (a > b));
        System.out.println("a==b: " + (a == b));
        System.out.println("a%b==0: " + (a % b == 0));
        System.out.println("a>b && b>0: " + (a > b && b > 0));
    }

    /** Ejercicio 8 del taller: caracter y codigo numerico. */
    public static void ejercicio15_TipoBoolean() {
        char c = 'A';
        char c2 = 'ñ';
        System.out.println("c = " + c);
        System.out.println("codigo = " + (int) c);
        System.out.println("c2 = " + c2);
        System.out.println("codigo2 = " + (int) c2);
    }

    /** Ejercicio 9 del taller: reporte de compra con dos decimales. */
    public static void ejercicio16_DeclaracionVariables() {
        String producto = "Cable HDMI";
        int unidades = 3;
        double precioUnitario = 12.5;
        double subtotal = unidades * precioUnitario;
        System.out.println("Producto: " + producto);
        System.out.println("Unidades: " + unidades);
        System.out.printf("Precio: $ %.2f%n", precioUnitario);
        System.out.printf("Subtotal: $ %.2f%n", subtotal);
    }

    /** Ejercicio 10 del taller: bytes a KB decimal y KiB binario. */
    public static void ejercicio17_ConversionTipos() {
        long bytes = 5_000_000L;
        double kb = bytes / 1000.0;
        double kib = bytes / 1024.0;
        System.out.println("Bytes: " + bytes);
        System.out.println("KB (decimal): " + kb);
        System.out.println("KiB (binario): " + kib);
    }

    /** Ejercicio 11 del taller: banderas de bits mediante OR. */
    public static void ejercicio18_ExpresionesConVariables() {
        int flags = 0;
        flags = flags | 4; // Activa el bit 2.
        flags = flags | 1; // Activa el bit 0.
        System.out.println("flags (dec) = " + flags);
        System.out.println("flags (bin) = " + Integer.toBinaryString(flags));
    }

    /** Ejercicio 12 del taller: precision finita de double. */
    public static void ejercicio19_ConstantesFinal() {
        double r = 0.1 + 0.2;
        System.out.println("r = " + r);
        System.out.printf("r (2 dec) = %.2f%n", r);
        System.out.println("r==0.3: " + (r == 0.3));
    }

    /** Ejercicio 13 del taller: suma acumulada del 1 al 10. */
    public static void ejercicio20_FormatoSalida() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            System.out.println("i=" + i + " suma=" + suma);
        }
    }

    /** Ejercicio 14 del taller: validacion de nota con if. */
    public static void ejercicio21_MostrarVariables() {
        int nota = 87;
        if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        String etiqueta;
        if (nota >= 90) {
            etiqueta = "Excelente";
        } else if (nota >= 75) {
            etiqueta = "Bueno";
        } else if (nota >= 60) {
            etiqueta = "Basico";
        } else {
            etiqueta = "Insuficiente";
        }
        System.out.println("Desempeno: " + etiqueta);
    }

    /** Ejercicio 15 del taller: reporte de memoria y barra ASCII de 20 caracteres. */
    public static void ejercicio22_LiteralesPrimitivos() {
        int totalMiB = 512;
        int usadoMiB = 273;
        int libreMiB = totalMiB - usadoMiB;
        double porcentajeUsado = (usadoMiB * 100.0) / totalMiB;

        System.out.println("=== Memoria ===");
        System.out.println("Total: " + totalMiB + " MiB");
        System.out.printf("Usado: %d MiB (%.2f%%)%n", usadoMiB, porcentajeUsado);
        System.out.println("Libre: " + libreMiB + " MiB");

        final int ANCHO_BARRA = 20;
        int usados = (int) Math.round((porcentajeUsado / 100.0) * ANCHO_BARRA);
        int libres = ANCHO_BARRA - usados;
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < usados; i++) {
            barra.append('#');
        }
        for (int i = 0; i < libres; i++) {
            barra.append('.');
        }
        barra.append(']');
        System.out.println(barra);
    }

    public static void ejercicio23_ResumenTiposPrimitivos() {
        System.out.println("byte    -> entero de 8 bits; maximo: " + Byte.MAX_VALUE);
        System.out.println("short   -> entero de 16 bits; maximo: " + Short.MAX_VALUE);
        System.out.println("int     -> entero de 32 bits; maximo: " + Integer.MAX_VALUE);
        System.out.println("long    -> entero de 64 bits; maximo: " + Long.MAX_VALUE);
        System.out.println("float   -> decimal de precision simple: " + 1.25F);
        System.out.println("double  -> decimal de doble precision: " + 1.25);
        System.out.println("char    -> caracter: " + 'J');
        System.out.println("boolean -> logico: " + true);
        System.out.println("String es un tipo de referencia, no primitivo.");
    }

    public static void ejercicio24_OperadoresRelacionales() {
        int a = 10;
        int b = 7;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= 10: " + (a >= 10));
        System.out.println("b <= 7: " + (b <= 7));
    }

    public static void ejercicio25_OperadoresLogicos() {
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Negacion !true: " + !verdadero);
        System.out.println("OR inclusivo true | false: " + (verdadero | falso));
        System.out.println("OR exclusivo true ^ false: " + (verdadero ^ falso));
        System.out.println("AND true & false: " + (verdadero & falso));
        System.out.println("OR cortocircuito true || false: " + (verdadero || falso));
        System.out.println("AND cortocircuito true && false: " + (verdadero && falso));
    }

    public static void ejercicio26_OperadorCondicional() {
        int edad = 19;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Edad: " + edad);
        System.out.println("Resultado: " + resultado);
        int nota = 4;
        String estado = (nota >= 3) ? "Aprobado" : "Reprobado";
        System.out.println("Estado academico: " + estado);
    }

    public static void ejercicio27_OperadorConcatenacion() {
        String nombre = "Laura";
        String carrera = "Ingenieria de Sistemas";
        int semestre = 2;
        String mensaje = "Hola, soy " + nombre + ", estudio " + carrera
                + " y estoy en el semestre " + semestre + ".";
        System.out.println(mensaje);
        System.out.println("En dos semestres: " + (semestre + 2));
        System.out.println("Sin parentesis concatena texto: " + semestre + 2);
    }

    public static void ejercicio28_MetodosMath() {
        double numero = -8.7;
        System.out.println("1. Math.abs(-8.7): " + Math.abs(numero));
        System.out.println("2. Math.ceil(4.2): " + Math.ceil(4.2));
        System.out.println("3. Math.floor(4.8): " + Math.floor(4.8));
        System.out.println("4. Math.round(4.6): " + Math.round(4.6));
        System.out.println("5. Math.max(12, 7): " + Math.max(12, 7));
        System.out.println("6. Math.min(12, 7): " + Math.min(12, 7));
        System.out.println("7. Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("8. Math.sqrt(81): " + Math.sqrt(81));
        System.out.println("9. Math.cbrt(27): " + Math.cbrt(27));
        System.out.println("10. Math.random(): " + Math.random());
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = teclado.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Ingresa un entero, por ejemplo 12.");
            }
        }
    }
}
