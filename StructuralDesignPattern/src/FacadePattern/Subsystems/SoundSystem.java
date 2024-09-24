package FacadePattern.Subsystems;

// Subsystem 3
public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound volume set to: " + level);
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }
}
