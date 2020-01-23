package Патоки;

public class PriorityTheread {
    public static void main(String[] args)  {
       SecondThread secondTheread= new SecondThread();
       secondTheread.start();// start  thread
        try {
            secondTheread.join();//выполняет этот поток до конца потом только следующее действие
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Thread.yield();//отдает свое  время в потоке
        System.out.println("MainTheRead");


    }
}
class SecondThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<40;i++){
        System.out.println("newTheread="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}