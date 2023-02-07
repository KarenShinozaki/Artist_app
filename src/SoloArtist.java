import java.time.LocalDate;

public abstract class SoloArtist extends Artist{

    private LocalDate birthday;

    public SoloArtist(String name, String popularMusic, int numberOfMusical, LocalDate birthday) {
        super(name, popularMusic,numberOfMusical);
        this.birthday = birthday;
    }
    public LocalDate getBirthday(){return this.birthday;}
}
