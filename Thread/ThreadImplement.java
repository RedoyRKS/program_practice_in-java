public class ThreadImplement implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running & value is " + i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
