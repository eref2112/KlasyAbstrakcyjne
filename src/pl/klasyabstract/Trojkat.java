package pl.klasyabstract;

public class Trojkat extends Figura{
    private float wysokosc = 0.0f;
    private float podstawa = 0.0f;

    public Trojkat(String nazwa) {
        super(nazwa);
    }

    void ustawWymiary(float wysokosc, float podstawa){
        this.wysokosc = wysokosc;
        this.podstawa = podstawa;
    }

    @Override
    public void wyliczPole() {
        pole = (podstawa * wysokosc)/2;
    }


    @Override
    public void wyslijInfoDoSzefa(String info) {

    }

    @Override
    public void wydrukujDane() {

    }
}
