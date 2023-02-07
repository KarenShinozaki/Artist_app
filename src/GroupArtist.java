import java.time.YearMonth;

public abstract class GroupArtist extends Artist{
    private YearMonth activityStart;
    private YearMonth activityend;

    public GroupArtist(String name,String popularMusic,int numberOfMusical,YearMonth activityStart,YearMonth activityend){
        super(name,popularMusic,numberOfMusical);
        this.activityStart = activityStart;
        this.activityend = activityend;
    }
    public abstract void play();

    public abstract String getGenre();

    public YearMonth getActivityStart(){return this.activityStart;}
    public YearMonth getActivityend(){return this.activityend;}

}
