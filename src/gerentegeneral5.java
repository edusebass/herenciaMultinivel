public class gerentegeneral5 extends gerente4{
    String puesto;

    public gerentegeneral5(String nombre, String apellido, int cedula, double pago, int num_personasAcargo, String puesto) {
        super(nombre, apellido, cedula, pago, num_personasAcargo);
        this.puesto = puesto;
    }

    public void salu_gen_general() {
        System.out.println("Saludo del genrente general");
    }
}
