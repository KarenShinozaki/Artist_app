import java.time.LocalDate;

public abstract class SoloArtist extends Artist {
    private String name;
    private LocalDate birthday;

    public SoloArtist(String name, String popularMusic, int numberOfMusical, LocalDate birthday) {
        super(popularMusic, numberOfMusical);
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public String getName() {
        return this.name;
    }

    public abstract void play();
}
