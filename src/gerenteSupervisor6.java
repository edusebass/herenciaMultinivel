public class gerenteSupervisor6 extends gerente4{
    String zona_acargo;

    public gerenteSupervisor6(String nombre, String apellido, int cedula, double pago, int num_personasAcargo, String zona_acargo) {
        super(nombre, apellido, cedula, pago, num_personasAcargo);
        this.zona_acargo = zona_acargo;
    }

    public void saludo_gen_super() {
        System.out.println("saluda el gerente supervisor");
    }
}
