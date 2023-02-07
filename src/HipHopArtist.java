import java.time.LocalDate;
import java.util.Set;

public class HipHopArtist extends SoloArtist {

    private long age;
    private String movie;


    //movieが存在する場合のコンストラクタ
    public HipHopArtist(String memberName, String popularMusic,  int numberOfMusical,LocalDate birthday, long age, String movie) {
        super(memberName, popularMusic, numberOfMusical,birthday);
        this.age = age;
        this.movie = movie;
    }

    //movieが存在しない場合のコンストラクタ
    public HipHopArtist(String memberName, String popularMusic, int numberOfMusical, LocalDate birthday, long age) {
        this(memberName, popularMusic,  numberOfMusical, birthday,age, null);
    }


    public String toString() {
        String result = this.getMemberName() + "は" + this.getGenre() + "のアーティストです。" + this.getBirthday() + "に生まれました。現在" + this.getAge() + "歳で、有名な曲は" + this.getPopularMusic() + "です。" + "その生涯の中で" + this.getNumberOfMusical() + "もの曲を作曲したといわれています。";
        if (this.movie != null) {
            result += "映画にも出演し、" + this.getMovie() + "は、過去の" + this.getMemberName() + "の経験をつづった映画で、自身で監督及び主演を務めました。";
        }
        return result;
    }

    // 抽象メソッドのオーバーライド
    public void play() {
        System.out.println(this.getMemberName() + "は、" + this.getPopularMusic() + "を歌った");
    }


    //getter
    public long getAge() {
        return this.age;
    }

    public String getMovie() {
        return this.movie;
    }

    public String getGenre() {
        return "Hip-hop";
    }

}
