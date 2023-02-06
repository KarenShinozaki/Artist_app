import java.time.LocalDate;

public class HipHopArtist extends Artist {

    private long age;
    private String movie;
//    private static String genre = "Hip-Hop";
    /* 静的フィールドつくったけど親クラスにまとめたかったなぁ */


    //movieが存在する場合のコンストラクタ
    public HipHopArtist(String name, String popularMusic, LocalDate birthday, int numberOfMusical, long age, String movie) {
        super(name, popularMusic, birthday, numberOfMusical);
        this.age = age;
        this.movie = movie;
    }

    //movieが存在しない場合のコンストラクタ
    public HipHopArtist(String name, String popularMusic, LocalDate birthday, int numberOfMusical, long age) {
        this(name, popularMusic, birthday, numberOfMusical, age, null);
    }
    // movieに「何も入っていない」かそうでないかでメソッド分岐
//    public String judgementAfterPrint(){
//        if (this.movie.equals("なにも撮っていない")){
//            return this.toStringNotFilm();
//        }else{
//            return this.toString();
//        }
//    }

    public String toString() {
        String result = this.getName() + "は" + this.getGenre() + "のアーティストです。" + this.getBirthday() + "に生まれました。現在" + this.getAge() + "歳で、有名な曲は" + this.getPopularMusic() + "です。" + "その生涯の中で" + this.getNumberOfMusical() + "もの曲を作曲したといわれています。";
        if (this.movie != null) {
            result += "映画にも出演し、" + this.getMovie() + "は、過去の" + this.getName() + "の経験をつづった映画で、自身で監督及び主演を務めました。";
        }
        return result;
    }

//    public String toStringNotFilm(){
//        return this.getName() + "は"+HipHopArtist.genre+"のアーティストです。" + this.getBirthday() +"に生まれました。現在"+ this.getAge() + "歳で、有名な曲は" + this.getPopularMusic() + "です。"
//                + "その生涯の中で"+ this.getNumberOfMusical() +"もの曲を作曲したといわれています。";
//    }


    // 抽象メソッドのオーバーライド
    public void play() {
        System.out.println(this.getName() + "は、" + this.getPopularMusic() + "を歌った");
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
