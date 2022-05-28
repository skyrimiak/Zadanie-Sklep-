package Obiekty;

public class Klient {
    private String nazwisko;
   public  Koszyk koszyk;
    //tworzymy konstruktor

    public Klient(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    //klient dostaje koszyk
    public Koszyk dodaj_koszyk(Koszyk koszyk)
    {
        this.koszyk=koszyk;
        return koszyk;

    }


    public Koszyk getKoszyk() {
        return koszyk;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
