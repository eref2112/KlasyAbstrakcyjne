package pl.klasyabstract;

public class Start {

    public  static  void main(String[] args){

        Trojkat trojkat = new Trojkat("Mój trójkąt");
        trojkat.setKolor( "Czerwony");
        trojkat.ustawWymiary(10f, 20f);
        trojkat.wyliczPole();


        Prostokat prostokat = new Prostokat("Mój prostokat");
        prostokat.setKolor( "Czerwony");
        prostokat.ustawDlugosciBokow(25f, 20f);
        prostokat.wyliczPole();

        Kwadrat kwadrat = new Kwadrat("Mój prostokat");
        kwadrat.setKolor( "Czerwony");
        kwadrat.dlugoscBoku(20f);
        kwadrat.wyliczPole();


        //System.out.println("Nazwa firury trójkątnej: " + trojkat.getNazwaFigury());
        //System.out.println("Nazwa figury prostokątnej: " + prostokat.getNazwaFigury());

        System.out.println("Pole figury trójkąnej: " + trojkat.pole);
        System.out.println("Pole figury prostokątnej: " + prostokat.pole);
        System.out.println("Pole kwadratu: " + kwadrat.pole);
    }

}
