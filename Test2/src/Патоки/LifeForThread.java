package Патоки;

public class LifeForThread {
    public static void main(String[] args) {
        new LifeTheread().start();//ворой поток хапускается первым с помощью метода  theread
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("theread=4");

    }
}

class LifeTheread extends Thread{
    @Override
    public void run(){
        System.out.println(currentThread().getName());
    }
}