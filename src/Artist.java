import java.time.LocalDate;

public abstract class Artist {
   private String name;
   private String popularMusic;
   private LocalDate birthday;
   private int numberOfMusical;
   //private String genre;

    public Artist(String name, String popularMusic,LocalDate birthday,int numberOfMusical){
        this.name  = name;
        this.popularMusic = popularMusic;
        this.birthday = birthday;
        this.numberOfMusical = numberOfMusical;
        //this.genre = genre;
    }
    //　抽象メソッド
    public abstract void play();
//    public String getGenre(){return this.genre;};
    public abstract String getGenre();

    //　getter
    public String getName(){return this.name;}
    public String getPopularMusic(){return this.popularMusic;}
    public LocalDate getBirthday(){return this.birthday;}
    public int getNumberOfMusical(){return this.numberOfMusical;}

}
