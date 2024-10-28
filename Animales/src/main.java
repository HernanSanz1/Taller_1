public class main {
    public static void main(String[] args) {
        Animales ani1 = new Animales();

        ani1.setPeligroso("NO ES PELIGROSO");
        ani1.setRaza("NO IDENTIFICADA");
        ani1.setTipo("MAMIFERO");
        ani1.setNombre("PAJARO AZULEJO");


        System.out.println(ani1.detalleanimales());

    }
}
