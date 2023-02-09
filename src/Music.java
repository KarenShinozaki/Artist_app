public class Music {
    private String musicTitle;
    private Genre genre;

    public Music(String musicTitle ,Genre genre) {
        this.musicTitle = musicTitle;
        this.genre = genre;
    }

    public String getMusicTitle(){return this.musicTitle;}
    public Genre getGenre(){return this.genre;}

    public String toString(){
        return this.getMusicTitle()+"は"+this.getGenre().getGenreName()+"の曲です。";
    }

}
