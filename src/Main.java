public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("jefazo", 8);
        Gato gato = new Gato("manchas", 4);

        System.out.println("Nombre: " + perro.getName() + " edad: " + perro.getAge());
        perro.hacerSonido();
        perro.comiendo();
        perro.bebiendo();
        perro.dormir();

        System.out.println("Nombre: " + gato.getName() + " edad: " + gato.getAge());
        gato.hacerSonido();
        gato.comiendo();
        gato.bebiendo();
        gato.dormir();
    }
}
