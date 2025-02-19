package OOP;

public class Main {
    public static void main(String[] args) {

    // create an object
     Uzumaki naruto = new Uzumaki();
     naruto.setName("Naruto OOP.Uzumaki");
     naruto.setVillage("Hidden Leaf");
     naruto.setAge(12);

     Uchiha sasuke = new Uchiha();
     sasuke.setName("Sasuke OOP.Uchiha");
     sasuke.setVillage("Hidden Leaf");
     sasuke.setAge(13);
     System.out.println("OOP.Ninja name: " + sasuke.getName());
     sasuke.activatedSharingan();

     Hatake kakashi = new Hatake();
     kakashi.setName("Kakashi OOP.Hatake");
     kakashi.setVillage("Hidden Leaf");
     kakashi.activatedSharingan();





    }
}
