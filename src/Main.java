abstract  class Animal{
    String raza;
    String nombre;
    String color;

    public Animal(String raza, String nombre, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
    }

    abstract void comiendo();
    abstract void dormir();
    abstract int  edad(int age);
    abstract String edad(String age);
}

class Perro extends Animal{

    public Perro(String raza, String nombre, String color) {
        super(raza, nombre, color);
    }

    int edad(int age)
    {
        return age;
    }
    String edad(String age)
    {
        return age;
    }

    void comiendo(){
        System.out.println(nombre + " esta comiendo");
    }
    void dormir(){
        System.out.println(nombre + " esta duermindo");
    }
}

class Gato extends Animal{
    public Gato(String raza, String nombre, String color) {
        super(raza, nombre, color);
    }

    int edad(int age)
    {
        return age;
    }
    String edad(String age)
    {
        return age;
    }

    void comiendo(){
        System.out.println(nombre + " esta comiendo");
    }
    void dormir(){
        System.out.println(nombre + " esta duermindo");
    }
}

class Pajaro extends Animal{
    public Pajaro(String raza, String nombre, String color) {
        super(raza, nombre, color);
    }

    int edad(int age)
    {
        return age;
    }
    String edad(String age)
    {
        return age;
    }

    void comiendo(){
        System.out.println(nombre + " esta comiendo");
    }
    void dormir(){
        System.out.println(nombre + " esta duermindo");
    }
}

public class Main{
    
    public static void main(String[] args) {
        Animal miAnimal;
        miAnimal = new Perro("Labrador","Kira","Cafe");
        miAnimal.comiendo();
        miAnimal.dormir();
        System.out.println("Edad [int]: " + (miAnimal.edad(10)));
        System.out.println("Edad [String]: " + (miAnimal.edad("10")));
        System.out.println("\n");
        miAnimal = new Gato("Siames","Mika","Blanco");
        miAnimal.comiendo();
        miAnimal.dormir();
        System.out.println("Edad [int]: " + (miAnimal.edad(10)));
        System.out.println("Edad [String]: " + ( miAnimal.edad("10")));
        System.out.println("\n");
        miAnimal = new Pajaro("Loro","Tony","Azul");
        miAnimal.comiendo();
        miAnimal.dormir();
        System.out.println("Edad [int]: " + (miAnimal.edad(10)));
        System.out.println("Edad [String]: " + (miAnimal.edad("10")));
        System.out.println("\n");
    }
}
