package Патоки;

public class TheRead  {
    public static void main(String[] args) {
       MyTheRead myTheRead=new MyTheRead();
       myTheRead.start();
        System.out.println("Это новый поток 0 "+Thread.currentThread().getName());
        MyRunnable runnable=new MyRunnable();
        runnable.start();
    }
}
class MyTheRead extends Thread{
    @Override
    public void run(){
        System.out.println("Это новый поток 1 "+currentThread().getName());


    }

}

class MyRunnable extends Thread{
    @Override
    public void run(){
        System.out.println("Это новый поток 2 "+currentThread().getName());

    }

}