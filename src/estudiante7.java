public class estudiante7 extends persona1{
    String correo_inst;

    public estudiante7(String nombre, String apellido, String correo_inst) {
        super(nombre, apellido);
        this.correo_inst = correo_inst;
    }

    public void saludo_est() {
        System.out.println("Hola soy estudiantes");
    }
}
