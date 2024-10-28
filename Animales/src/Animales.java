
public class Animales {
    //atributos
    String tipo;
    String raza;
    String Nombre;
    String peligroso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPeligroso() {
        return peligroso;
    }

    public void setPeligroso(String peligroso) {
        this.peligroso = peligroso;
    }

    //metodos
    public String detalleanimales() {
        // Construimos el string y lo devolvemos
        return "------------\n" +
                "Es peligroso ? :  " + getPeligroso() + "\n" +
                "---------------\n" +
                "La raza es   = " + getRaza() + "\n" +
                "---------------\n" +
                "Nombre del animal = " + getNombre() + "\n" +
                "---------------\n" +
                "Clase Animal  = " + getTipo();
    }
}