import java.time.YearMonth;

public abstract class GroupArtist extends Artist{
    private String groupName;
    private YearMonth activityStart;
    private YearMonth activityEndOrNow;
    private long ActivityPeriod;
    SoloArtist name;

    public GroupArtist(String groupName,String popularMusic, int numberOfMusical, YearMonth activityStart, YearMonth activityEndOrNow, long ActivityPeriod){
        super(popularMusic,numberOfMusical);
        this.groupName = groupName;
        this.activityStart = activityStart;
        this.activityEndOrNow = activityEndOrNow;
        this.ActivityPeriod = ActivityPeriod;
    }

    public abstract String getGenre();

    public YearMonth getActivityStart(){return this.activityStart;}
    public YearMonth getActivityEndOrNow(){return this.activityEndOrNow;}
    public String getGroupName(){return this.groupName;}

    public String toString(){
        return this.getGroupName()+ "は" + this.getActivityStart() +"に活動を開始した" + this.getGenre()+"グループです。"
                 + this.getActivityEndOrNow()+ "までの活動していた"+this.getActivityPeriod()+"年間に"+getNumberOfMusical()+"曲を発表しました。"
                 +"有名な曲は"+this.getPopularMusic()+"です。";

    }

    public long getActivityPeriod() {
        return this.ActivityPeriod;
    }

}
