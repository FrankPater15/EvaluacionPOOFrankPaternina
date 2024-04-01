import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nomEstudiante = scanner.nextLine();
        System.out.print("Dirección: ");
        String direcEstudiante = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefEstudiante = scanner.nextLine();
        System.out.print("Email: ");
        String emailEstudiante = scanner.nextLine();
        System.out.print("Cual es su estado? (1, 2, 3 o 4): ");
        int estadoEstudiante = scanner.nextInt();
        System.out.println("Ingrese el promedio: ");
        double promEstudiante = scanner.nextDouble();

        Estudiante estudiante1 = new Estudiante(nomEstudiante, direcEstudiante, telefEstudiante, emailEstudiante, estadoEstudiante, promEstudiante);

        
        scanner.nextLine();
        System.out.println("\nIngrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nomEmpleado = scanner.nextLine();
        System.out.print("Dirección: ");
        String direcEmpleado = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefEmpleado = scanner.nextLine();
        System.out.print("Email: ");
        String emailEmpleado = scanner.nextLine();
        System.out.print("Cual es su departamento? (Contabilidad, Recursos Humanos o Compras): ");
        String deptoEmpleado = scanner.nextLine();
        System.out.print("Salario: ");
        double salarioEmpleado = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Fecha de Contratación: ");
        String fechaContratacionEmpleado = scanner.nextLine();

        Empleado empleado1 = new Empleado(nomEmpleado, direcEmpleado, telefEmpleado, emailEmpleado, deptoEmpleado, salarioEmpleado, fechaContratacionEmpleado);


        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante1);

        System.out.println("\nDatos del empleado:");
        System.out.println(empleado1);

        scanner.close();
    }
}