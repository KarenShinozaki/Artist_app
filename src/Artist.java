import java.time.LocalDate;

public abstract class Artist {

    private String popularMusic;
    private int numberOfMusical;


    public Artist(String popularMusic, int numberOfMusical) {
//      this.name = name;
        this.popularMusic = popularMusic;
        this.numberOfMusical = numberOfMusical;
    }

    //　抽象メソッド
    public abstract String getGenre();

    //　getter
    public String getPopularMusic() {
        return this.popularMusic;
    }

    public int getNumberOfMusical() {
        return this.numberOfMusical;
    }
}
