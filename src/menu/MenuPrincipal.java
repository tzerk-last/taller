package menu;

import java.util.Scanner;
import ejercicios.EjerciciosJava;

/**
 * Menu principal de la practica de Java.
 * Usa while para mantener el menu activo, if para validar la opcion y switch
 * para ejecutar el ejercicio seleccionado.
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        // El menu se repite hasta que el usuario elija la opcion 0.
        while (true) {
            mostrarMenu();
            opcion = leerEntero(teclado, "Selecciona una opcion: ");

            if (opcion == 0) {
                System.out.println("\nPrograma finalizado. Hasta luego.");
                break;
            }

            // Validacion con if antes de entrar al switch.
            if (opcion < 1 || opcion > 28) {
                System.out.println("Opcion no valida. Elige un numero entre 0 y 28.");
                pausar(teclado);
                continue;
            }

            System.out.println("\n========== EJECUTANDO EJERCICIO " + opcion + " ==========");
            switch (opcion) {
                case 1:
                    EjerciciosJava.ejercicio01_HolaMundoCMD();
                    break;
                case 2:
                    EjerciciosJava.ejercicio02_HolaMundoVSC();
                    break;
                case 3:
                    EjerciciosJava.ejercicio03_TiposPrimitivos();
                    break;
                case 4:
                    EjerciciosJava.ejercicio04_OperadoresAritmeticos(teclado);
                    break;
                case 5:
                    EjerciciosJava.ejercicio05_PrecedenciaYDivision();
                    break;
                case 6:
                    EjerciciosJava.ejercicio06_OperadoresIncrementales();
                    break;
                case 7:
                    EjerciciosJava.ejercicio07_OperadoresCombinados();
                    break;
                case 8:
                    EjerciciosJava.ejercicio08_PrintlnBasico();
                    break;
                case 9:
                    EjerciciosJava.ejercicio09_PrintVsPrintln();
                    break;
                case 10:
                    EjerciciosJava.ejercicio10_SecuenciasEscape();
                    break;
                case 11:
                    EjerciciosJava.ejercicio11_TipoByteShort();
                    break;
                case 12:
                    EjerciciosJava.ejercicio12_TipoIntLong();
                    break;
                case 13:
                    EjerciciosJava.ejercicio13_TipoFloatDouble();
                    break;
                case 14:
                    EjerciciosJava.ejercicio14_TipoChar();
                    break;
                case 15:
                    EjerciciosJava.ejercicio15_TipoBoolean();
                    break;
                case 16:
                    EjerciciosJava.ejercicio16_DeclaracionVariables();
                    break;
                case 17:
                    EjerciciosJava.ejercicio17_ConversionTipos();
                    break;
                case 18:
                    EjerciciosJava.ejercicio18_ExpresionesConVariables();
                    break;
                case 19:
                    EjerciciosJava.ejercicio19_ConstantesFinal();
                    break;
                case 20:
                    EjerciciosJava.ejercicio20_FormatoSalida();
                    break;
                case 21:
                    EjerciciosJava.ejercicio21_MostrarVariables();
                    break;
                case 22:
                    EjerciciosJava.ejercicio22_LiteralesPrimitivos();
                    break;
                case 23:
                    EjerciciosJava.ejercicio23_ResumenTiposPrimitivos();
                    break;
                case 24:
                    EjerciciosJava.ejercicio24_OperadoresRelacionales();
                    break;
                case 25:
                    EjerciciosJava.ejercicio25_OperadoresLogicos();
                    break;
                case 26:
                    EjerciciosJava.ejercicio26_OperadorCondicional();
                    break;
                case 27:
                    EjerciciosJava.ejercicio27_OperadorConcatenacion();
                    break;
                case 28:
                    EjerciciosJava.ejercicio28_MetodosMath();
                    break;
                default:
                    System.out.println("Opcion no implementada.");
                    break;
            }

            pausar(teclado);
        }

        teclado.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n====================================================");
        System.out.println("       INFORME DE PRACTICA #1 - JAVA");
        System.out.println(" Variables, tipos, operadores y clase Math");
        System.out.println("====================================================");
        System.out.println(" 1. Hola Mundo desde CMD");
        System.out.println(" 2. Hola Mundo desde VS Code");
        System.out.println(" 3. Tipos primitivos");
        System.out.println(" 4. Operadores aritmeticos (cinco operaciones)");
        System.out.println(" 5. Precedencia y division");
        System.out.println(" 6. Operadores incrementales");
        System.out.println(" 7. Operadores combinados");
        System.out.println(" 8. Taller: Hola, salida y variables");
        System.out.println(" 9. Taller: Tabla de tipos y tamanos");
        System.out.println("10. Taller: Casting double a int");
        System.out.println("11. Taller: Overflow en byte");
        System.out.println("12. Taller: Area y perimetro de rectangulo");
        System.out.println("13. Taller: Precedencia y parentesis");
        System.out.println("14. Taller: Booleanos y comparaciones");
        System.out.println("15. Taller: char y codigo numerico");
        System.out.println("16. Taller: Reporte de compra con printf");
        System.out.println("17. Taller: Bytes a KB y KiB");
        System.out.println("18. Taller: Banderas de bits (OR)");
        System.out.println("19. Taller: Punto flotante y comparacion");
        System.out.println("20. Taller: Traza de ejecucion (for)");
        System.out.println("21. Taller: Validacion de rango con if");
        System.out.println("22. Taller: Reporte de memoria con barra ASCII");
        System.out.println("23. Resumen de tipos primitivos");
        System.out.println("24. Operadores relacionales");
        System.out.println("25. Operadores logicos");
        System.out.println("26. Operador condicional (ternario)");
        System.out.println("27. Concatenacion de cadenas");
        System.out.println("28. Diez metodos de Math");
        System.out.println(" 0. Salir");
        System.out.println("----------------------------------------------------");
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = teclado.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Escribe un numero entero.");
            }
        }
    }

    private static void pausar(Scanner teclado) {
        System.out.println("\nPresiona ENTER para volver al menu...");
        teclado.nextLine();
    }
}
