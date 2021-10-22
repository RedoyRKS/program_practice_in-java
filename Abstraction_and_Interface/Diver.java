public class Diver {
    public static void main(String[] args) {
      /*  Mobile m1 = new Mobile();
        m1.speker = 2;
        m1.name = "Nokia asha";
        m1.glass = 1;
        m1.cemera = 2;
        m1.features= 30;
        m1.phoneDetails(); */
         
        Realme r1 = new Realme();
        r1.speker = 2;
        r1.name = "Realme 5i";
        r1.glass = 1;
        r1.cemera = 6;
        r1.features= 45;
        r1.color= "Lake Green";
        r1.phoneDetails();
        r1.goTo();
        
        Mobile m2 = new Realme();
        m2.name = "SAMSUNG GURU MUSIC";
        m2.speker = 2;
        m2.phoneDetails();

        Crow c1 = new Crow();
        System.out.println("Crow_Details");
        c1.animalSound();
        c1.drinking();
        c1.fly();


        Animal a1 = new Crow();{
          System.out.println("Animal_Details");
          a1.animalSound();
        }

    }
}
