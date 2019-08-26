package Делегирование;

public class Pattern {
    public static void main(String[] args) {
        /*A a=new A();
        a.f();
        B b=new B();
        b.d();
        Triange triange=new Triange();
        Square square=new Square();
        Quadra quadra=new Quadra();


        triange.draw();
        square.draw();
        quadra.draw();*/

        Painter painter=new Painter();
        painter.setGrafics(new Triange());
        painter.draw();

        painter.setGrafics(new Square());
        painter.draw();
        painter.setGrafics(new Quadra());
        painter.draw();
    }
}

class A{
    void f(){
        System.out.println("f()");
    }
}
class  B{
    A a=new A();
    void d(){
        a.f();
    }
}
interface  Grafics{
    void draw();
}
class Triange implements Grafics {

    @Override
    public void draw() {
        System.out.println("Рисунок1");

    }
}
class Square implements Grafics {

    @Override
    public void draw() {
        System.out.println("Рисунок2");
    }
}
class Quadra implements Grafics {

    @Override
    public void draw() {
        System.out.println("Рисунок3");
    }
}

class Painter{
    Grafics grafics;
    void  setGrafics(Grafics g){
        grafics=g;
    }
    void draw(){
        grafics.draw();
    }
}