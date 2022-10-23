package sesi4;

public class Mage extends Pahlawan{

    public void suaraKhas(){
        super.suaraKhas();
        System.out.println("Expecto Patronum");
    }

    public static void main(String[] args) {
        Mage n = new Mage();
        n.suaraKhas();
    }

}
