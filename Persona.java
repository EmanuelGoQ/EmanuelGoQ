import java.util.Scanner;
public class Persona {
    //Propiedades encapsuladas en la clase Persona
    private String nombre;
    private int edad;
    private String id;
    private String rango;
    private String materia;
    public Persona(String nombre, int edad, String id) { //constructor Estudiante
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    //Polimosfismo por sobrecarga
    public Persona(String nombre, String materia, int edad) { //constructor Docente
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;

    }
    public Persona(int edad, String nombre, String rango) { //constructor Administrativo
        this.edad = edad;
        this.nombre = nombre;
        this.rango = rango;
    }
    //Getters
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public String getRango() {
        return rango;
    }
    public String getMateria() {
        return materia;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    //Tres funciones adicionales
    public void generrarPago() {
        double taza;
        if (rango.equals("Secretario")) {
            taza = 2.5;
        } else if (rango.equals("Jefe")) {
            taza = 3;
        } else {
            taza = 1;
        }
        System.out.println("Al administrativo "+nombre+" se le deben pagar "+(1500000*taza)+" pesos.");
    }
    public void estudiar() {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        String asignatura;
        System.out.println("Elige la asignatura\n1.matematicas\n2.Sociales\n3.Ciencias");
        eleccion = sc.nextInt();
        if (eleccion == 1) {
            asignatura = "Fracciones";
        } else if (eleccion == 2) {
            asignatura = "El mapamundi";
        } else {
            asignatura = "Las reacciones del agua y jabon";
        }
        System.out.println("El estudiante " +nombre+ " con ID: "+id+" se clava a estudiar "+asignatura+".");
    }
    public void enseñar() {
        System.out.println("El docente "+nombre+" le enseña a sus alumnos sobre "+materia+".");
    }
}