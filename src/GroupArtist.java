import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Set;

public class GroupArtist extends Artist {
    // private String groupName;
    private YearMonth activityStart;
    private YearMonth activityEndOrNow;
    private long ActivityPeriod;
    private Set<Artist> members;

    public GroupArtist(String name, Music music, int numberOfMusical, YearMonth activityStart, YearMonth activityEndOrNow, long ActivityPeriod, Set<Artist> members) {
        super(name, music, numberOfMusical);
        this.activityStart = activityStart;
        this.activityEndOrNow = activityEndOrNow;
        this.ActivityPeriod = ActivityPeriod;
        this.members = members;
    }

    public YearMonth getActivityStart() {
        return this.activityStart;
    }

    public YearMonth getActivityEndOrNow() {
        return this.activityEndOrNow;
    }

    //public String getGroupName(){return this.groupName;}
    public long getActivityPeriod() {
        return this.ActivityPeriod;
    }

    public Set<Artist> getMembers() {
        return this.members;
    }

    public String toString() {
        String m = "";
        for (Artist s : members) {
            if (m.length() !=0) {
                m += " ";
            }
            m += s.getName();
        }
        return this.getName() + "は" + this.getActivityStart() + "に活動を開始した" + "グループです。"
                + this.getActivityEndOrNow() + "までの活動していた" + this.getActivityPeriod() + "年間に" + getNumberOfMusical() + "曲を発表しました。"
                + "有名な曲は" + this.getMusicAndGenre().getMusicTitle() + "です。" + "この曲のジャンルは"
                + this.getMusicAndGenre().getGenre().getGenreName() + "です。" + m + "はメンバーです。";

    }
}
