import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Set;

public class Jpop extends SoloArtist {
//

    Jpop(String memberName, String popularMusic, int numberOfMusical,LocalDate birthday, YearMonth activityStart) {
        super(memberName, popularMusic,  numberOfMusical,birthday);
    }

    public void play() {
        System.out.println(this.getMemberName() + "は、" + this.getPopularMusic() + "を歌った");
    }

    public String getGenre() {
        return "J-POP";
    }

    public String toString() {
        return this.getMemberName() + "は" + this.getGenre() + "のアーティストです。" + this.getBirthday() + "に誕生しました。";
    }

    public void outputName(Set<String> memberName) {
        System.out.print("メンバーの名前は");
        for (String s : memberName) {
            System.out.print(s + " ");
        }
        System.out.println("です");
    }


}
