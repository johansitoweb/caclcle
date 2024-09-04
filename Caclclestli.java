import java.util.Scanner;  

public class Caclestli {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Bienvenido a la Calculadora de Consola");  
        
        while (true) {  
            System.out.println("Ingrese la operación (suma, resta, multiplicación, división) o 'salir' para terminar:");  
            String operacion = scanner.nextLine();  
            
            if (operacion.equalsIgnoreCase("salir")) {  
                break;  
            }  
            
            System.out.println("Ingrese el primer número:");  
            double num1 = scanner.nextDouble();  
            System.out.println("Ingrese el segundo número:");  
            double num2 = scanner.nextDouble();  
            scanner.nextLine(); // Limpiar el buffer  
            
            switch (operacion.toLowerCase()) {  
                case "suma":  
                    System.out.println("Resultado: " + (num1 + num2));  
                    break;  
                case "resta":  
                    System.out.println("Resultado: " + (num1 - num2));  
                    break;  
                case "multiplicación":  
                    System.out.println("Resultado: " + (num1 * num2));  
                    break;  
                case "división":  
                    if (num2 != 0) {  
                        System.out.println("Resultado: " + (num1 / num2));  
                    } else {  
                        System.out.println("Error: División por cero.");  
                    }  
                    break;  
                default:  
                    System.out.println("Operación no válida.");  
            }  
        }  
        
        scanner.close();  
        System.out.println("Gracias por usar la Calculadora de Consola. ¡Adiós!");  
    }  
}