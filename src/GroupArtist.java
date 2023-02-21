import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.Set;

public class GroupArtist extends Artist {
    private YearMonth activityStart;
    private YearMonth activityEnd;
    private Set<Artist> members;


    public GroupArtist(String name, Music music, int numberOfMusical, YearMonth activityStart, Set<Artist> members) {
        super(name, music, numberOfMusical);
        this.activityStart = activityStart;
        this.members = members;
    }
    public GroupArtist(String name, Music music, int numberOfMusical, YearMonth activityStart, YearMonth activityEnd,Set<Artist> members) {
        this(name, music, numberOfMusical,activityStart,members);
        this.activityEnd = activityEnd;
    }

    public YearMonth getActivityStart() {
        return this.activityStart;
    }

    public Optional<YearMonth> getActivityEnd() {
        return Optional.ofNullable(this.activityEnd);
    }

    public long getActivityPeriod() {
        return  ChronoUnit.YEARS.between(this.getActivityStart(), this.getActivityEnd().orElse(YearMonth.now()));
    }

    public Set<Artist> getMembers() {
        return this.members;
    }
    public boolean isActivation(){
        return getActivityEnd().isEmpty();
    }

    public boolean isActivityEnd(){
        return getActivityEnd().isPresent();
    }


    public String toString() {
        String m = "";
        for (Artist s : members) {
            if (m.length() !=0) {
                m += ",";
            }
            m += s.getName();
        }
        if(isActivation()){
            return this.getName() + "は" + this.getActivityStart() + "月に活動を開始した" + "グループです。"
                + "活動している" + this.getActivityPeriod() + "年間に" + getNumberOfMusical() + "曲を発表しました。"
                + "有名な曲は" + this.getMusicAndGenre().getMusicTitle() + "です。" + "この曲のジャンルは"
                + this.getMusicAndGenre().getGenre().getGenreName() + "です。" + m + "はメンバーです。";
        }if(isActivityEnd()) {
            return this.getName() + "は" + this.getActivityStart() + "月に活動を開始した" + "グループです。"
                    + this.getActivityEnd().get() + "月までの活動していた" + this.getActivityPeriod() + "年間に" + getNumberOfMusical() + "曲を発表しました。"
                    + "有名な曲は" + this.getMusicAndGenre().getMusicTitle() + "です。" + "この曲のジャンルは"
                    + this.getMusicAndGenre().getGenre().getGenreName() + "です。" + m + "はメンバーです。";
        }
        return "使用可能なコンストラクタがありません";
    }


}
