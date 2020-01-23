package Патоки;

public class MyTheread {
    public static void main(String[] args) {
        new MyRunnabl().start();
        new MyRunnabl().start();
        new MyRunnabl().start();
        new MyRunnabl().start();
        new MyRunnabl().start();




    }
}
 class MyRunnabl extends  Thread{
    @Override
    public void run(){
        for (int i=0;i<40;i++){
            System.out.println("потоки="+currentThread().getName()+" ="+i);
        }
    }

}