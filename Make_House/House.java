public class House {
    //member variable
    public int walls;
    public int doors;
    public int windows;
    public String location;
    public String nameplate;

    //member methode
    public void printNameplate()
    {
        System.out.println("This is " + this.nameplate +". It has " + this.walls + 
        " walls, " + this.doors + " doors, " + this.windows + " windows. Its name is " 
        + this.nameplate+ ", It's located at " + this.location );
    }

    //Constrctor name must be same as class name.
    //Constrctor is a methode, that has no return type.
    //This is public constrctor.

    public House() // Default constrctor.
    {
        walls = 4;
        doors = 1;
        windows = 2;
    }


}

