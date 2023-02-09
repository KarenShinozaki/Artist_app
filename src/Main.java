import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // LocalDate型で誕生日を取得
        LocalDate now = LocalDate.now();
        LocalDate vivaldiBirth = LocalDate.of(1678, 3, 4);
        LocalDate tchaikovskyBirth = LocalDate.of(1840, 5, 7);
        LocalDate eminemBirth = LocalDate.of(1972, 10, 17);
        LocalDate kanyeBirth = LocalDate.of(1977, 6, 8);

        LocalDate kimutakuBirth = LocalDate.of(1972, 11, 13);


        // LocalDate型で死没日を取得
        LocalDate vivaldiDeath = LocalDate.of(1741, 7, 28);
        LocalDate tchaikovskyDeath = LocalDate.of(1893, 5, 7);

        //YearMonth型で
        YearMonth smapStart = YearMonth.of(1988, 12);
        YearMonth smapEnd = YearMonth.of(2016, 12);

        YearMonth etfStart = YearMonth.of(2004, 12);
        YearMonth yearMonthNow = YearMonth.now();


        // ClassicArtistクラスのインスタンスを生成
        Artist vivaldi = new Artist("antonio lucio vivaldi", "四季", 800, vivaldiBirth, ChronoUnit.YEARS.between(vivaldiBirth, vivaldiDeath), "バロック音楽", vivaldiDeath);
        Artist tchaikovsky = new Artist("Peter Ilyich Tchaikovsky", "白鳥の湖", 100, tchaikovskyBirth, ChronoUnit.YEARS.between(tchaikovskyBirth, tchaikovskyDeath), "印象派", tchaikovskyDeath);

        // 諸情報を出力
        System.out.println(vivaldi.toString());
        System.out.println(tchaikovsky.toString());

        // Hip-HopArtistクラスのインスタンスを生成
        Artist eminem = new Artist("Eminem", "Lose Yourself", 546,eminemBirth , ChronoUnit.YEARS.between(eminemBirth, now), "8 mile");
        Artist kanyeWest = new Artist("Kanye West", "Power", 324, kanyeBirth, ChronoUnit.YEARS.between(kanyeBirth, now));

        // 諸情報を出力
        System.out.println(eminem.toString());
        System.out.println(kanyeWest.toString());


//        GroupArtist smap = new GroupArtist("SMAP", "世界に一つだけの花", 530, smapStart, smapEnd, ChronoUnit.YEARS.between(smapStart, smapEnd)) {
//            @Override
//            public String getGenre() {
//                return "J-POP";
//            }
//        };
//        Artist kimutaku = new Jpop("木村拓哉","世界に一つだけの花",20,kimutakuBirth,smapStart);
//        Artist kusanagi = new Jpop("草なぎ剛","世界に一つだけの花",20,kimutakuBirth,smapStart);
//        Artist katori = new Jpop("香取慎吾","世界に一つだけの花",20,kimutakuBirth,smapStart);
//        Artist nakai = new Jpop("中居正広","世界に一つだけの花",20,kimutakuBirth,smapStart);
//        Artist inagaki = new Jpop("稲垣吾郎","世界に一つだけの花",20,kimutakuBirth,smapStart);
//        System.out.println("----------------------------------");
//        System.out.println(smap.toString());
//        System.out.println(kimutaku.toString());
//        smap.member(kimutaku,kusanagi,katori,nakai,inagaki);
//        System.out.println("----------------------------------");
//        GroupArtist EscapeTheFate = new GroupArtist("EscapeTheFate", "Situations", 300, etfStart, yearMonthNow, ChronoUnit.YEARS.between(etfStart, yearMonthNow)) {
//
//            @Override
//            public String getGenre() {
//                return "post-hardcore";
//            }
//        };
//        System.out.println(EscapeTheFate.toString());

        //Jpopクラスのインスタンス生成

//        Set<String> smapMembers = new HashSet<String>();
//        smapMembers.add("木村");
//        smapMembers.add("草なぎ");
//        smapMembers.add("中居");
//        smapMembers.add("稲垣");
//        smapMembers.add("香取");
//        Jpop smap = new Jpop("SMAP", "ライオンハート", null, 530, smapMembers, YearMonth.of(1988, 12));
//
//        Set<String> tokioMembers = new HashSet<String>();
//        tokioMembers.add("長瀬");
//        tokioMembers.add("松岡");
//        tokioMembers.add("城嶋");
//        tokioMembers.add("山口");
//        tokioMembers.add("国分");
//        Jpop tokio = new Jpop("TOKIO", "宙船", null, 357, tokioMembers, YearMonth.of(1944, 7));
//
//        // 諸情報を出力
//        System.out.print(smap.toString());
//        smap.outputName(smapMembers);
//
//        System.out.print(tokio.toString());
//        tokio.outputName(tokioMembers);


        // メソッド出力
        System.out.println("----------------------------------");
        //smap.play();
    }
}