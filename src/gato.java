class Gato {
    private String name;
    private int age;

    public Gato(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void hacerSonido() {
        System.out.println("El gato hace: Miau miau");
    }

    public void comiendo() {
        System.out.println("El gato está comiendo");
    }

    public void bebiendo() {
        System.out.println("El gato está bebiendo");
    }

    public void dormir() {
        System.out.println("El gato está durmiendo");
    }
}