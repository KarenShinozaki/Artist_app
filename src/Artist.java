import java.time.LocalDate;

public class Artist {
    private String name;
    private Music musicAndGenre;
    private int numberOfMusical;
    private LocalDate birthday;
    private long age;
    private String movie;
    private long aliveYears;
    private String period;
    private LocalDate death;


    //存命中

    public Artist(String name, Music musicAndGenre, int numberOfMusical) {
        this.name = name;
        this.musicAndGenre = musicAndGenre;
        this.numberOfMusical = numberOfMusical;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday) {
        this(name,musicAndGenre,numberOfMusical);
        this.birthday = birthday;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical,LocalDate birthday,long age) {
        this(name,musicAndGenre,numberOfMusical,birthday);
        this.age = age;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical,LocalDate birthday, long age,String movie) {
        this(name,musicAndGenre,numberOfMusical,birthday,age);
        this.movie = movie;
    }

    public Artist(String name, Music musicAndGenre, int numberOfMusical, LocalDate birthday, long aliveYears, String period, LocalDate death) {
        this(name,musicAndGenre,numberOfMusical,birthday);
        this.aliveYears = aliveYears;
        this.period = period;
        this.death = death;
    }

    public String toString() {
        String diedArtist = this.getName() + "は"/* + this.getGenre()*/ + "作曲家です。" + this.getBirthday() + "に生まれました。その時代は"
                + this.getPeriod() + "の時代で、作曲した有名な曲は" + this.getMusicAndGenre().getMusicTitle()  + "です。"+"この曲のジャンルは"
                +this.getMusicAndGenre().getGenre().getGenreName() + "です。" +this.getDeath()+"で死没。"
                + this.getAliveYears() + "歳で生涯を終え、その生涯の中で" + this.getNumberOfMusical() + "もの曲を作曲したといわれています。";
        String aliveArtist = this.getName()+"はアーティストです。" + this.getBirthday() + "に生まれました。現在" + this.getAge() + "歳で、有名な曲は"
                +this.getMusicAndGenre().getMusicTitle() + "です。" +"この曲のジャンルは" +this.getMusicAndGenre().getGenre().getGenreName() + "です。" +
                "現在" + this.getNumberOfMusical() + "の曲をリリースしています。";
        if (this.movie != null) {
            aliveArtist += "\n"+"映画にも出演し、" + this.getMovie() + "は、過去の" + this.getName() + "の経験をつづった映画で、自身で監督及び主演を務めました。";
        }
        if(this.death != null){return diedArtist;}else
        return aliveArtist;
    }


    //　getter

    public long getAge(){return this.age;}
    public String getMovie(){return this.movie;}
    public long getAliveYears(){return this.aliveYears;}
    public String getPeriod(){return this.period;}
    public LocalDate getDeath(){return this.death;}
    public LocalDate getBirthday(){return this.birthday;}
    public Music getMusicAndGenre() {
        return this.musicAndGenre;
    }
    public int getNumberOfMusical() {
        return this.numberOfMusical;
    }
    public String getName(){return this.name;}



}
