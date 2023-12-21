public class Persona {
    private String nombre;
    private String numTarjetaBanco;

    // Constructor
    public Persona(String nombre, String numTarjetaBanco) {
        this.nombre = nombre;
        this.numTarjetaBanco = numTarjetaBanco;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para numTarjetaBanco
    public String getNumTarjetaBanco() {
        return numTarjetaBanco;
    }
}