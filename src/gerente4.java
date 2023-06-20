public class gerente4 extends empleado2 {
    int num_personasAcargo;

    public gerente4(String nombre, String apellido, int cedula, double pago, int num_personasAcargo) {
        super(nombre, apellido, cedula, pago);
        this.num_personasAcargo = num_personasAcargo;
    }

    public void saludo_ge() {
        System.out.println("Hola soy el genrente");
    }
}
