// herança - uma classe que pode acessar atributos de outra
public class uchiha extends ninja {

    public void sharinganActivated() {
        System.out.println("Sharingan activated");
   }
   
    @Override
    public void basicAttack() {
        System.out.println("I'm a ninja and i threw a fire kunai");
    }
    
}
