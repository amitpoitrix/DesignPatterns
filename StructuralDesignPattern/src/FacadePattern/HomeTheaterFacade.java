package FacadePattern;

import FacadePattern.Subsystems.DVDPlayer;
import FacadePattern.Subsystems.Lights;
import FacadePattern.Subsystems.Projector;
import FacadePattern.Subsystems.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down Home Theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
