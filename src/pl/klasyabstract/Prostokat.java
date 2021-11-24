package pl.klasyabstract;

public  class Prostokat extends Figura {

    public Prostokat(String nazwa) {

        super(nazwa);
    }

    private float bok1 = 0.0f;
    private float bok2 = 0.0f;

    void ustawDlugosciBokow(float bok1, float bok2){
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public void wyliczPole() {
        pole = bok1 * bok2;
    }


    @Override
    public void wyslijInfoDoSzefa(String info) {

    }

    @Override
    public void wydrukujDane() {

    }
}
