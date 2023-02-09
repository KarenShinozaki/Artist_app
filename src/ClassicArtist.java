//
//import java.time.LocalDate;
//import java.util.Set;
//
//public class ClassicArtist extends Artist {
//    private long aliveYears;
//    private String period;
//    private LocalDate death;
//
//
//
//
//    public String toString() {
//        return this.getMemberName() + "は" + this.getGenre() + "の作曲家です。" + this.getBirthday() + "に生まれました。その時代は"
//                + this.getPeriod() + "の時代で、作曲した有名な曲は" + this.getPopularMusic() + "です。"+ this.getDeath()+"で死没。"
//                + this.getAliveYears() + "歳で生涯を終え、その生涯の中で" + this.getNumberOfMusical() + "もの曲を作曲したといわれています。";
//    }
//
//    // 抽象メソッドのオーバーライド
//    public void play() {
//        System.out.println(this.getMemberName() + "は、" + this.getPopularMusic() + "をオーケストラとともに奏でた");
//    }
//
//    //getter
//    public long getAliveYears() {
//        return this.aliveYears;
//    }
//
//    public String getPeriod() {
//        return this.period;
//    }
//
//    public LocalDate getDeath() {
//        return this.death;
//    }
//
//}
