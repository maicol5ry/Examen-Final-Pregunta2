
abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public abstract void mostrarInfo();
}

class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, int edad, String carrera, int semestre) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad +
                           ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}


class Administrativo extends Persona {
    private String departamento;
    private String cargo;

    public Administrativo(String nombre, int edad, String departamento, String cargo) {
        super(nombre, edad);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Administrativo: " + nombre + ", Edad: " + edad +
                           ", Departamento: " + departamento + ", Cargo: " + cargo);
    }
}

class Docente extends Persona {
    private String especialidad;
    private int añosExperiencia;

    public Docente(String nombre, int edad, String especialidad, int añosExperiencia) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + ", Edad: " + edad +
                           ", Especialidad: " + especialidad + ", Años de Experiencia: " + añosExperiencia);
    }
}

public class pregunta_2 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería de Sistemas", 5);
        Administrativo administrativo = new Administrativo("Carlos", 35, "Recursos Humanos", "Jefe de Personal");
        Docente docente = new Docente("Lucía", 45, "Matemáticas", 15);

        estudiante.mostrarInfo();
        administrativo.mostrarInfo();
        docente.mostrarInfo();
    }
}
