package Фасад;

public class FasadeApp {
    public static void main(String[] args) {
       // Power power=new Power();//включаем комп
      //  power.on();

     //   DVDrom dvDrom=new DVDrom();//вставляем диск
        //dvDrom.load();

        //HHD hhd=new HHD();// коипуем данные в диск
      //  hhd.copyFrowDVDrom(dvDrom);

        FasadComp fasadComp=new FasadComp();
        fasadComp.copy();
    }

}

class  Power {
    void on(){
        System.out.println("Включить ");
    }
    void off(){
        System.out.println("Выключить");
    }
}
class DVDrom{
    private boolean data=false;
    public boolean hasData(){
        return data;//возврощает данные виде истина или ложь
    }
    void load(){
        data=true;
    }
    void unload(){
        data=false;
    }
}
class  HHD{
    void copyFrowDVDrom(DVDrom dvDrom){
        if (dvDrom.hasData()){
            System.out.println("загрузка");
        }else {
            System.out.println("Вствьте диск");
        }
        }

    }

class FasadComp{// класс фасад для упращения
    Power power=new Power();//включаем комп
    DVDrom dvDrom=new DVDrom();//вставляем диск
    HHD hhd=new HHD();// коипуем данные в диск

    void copy(){
        power.on();
        dvDrom.load();
        hhd.copyFrowDVDrom(dvDrom);
    }
}