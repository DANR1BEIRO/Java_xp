public class Uchiha extends Ninja implements Sharingan{

    public void activatedSharingan() {
        System.out.println("Sharingan activated by interface inside the uchiha class");
    }
    @Override
    public void basicAttack() {
        System.out.println("Throw a fire kunai");
    }

    public void basicAttack(String chidori) {
        System.out.println("Attacking with chidori");
    }
}


