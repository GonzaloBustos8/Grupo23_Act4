public class Auto {
    private double combustible;
    private String modelo;
    private String patente;

    public Auto(String modelo, String patente) {
        this.combustible = 50.0;
        this.modelo = modelo;
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Auto{" + "combustible=" + combustible + ", modelo=" + modelo + ", patente=" + patente +'}';
    }
}
