import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("****Aplicacion Calculadora***");
            //Mostrar menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Hasta Pronto...");
                    break;
                } else {
                    System.out.println("Opcion Errone: " + operacion);
                }
                //Imprimimos Salto De linea
                System.out.println();
            }//fin try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            //Imprimimos salto de linea
            System.out.println();
        }//fin while
    }//fin main class

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operador a realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.println("Proporciona valor operador1");
        var operador1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona valor operador2");
        var operador2 = Integer.parseInt(consola.nextLine());
        int resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operador1 + operador2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {//Resta
                resultado = operador1 - operador2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {//Multiplicacion
                resultado = operador1 * operador2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> {//Division
                resultado = operador1 / operador2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion Errone: " + operacion);
        }
    }
}// fin class
