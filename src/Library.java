
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Library implements Observer {

    LinkedList<trackMusic> lib = new LinkedList<trackMusic>();

    private trackMusic track;
    private double sum_price;

    public void addTrack(trackMusic track) {
        if (lib.contains(track)) {
            System.out.println("Taki utwor jest juz dodany do biblioteki!");
        } else {
            for (int i = 0; i < lib.size(); i++) {
                if (lib.get(i).getName() == track.getName()) {
                    System.out.println("UWAGA! Utwor o podobnej nazwie zostal dodany do biblioteki!");
                }
            }
            lib.add(track);
            track.addObserver(this);
        }
    }

    public void removeTrack(trackMusic track) {
        lib.remove(track);
        track.deleteObserver(this);
    }

    public void downloadTrack(int i) {
        System.out.println("### Pobrano utwor z biblioteki o indeksie: " + i + "\n"
                + "Nazwa utworu: " + lib.get(i).getName() + "\n"
                + "Wykonawca: " + lib.get(i).getContractor() + "\n"
                + "Cena: " + lib.get(i).getPrice() + " $\n");
    }

    public void allTracks() {
        if (lib.isEmpty()) {
            System.out.println("### Biblioteka jest pusta.");
        } else {
            System.out.println("### Dodane utwory do biblioteki:");
            for (int i = 0; i < lib.size(); i++) {
                System.out.println("Utwor numer: " + i + "\n"
                        + "Nazwa utworu: " + lib.get(i).getName() + "\n"
                        + "Wykonawca: " + lib.get(i).getContractor() + "\n"
                        + "Cena: " + lib.get(i).getPrice() + " $\n");
            }
        }
    }
    
    public void sumPrice(trackMusic track)
    {
        this.sum_price += track.getPrice();
    }

    public void getSumPrice() 
    {
        System.out.println("\n### Całkowity koszt odsłuchania wszystkich utworów wynosi: " + this.sum_price + " #");
    }     

    @Override
    public void update(Observable o, Object arg) {
        this.sumPrice((trackMusic) o);        
    }
}
