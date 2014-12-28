/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Library lib = new Library();

        trackMusic track1 = new trackMusic("Whiskey Dream VIP", "Rudebrat", 14.52);
        trackMusic track2 = new trackMusic("Tytul", "Wykonawca", 1.52);
        trackMusic track3 = new trackMusic("List do M", "Dzem", 14.52);
        trackMusic track4 = new trackMusic("Whiskey Dream VIP", "Rudebrat", 14.52);
        
        lib.addTrack(track1);
        lib.addTrack(track4);
        lib.addTrack(track2);
        lib.addTrack(track3);

        lib.allTracks();

        System.out.println(track1.playTrack());

        lib.removeTrack(track1);

    }

}
