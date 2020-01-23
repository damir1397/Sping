package Патоки;

public class MainSync {
    public static void main(String[] args) {
        ThreadSource threadSource1=new ThreadSource();
        ThreadSource threadSource2=new ThreadSource();
        Resource resource=new Resource();
        resource.i=5;
        threadSource1.setResource(resource);
        threadSource2.setResource(resource);
        threadSource1.start();
        threadSource2.start();
        try {
            threadSource1.join();
            threadSource2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resource.i);

    }

}

class ThreadSource extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.change();

    }
}
class Resource{
    int i;

    public synchronized void  change(){
        int i=this.i;
        i++;
        this.i=i;
    }

}

