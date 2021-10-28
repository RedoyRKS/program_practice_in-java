import java.lang.annotation.Target;

public class Player implements Runnable {
    Thread t;
    //string name
    public Player(String name){
        //set the player name such as the thresd name is the player name
        //hint 1: set name()
        t = new Thread( this);
        t.setName(name);
        t.start();

    }

    @Override
    public void run (){
        System.out.println(t.getName() + " starts the race.");
        for(int i = 1; i<=3; i++)
        {
            System.out.println(t.getName() + " clossed " + i + " obstacle "); 
        }
        System.out.println(t.getName() + " finishes the race.");
    }
    
}

class competition{
    public static void main(String[] args) {
        Player p1 = new Player("A");
        Player p2 = new Player("B");
        Player p3 = new Player("C");
    }
}
