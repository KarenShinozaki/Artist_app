import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Set;

public class Jpop extends Artist {
    private Set<String> memberName;
    private YearMonth activityStart;

    Jpop(String name, String popularMusic, LocalDate birthday, int numberOfMusical, Set<String> memberName, YearMonth activityStart) {
        super(name, popularMusic, birthday, numberOfMusical);
        this.memberName = memberName;
        this.activityStart = activityStart;
    }

    public void play() {
        System.out.println(this.getName() + "は、" + this.getPopularMusic() + "を歌った");
    }

    public String getGenre() {
        return "J-POP";
    }

    public YearMonth getActivityStart() {
        return activityStart;
    }

//    public Set<String> getMemberName() {
//        return memberName;
//    }

    public String toString() {
        return this.getName() + "は" + this.getGenre() + "のグループアーティストです。" + this.getActivityStart() + "にグループが誕生しました。";  //+  outputName(this.memberName);
    }

    public void outputName(Set<String> memberName) {
        System.out.print("メンバーの名前は");
        for (String s : memberName) {
            System.out.print(s + " ");
        }
        System.out.println("です");
     //   return memberName.toString();
    }


}
