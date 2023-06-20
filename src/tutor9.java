public class tutor9 extends estudiante7{
    String curso_acargo;

    public tutor9(String nombre, String apellido, String correo_inst, String curso_acargo) {
        super(nombre, apellido, correo_inst);
        this.curso_acargo = curso_acargo;
    }

    public void salu_tutor() {
        System.out.println("Hola soy tutor");
    }
}
