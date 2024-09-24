package FacadePattern;

import FacadePattern.Subsystems.DVDPlayer;
import FacadePattern.Subsystems.Lights;
import FacadePattern.Subsystems.Projector;
import FacadePattern.Subsystems.SoundSystem;

public class FacadePatternDemo {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern...!!!");
        System.out.println();

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);
        homeTheaterFacade.watchMovie("Inception");
        System.out.println();
        homeTheaterFacade.endMovie();
    }
}
