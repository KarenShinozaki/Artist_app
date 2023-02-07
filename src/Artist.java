public abstract class Artist {
   private String name;
   private String popularMusic;
   private int numberOfMusical;

    public Artist(String name, String popularMusic, int numberOfMusical){
        this.name  = name;
        this.popularMusic = popularMusic;
        this.numberOfMusical = numberOfMusical;
    }
    //　抽象メソッド
    public abstract void play();
//    public String getGenre(){return this.genre;};
    public abstract String getGenre();

    //　getter
    public String getName(){return this.name;}
    public String getPopularMusic(){return this.popularMusic;}

    public int getNumberOfMusical(){return this.numberOfMusical;}

}
