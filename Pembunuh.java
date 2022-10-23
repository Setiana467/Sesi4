package sesi4;

public class Pembunuh extends Pahlawan{
    
    public void suaraKhas(){
        super.suaraKhas();
            System.out.println("we fight the darkness to uphold the light");
    }

    public static void main(String[] args) {
        Pembunuh a = new Pembunuh();

        a.suaraKhas();
    }

}
