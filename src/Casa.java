public class Casa {
    private String zona;
    private int pisos;

    public Casa(String zona, int pisos) {
        this.zona = zona;
        this.pisos = pisos;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public String toString() {
        return "Casa en zona " + zona + ", pisos: "+ pisos;
    }
}

