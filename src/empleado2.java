public class empleado2 extends persona1 {
    int cedula;
    double pago;

    public empleado2(String nombre, String apellido, int cedula, double pago) {
        super(nombre, apellido);
        this.cedula = cedula;
        this.pago = pago;
    }

    public void saludo_emp() {
        System.out.println("Hola soy un empleado");
    }
}
