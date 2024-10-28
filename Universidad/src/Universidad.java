public class Universidad {
    private String Nombre;
    private String Ubicacion;
    private String Ciudad;

    public Universidad() {
    }
    public Universidad (String Nombre, String Ubicacion, String Ciudad){
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.Ubicacion = ubicacion;
    }

    public void setCiudad (String ciudad) {
        this.Ciudad = ciudad;
    }

    public String detalleUniversidad (){
        return "Nombre de la Universidad : "+getNombre()+"\n"+
                "Ciudad : "+getCiudad()+"\n"+
                "Ubicacion : "+getUbicacion();
    }
}
