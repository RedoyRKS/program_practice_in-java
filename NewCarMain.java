class NewCar { 
    //member variable
    public int wheels;
    public String model;
    public float price;

    //methode
    public void CanStart()
    {
        System.out.println("I am starting");
    }
    public void CanStop()
    {
        System.out.println("I am stoping");
    }

}

public class NewCarMain {
    public static void main(String[] args) {
        //object instantion
        NewCar toyota = new NewCar();

        toyota.wheels = 4;
        toyota.model = "Allion";
        toyota.price = 490.00F;
         
        System.out.println("WHEELS : " +toyota.wheels);
        System.out.println("MODEL : " +toyota.model);
        System.out.println("PRICE : " +toyota.price);

        toyota.CanStart();
        toyota.CanStop();

    }
    
}
