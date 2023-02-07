import java.time.YearMonth;

public abstract class GroupArtist extends Artist{
    private YearMonth activityStart;
    private YearMonth activityendOrNow;
    private long ActivityPeriod;

    public GroupArtist(String name, String popularMusic, int numberOfMusical, YearMonth activityStart, YearMonth activityendOrNow, long ActivityPeriod){
        super(name,popularMusic,numberOfMusical);
        this.activityStart = activityStart;
        this.activityendOrNow = activityendOrNow;
        this.ActivityPeriod = ActivityPeriod;
    }

    public abstract String getGenre();

    public YearMonth getActivityStart(){return this.activityStart;}
    public YearMonth getActivityendOrNow(){return this.activityendOrNow;}

    public String toString(){
        return this.getName()+ "は" + this.getActivityStart() +"に活動を開始した" + this.getGenre()+"グループです。"
                 + this.getActivityendOrNow()+ "までの活動していた"+this.getActivityPeriod()+"年間に"+getNumberOfMusical()+"曲を発表しました。"
                 +"有名な曲は"+this.getPopularMusic()+"です。";

    }

    public long getActivityPeriod() {
        return this.ActivityPeriod;
    }

}
