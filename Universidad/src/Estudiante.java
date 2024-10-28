public class Estudiante {
    private String nombre;
    private String carrera;
    private String iD;
    private String Modalidad;

    public Estudiante() {
    }
    public Estudiante(String nombre, String carrera, String iD, String Modalidad) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getId() {
        return iD;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setId(String iD) {
        this.iD = iD;
    }

    public void setModalidad(String modalidad) {
        this.Modalidad = modalidad;
    }

    public String detalleEstudiante(){
        return "Nombre del Estudiante: "+getNombre()+"\n"+
                "Carrera: "+getCarrera()+"\n"+
                "ID: "+getId()+"\n"+
                "Modalidad: "+getModalidad();

    }
}
