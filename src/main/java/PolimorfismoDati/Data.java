package PolimorfismoDati;

import java.util.Date;

public class Data {
    public Object o = new Date();
    public void some(){
        System.out.println("sole!");
    }

    public static void main(String[] args) {
        System.out.println(new Data().o.toString());
    }

    abstract class veicolo extends Data{
        abstract void accelere();

        public void someElse(){
            super.some();
        }
    }
}
