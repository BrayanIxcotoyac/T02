class Perro {
    private String name;
    private int age;

    public Perro(String name, int age) {
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
        System.out.println("El perro hace: Guau guau");
    }

    public void comiendo() {
        System.out.println("El perro está comiendo");
    }

    public void bebiendo() {
        System.out.println("El perro está bebiendo");
    }

    public void dormir() {
        System.out.println("El perro está durmiendo");
    }
}
