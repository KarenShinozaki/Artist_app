import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Set;

public class Jpop extends SoloArtist {
//    private Set<String> memberName;

    Jpop(String name, String popularMusic, int numberOfMusical,LocalDate birthday, YearMonth activityStart) {
        super(name, popularMusic,  numberOfMusical,birthday);
    }

    public void play() {
        System.out.println(this.getName() + "は、" + this.getPopularMusic() + "を歌った");
    }

    public String getGenre() {
        return "J-POP";
    }

    public String toString() {
        return this.getName() + "は" + this.getGenre() + "のアーティストです。" + this.getBirthday() + "に誕生しました。";
    }

    public void outputName(Set<String> memberName) {
        System.out.print("メンバーの名前は");
        for (String s : memberName) {
            System.out.print(s + " ");
        }
        System.out.println("です");
    }


}
