import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();

        universidad.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre de la Universidad","Nombre",1));
        universidad.setCiudad(JOptionPane.showInputDialog(null,"Ingrese la ciudad donde esta ubicada la"+"\nUNIVERSIDAD","CIUDAD",2));
        universidad.setUbicacion(JOptionPane.showInputDialog(null, "Ingrese el sector donde esta ubicada la"+ "\nUNIVERSIDAD","SECTOR",1));

        Estudiante estudiante = new Estudiante();


        estudiante.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante","NOMBRE",2));
        estudiante.setId(JOptionPane.showInputDialog(null,"Ingrese el ID del estudiante","ID",2));
        estudiante.setCarrera(JOptionPane.showInputDialog(null,"Ingrese la carrera del estudiante","CARRERA",2));
        estudiante.setModalidad(JOptionPane.showInputDialog(null,"Ingrese la modalidad (flex/presencial)","MODALIDAD",2));

        Curso curso = new Curso();

        curso.setHorario(JOptionPane.showInputDialog(null,"Ingrese la modalidad diurno o nocturno","MODALIDAD",1));
        curso.setNrc(JOptionPane.showInputDialog(null,"Ingrese el codigo del curso","CODIGO DE CURSO",1));
        curso.setParalelo(JOptionPane.showInputDialog(null,"Ingrese el paralelo del estudiante","PARALELO",1));

        JOptionPane.showMessageDialog(null,"----------------------\n"+universidad.detalleUniversidad()+"\n----------------------------------\n"+estudiante.detalleEstudiante()+"\n----------------------------------\n"+curso.detalleCur()+"\n----------------------------------\n","-Info-",2);
    }
}