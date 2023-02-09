import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Set;

public class GroupArtist extends Artist{
    private String groupName;
    private YearMonth activityStart;
    private YearMonth activityEndOrNow;
    private long ActivityPeriod;
    private Set<Artist> members;

    public GroupArtist(String name, String popularMusic, int numberOfMusical, LocalDate bitrhday, YearMonth activityStart, YearMonth activityEndOrNow, long ActivityPeriod, Set<Artist> members){
        super(name,popularMusic,numberOfMusical, bitrhday);
        this.groupName = groupName;
        this.activityStart = activityStart;
        this.activityEndOrNow = activityEndOrNow;
        this.ActivityPeriod = ActivityPeriod;
        this.members = members;
    }

    public YearMonth getActivityStart(){return this.activityStart;}
    public YearMonth getActivityEndOrNow(){return this.activityEndOrNow;}
    public String getGroupName(){return this.groupName;}
    public long getActivityPeriod() {
        return this.ActivityPeriod;
    }
    public Set<Artist> getMembers(){return this.members;}

    public String toString(){
        return this.getGroupName()+ "は" + this.getActivityStart() +"に活動を開始した" + "グループです。"
                 + this.getActivityEndOrNow()+ "までの活動していた"+this.getActivityPeriod()+"年間に"+getNumberOfMusical()+"曲を発表しました。"
                 +"有名な曲は"+this.getPopularMusic()+"です。";

    }



//    public void member(SoloArtist member1, SoloArtist member2,SoloArtist member3,SoloArtist member4,SoloArtist member5){
//        Set<String> team = new HashSet<>();
//        team.add(member1.getMemberName());
//        team.add(member2.getMemberName());
//        team.add(member3.getMemberName());
//        team.add(member4.getMemberName());
//        team.add(member5.getMemberName());
//        System.out.print(this.getGroupName()+"のメンバーの名前は");
//        for (String s : team) {
//            System.out.print(s + " ");
//        }
//        System.out.println("です");
//    }

}
