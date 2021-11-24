package pl.klasyabstract;

public class Kwadrat extends Figura{

    private float bok = 0.0f;

    public Kwadrat(String nazwa) {
        super(nazwa);
    }

    void dlugoscBoku(float bok){
        this.bok = bok;
    }

    @Override
    public void wyliczPole() {
        pole = bok * bok;
    }


    @Override
    public void wyslijInfoDoSzefa(String info) {

    }

    @Override
    public void wydrukujDane() {

    }
}
