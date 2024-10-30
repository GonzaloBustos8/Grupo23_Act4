public class Hijo extends Padre implements Madre, Tio, Hermano{
    private String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.billetera = 0.0;
        this.celular = celular;
        this.nombre = nombre;
    }
    public Celular getCelular() {
        return celular;
    }

    public void bailar() {
        System.out.println("Ahora se bailar como mi madre!");
    }


    @Override
    public void cantar() {
        super.cantar();
        System.out.println("y asi canta " + nombre);
    }

    public void conducirAuto(Auto auto) {
        System.out.println(nombre + "Esta conduciendo el auto : " + auto.toString());
    }

    public int hacerGoles() {
        int goles = (int) (Math.random() * 5);
        System.out.println("Jugando al f�tbol, hoy has hecho " + goles + " goles.");
        return goles;
    }

    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("T�o Lucas te regala estos dolaritos: $" + money + ". Ahora tienes $" + billetera + " en la billetera.");
    }

    
    public void jugarFutbol() {
        System.out.println("S� jugar futbol gracias a mi hermano.");
    }

    public int jugarLoteria() {
        billetera += FORTUNA; 
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + NUMERO_DE_SUERTE); 
        System.out.println("Heredaste la fortuna de " + FORTUNA + " de tu madre La Rosa!! Ahora tienes en la billetera: $" + billetera); 
        return NUMERO_DE_SUERTE ;
    }
}
