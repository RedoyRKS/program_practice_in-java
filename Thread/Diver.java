public class Diver {
    public static void main(String[] args) {
        /*Test t1 = new Test();
        Test t2 = new Test();

        System.out.println("t1 is running");
        t1.run();

        System.out.println("t2 is running");
        t2.run();*/

        ThreadExampule th1 = new ThreadExampule();
        ThreadExampule th2 = new ThreadExampule();
        ThreadExampule th3 = new ThreadExampule();
        ThreadExampule th4 = new ThreadExampule();

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        Thread th5 = new Thread(new ThreadImplement());
        Thread th6 = new Thread(new ThreadImplement());

        th5.start();
        th6.start();
        
    }
}
     
