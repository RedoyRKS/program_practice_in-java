class Laptop{
    public String name;
    public int camera;
    public int speaker;
    public float version;

    public void Run()
    {
        System.out.println("This is Windoes version");
    } 

}

public class LaptopMain{
    public static void main(String[] args) {

        Laptop L14 = new Laptop();

        L14.name = "Lenovo L14";
        L14.speaker = 2;
        L14.camera = 1;
        L14.version = 10.00F;

        System.out.println("Name : "+L14.name);
        System.out.println("Speaker : "+L14.speaker);
        System.out.println("Camera : "+L14.camera);
        System.out.println("Version : "+L14.version);

        L14.Run();
    }
}
