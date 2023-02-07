import java.time.YearMonth;
import java.util.Set;

public abstract class GroupArtist {
    private String groupname;
    private String popularMusic;
    private int numberOfMusical;
   // private Set<String> memberName;
    private YearMonth activityStart;
    private YearMonth activityend;

    public GroupArtist(String groupname,String popularMusic,int numberOfMusical,YearMonth activityStart,YearMonth activityend){
        this.groupname = groupname;
        this.popularMusic = popularMusic;
        this.numberOfMusical = numberOfMusical;
     //   this.memberName = memberName;
        this.activityStart = activityStart;
        this.activityend = activityend;
    }
    public abstract void play();

    public abstract String getGenre();

    public String getGroupName() {
        return this.groupname;
    }
    public String getPopularMusic(){return this.popularMusic;}
    public int getNumberOfMusical(){return this.numberOfMusical;}
    public YearMonth getActivityStart(){return this.activityStart;}
    public YearMonth getActivityend(){return this.activityend;}

}
