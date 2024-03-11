//Hecho por Emanuel Gonzalez Quintero a las 11:42
import java.util.Scanner;
public class ObjetosDePersona {
// debe tener 3 instancias de personas diferentes, Estudiante, Docente y Administrativo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola este programa crea personas y hace acciones pequeñas: ");
        System.out.println("Voy a hacer un estudiante y tu elijes que estudiará, listo?");
        System.out.println("Se va a llamar Juan, tendrá 12 años y con id 12345;");
        Persona prueba1 = new Persona("Juan", 12, "12345" );
        prueba1.estudiar();
        System.out.println("Voy a hacer un Docente y va a enseñar, listo?");
        System.out.println("Se va a llamar Diego, tendrá 28 años y enseñará Programación;");
        Persona prueba2 = new Persona("Diego", "Programación",28 );
        prueba2.enseñar();
        System.out.println("Voy a hacer un Administrativo y se le pagará, listo?");
        System.out.println("Se va a llamar Cristian, tendrá 37 años y será un Jefe;");
        Persona prueba3 = new Persona(37, "Cristian", "Jefe" );
        prueba3.generrarPago();
        System.out.println("Muy bien, ahora intentalo tú; \n");
        System.out.printf("Bienvenido al programa personas");
        System.out.printf("¿Que persona quieres crear?\n1.Estudiante\n2.Docente\n3.Administrativo\n-->");
        int opcion = sc.nextInt(); //para la elección
        Persona a1;
        if (opcion ==1) {
            System.out.printf("Ingresa un nombre: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.printf("Ingresa una edad: ");
            int edad = sc.nextInt();
            System.out.printf("Ingresa el ID: ");
            sc.nextLine();
            String id = sc.nextLine();
            a1 = new Persona(nombre, edad, id); //crea un estudiante
        } else if (opcion==2){
            System.out.printf("Ingresa un nombre: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.printf("Ingresa la materia: ");
            String materia = sc.nextLine();
            System.out.printf("Ingresa una edad: ");
            int edad = sc.nextInt();
            a1 = new Persona(nombre, materia, edad); //crea un docente
        } else {
            System.out.printf("Ingresa una edad: ");
            int edad = sc.nextInt();
            System.out.printf("Ingresa el nombre: ");
            String nombre = sc.nextLine();
            System.out.printf("Ingresa un rango (Secretario) (Jefe): ");
            String rango = sc.nextLine();
            a1 = new Persona(edad, nombre, rango); //crea un docente
        }
        /////// dependiendo de la persona se ejecutan sus acciones
        if (opcion==1) {
            a1.estudiar();
        } else if (opcion==2) {
            a1.enseñar();
        } else {
            a1.generrarPago();
        }
    }
}
