public class Padre {
    private String apellido;
    private Auto auto;
    private Casa casa;
    private String nombre;

    public Padre(Auto auto) {
        this.apellido = "L�pez";
        this.nombre = "Pap�";
        comprarAuto(auto);
        construirCasa();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cantar() {
        System.out.println("asi canta tu padre, Don " + this.apellido);
    }

    public void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public void construirCasa() {
        this.casa = new Casa("Centro", 2);
    }

    @Override
    public String toString() {
        return "Padre{" + "apellido=" + apellido + ", auto=" + auto + ", casa=" + casa + ", nombre=" + nombre + '}';
    }
}
