import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Artist {
    private String name;
    private Music musicAndGenre;
    private int numberOfMusical;
    private LocalDate birthday;
    private String movie;
    private LocalDate death;


    //存命中

    public Artist(String name, Music musicAndGenre, int numberOfMusical) {
        this.name = name;
        this.musicAndGenre = musicAndGenre;
        this.numberOfMusical = numberOfMusical;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday) {
        this(name, musicAndGenre, numberOfMusical);
        this.birthday = birthday;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday, LocalDate death) {
        this(name, musicAndGenre, numberOfMusical, birthday);
        this.death = death;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday, String movie) {
        this(name, musicAndGenre, numberOfMusical, birthday);
        this.movie = movie;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday, LocalDate death, String movie) {
        this(name, musicAndGenre, numberOfMusical, birthday, death);
        this.movie = movie;
    }

    public String toString() {
        if (isDied()) {
            String diedArtist = this.getName() + "はアーティストです。" + this.getBirthday() + "に生まれました。" +
                    "作曲した有名な曲は" + this.getMusicAndGenre().getMusicTitle() + "です。" + "この曲のジャンルは"
                    + this.getMusicAndGenre().getGenre().getGenreName() + "です。" + this.getDeath().get() + "で死没。"
                    + this.getAge() + "歳で生涯を終え、その生涯の中で" + this.getNumberOfMusical() + "もの曲を出したといわれています。";
            if (isPresentMovie()) {
                diedArtist += "\n" + this.getMovie().get() + "は、" + this.getName() + "について描かれた映画です。";
            }
            return diedArtist;
        }
        if (isAlive()) {
            String aliveArtist = this.getName() + "はアーティストです。" + this.getBirthday() + "に生まれました。現在" + this.getAge() + "歳で、有名な曲は"
                    + this.getMusicAndGenre().getMusicTitle() + "です。" + "この曲のジャンルは" + this.getMusicAndGenre().getGenre().getGenreName() + "です。" +
                    "現在" + this.getNumberOfMusical() + "の曲を出したと言われています。";
            if (isPresentMovie()) {
                aliveArtist += "\n" + this.getMovie().get() + "は、" + this.getName() + "について描かれた映画です。";
            }
            return aliveArtist;
        } else {
            return "あてはまるコンストラクタがありません";
        }
    }


    public boolean isDied() {
        return this.getDeath().isPresent();
    }

    public boolean isPresentMovie() {
        return this.getMovie().isPresent();
    }

    public boolean isAlive() {
        return !isDied();
    }

    //　getter

    public long getAge() {
        return ChronoUnit.YEARS.between(this.getBirthday(), this.getDeath().orElse(LocalDate.now()));
    }

    public Optional<String> getMovie() {
        return Optional.ofNullable(this.movie);
    }

    public Optional<LocalDate> getDeath() {
        return Optional.ofNullable(this.death);
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public Music getMusicAndGenre() {
        return this.musicAndGenre;
    }

    public int getNumberOfMusical() {
        return this.numberOfMusical;
    }

    public String getName() {
        return this.name;
    }


}
