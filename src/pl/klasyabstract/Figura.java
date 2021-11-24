package pl.klasyabstract;

public abstract class Figura  implements WysylkaInformacji {
    private String nazwaFigury = "";
    private String kolor = "Biały";
    public float pole = 0.0f;

    public Figura(){
    }

    public Figura(String nazwaFigury){
        this.nazwaFigury = nazwaFigury;
    }

    public abstract void wyliczPole();

    public String getNazwaFigury() {
          return nazwaFigury;
    }

    public void setNazwaFigury(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
