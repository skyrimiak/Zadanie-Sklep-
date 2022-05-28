package symulacja;

import Obiekty.Klient;
import Obiekty.Koszyk;
import Obiekty.Produkt;

import java.util.ArrayList;

public class Sklep {

    public ArrayList<Produkt> listaProduktow = new ArrayList<Produkt>();
    public ArrayList<Klient> lista_klientow = new ArrayList<Klient>();

    public static void main(String[] args) {

        Sklep s1= new Sklep();

        //tworzymy kilka produktów

        Produkt p1= new Produkt("Mleko",4.5);
        Produkt p2= new Produkt("Kalafior",3.0);
        Produkt p3 = new Produkt("Czekolada",5.9);
        Produkt p4 = new Produkt("Sok",4);
        Produkt p5 = new Produkt("Banany",6);

        //dodajemy produkty do listyProduktow

        s1.listaProduktow.add(p1);
        s1.listaProduktow.add(p2);
        s1.listaProduktow.add(p3);
        s1.listaProduktow.add(p4);
        s1.listaProduktow.add(p5);

        System.out.println("\t Dostępne produkty w sklepie: \n");
        System.out.println(s1.listaProduktow);

        //tworzenie koszykow i klientów
        Koszyk k1= new Koszyk();
        Koszyk k2= new Koszyk();
        Koszyk k3=  new Koszyk();
        Koszyk k4= new Koszyk();
        Koszyk k5= new Koszyk();

        //tworzenie klientów i dopoasowanie do nich koszyka

        Klient klient1= new Klient("Kowalski");
        klient1.dodaj_koszyk(k1);
        Klient klient2= new Klient("Wisniewski");
        klient2.dodaj_koszyk(k2);
        Klient klient3= new Klient("Borucka");
        klient3.dodaj_koszyk(k3);
        Klient klient4= new Klient("Kuzmicz");
        klient4.dodaj_koszyk(k4);
        Klient klient5= new Klient("Wokulski");
        klient5.dodaj_koszyk(k5);

        //dodajemy klientów do listy klientów
        s1.lista_klientow.add(klient1);
        s1.lista_klientow.add(klient2);
        s1.lista_klientow.add(klient3);
        s1.lista_klientow.add(klient4);
        s1.lista_klientow.add(klient5);

        System.out.println("\t Klienci: \n");
        System.out.println(s1.lista_klientow);
//dodajemy produkty do koszyków klientów

        klient1.getKoszyk().dodaj_produkt(p2);
        klient1.getKoszyk().dodaj_produkt(p4);
        klient2.getKoszyk().dodaj_produkt(p5);
        klient2.getKoszyk().dodaj_produkt(p3);
        klient3.getKoszyk().dodaj_produkt(p1);
        klient3.getKoszyk().dodaj_produkt(p4);
        klient4.getKoszyk().dodaj_produkt(p5);
        klient5.getKoszyk().dodaj_produkt(p1);

        System.out.println();
        System.out.println("\t Obsługa klientów: \n");
        //obsługa klientów
        System.out.println(klient1);
        klient1.getKoszyk().wyswietl_zakupy();
        klient1.getKoszyk().wartosc_koszyka(k1,s1.listaProduktow);
        System.out.println();
        System.out.println(klient2);
        klient2.getKoszyk().wyswietl_zakupy();
        klient2.getKoszyk().wartosc_koszyka(k2,s1.listaProduktow);
        System.out.println();
        System.out.println(klient3);
        klient3.getKoszyk().wyswietl_zakupy();
        klient3.getKoszyk().wartosc_koszyka(k3,s1.listaProduktow);
        System.out.println();
        System.out.println(klient4);
        klient4.getKoszyk().wyswietl_zakupy();
        klient4.getKoszyk().wartosc_koszyka(k4,s1.listaProduktow);
        System.out.println();
        System.out.println(klient5);
        klient5.getKoszyk().wyswietl_zakupy();
        klient5.getKoszyk().wartosc_koszyka(k5,s1.listaProduktow);
        System.out.println();
        //cały utarg
        double caly_utarg=0;
        for(int i=0;i<s1.lista_klientow.size();i++)
        {
            caly_utarg+=s1.lista_klientow.get(i).getKoszyk().getSuma();
        }
        System.out.println("Caly utarg wynosi: "+caly_utarg);

        //utarg szczegółowy

        System.out.println();
        System.out.println("Utarg szczegolowy: ");

k1.utarg_dla_produktu(s1.listaProduktow);



    }
}
