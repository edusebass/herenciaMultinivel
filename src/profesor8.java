public class profesor8 extends estudiante7{
    String num_estudiantes;

    public profesor8(String nombre, String apellido, String correo_inst, String num_estudiantes) {
        super(nombre, apellido, correo_inst);
        this.num_estudiantes = num_estudiantes;
    }

    public void salu_profe() {
        System.out.println("Soy porfesor");
    }
}
