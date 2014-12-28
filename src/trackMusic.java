
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class trackMusic extends Observable {

    String name;
    String contractor;
    double price;

    public trackMusic(String name, String contractor, double price) {
        this.name = name;
        this.contractor = contractor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getContractor() {
        return contractor;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String playTrack() {
        setChanged();
        notifyObservers();        
        return "### Rozpoczęcie odtwarzania: " + getContractor() + " - " + getName() + "\n" + "Koszt: " + getPrice() + " $";
    }

}
