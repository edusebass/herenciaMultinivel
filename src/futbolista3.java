public class futbolista3 extends persona1{
    String equipo;

    public futbolista3(String nombre, String apellido, String equipo) {
        super(nombre, apellido);
        this.equipo = equipo;
    }

    public void sal_fut() {
        System.out.println("saludo del futbolista");
    }
}
