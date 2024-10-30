public class App {
    public static void main(String[] args) throws Exception {
        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Claro", "123456789", 200.0);

        Padre papa = new Padre(fordFocus);
        
        System.out.println("Papá me dejó esta casa en zona " + papa.getCasa().getZona());

        Hijo juanCarlos = new Hijo("Juan Carlos", celular, cascajo);

        System.out.println("Papá me dejó este auto: " + juanCarlos.getAuto().getModelo());

        juanCarlos.conducirAuto(fordFocus);

        juanCarlos.jugarFutbol();

        juanCarlos.bailar();

        juanCarlos.jugarLoteria();

        juanCarlos.cantar();

        juanCarlos.heredarDinero(2000);

        juanCarlos.hacerGoles();
    }
}
