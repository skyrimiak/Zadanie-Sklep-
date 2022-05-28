package Obiekty;

import java.util.ArrayList;

public class Koszyk {
    double suma=0;
    private ArrayList<Produkt> lista_zakupow = new ArrayList<Produkt>();

    public Koszyk()
    {

    }


    //metoda dodaje produkt do listy zakupów

    public void dodaj_produkt(Produkt p)
    {
        lista_zakupow.add(p);
p.ilosc_produkt++;
    }

    public void wyjmij_produkt(Produkt p)
    {
        lista_zakupow.remove(p);
    }

    public void wartosc_koszyka(Koszyk k, ArrayList<Produkt> pr)
    {
        double suma=0;
        for(int i=0;i<k.lista_zakupow.size();i++) {
            for (i = 0; i < pr.size(); i++) {
                if (k.lista_zakupow.contains(pr.get(i))) {
                    suma += pr.get(i).getCena();
                }

            }
        }
        System.out.println("Wartość koszyka= "+suma );
        this.suma=suma;
        }

       public void utarg_dla_produktu(ArrayList<Produkt> pr)
       {
         for(int i=0;i<pr.size();i++)
         {
             System.out.println(pr.get(i).getNazwa()+" "+(pr.get(i).ilosc_produkt)*pr.get(i).getCena());
         }
       }


        //zwraca wartosc koszyka
    public double getSuma() {
        return suma;
    }

    public void wyswietl_zakupy()
    {
        for(int i=0;i<lista_zakupow.size();i++)
        {
            System.out.println(lista_zakupow.get(i));
        }
    }
}
