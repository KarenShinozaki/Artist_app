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

        Set<Music> musicBox = new HashSet<>();
        // ClassicArtistクラスのインスタンスを生成
        Music fourSeasons = new Music("四季",Genre.CLASSIC);
        musicBox.add(fourSeasons);
        Artist vivaldi = new Artist("antonio lucio vivaldi", fourSeasons, 800, vivaldiBirth, ChronoUnit.YEARS.between(vivaldiBirth, vivaldiDeath), "バロック音楽", vivaldiDeath);
        Music swanLake = new Music("白鳥の湖",Genre.CLASSIC);
        musicBox.add(swanLake);
        Artist tchaikovsky = new Artist("Peter Ilyich Tchaikovsky", swanLake, 100, tchaikovskyBirth, ChronoUnit.YEARS.between(tchaikovskyBirth, tchaikovskyDeath), "印象派", tchaikovskyDeath);
        System.out.println("----------------------------------");
        // 諸情報を出力
        System.out.println(vivaldi.toString());
        System.out.println(tchaikovsky.toString());
        System.out.println("----------------------------------");

        Music loseYourSelf = new Music("Lose your self",Genre.HIPHOP);
        musicBox.add(loseYourSelf);
        // Hip-HopArtistクラスのインスタンスを生成
        Artist eminem = new Artist("Eminem", loseYourSelf, 546,eminemBirth , ChronoUnit.YEARS.between(eminemBirth, now), "8 mile");
        Music power = new Music("Power",Genre.HIPHOP);
        musicBox.add(power);
        Artist kanyeWest = new Artist("Kanye West", power, 324, kanyeBirth, ChronoUnit.YEARS.between(kanyeBirth, now));

        // 諸情報を出力
        System.out.println(eminem.toString());
        System.out.println(kanyeWest.toString());
        System.out.println("----------------------------------");

       // Genre jPop = new Genre("J-POP");
        Music lionHeart = new Music("ライオンハート",Genre.JPOP);
        musicBox.add(lionHeart);
        Artist kimutaku = new Artist("木村拓哉",lionHeart,20,kimutakuBirth,ChronoUnit.YEARS.between(kimutakuBirth, now));
        Artist kusanagi = new Artist("草なぎ剛",lionHeart,20,kimutakuBirth,ChronoUnit.YEARS.between(kimutakuBirth, now));
        Artist katori = new Artist("香取慎吾",lionHeart,20,kimutakuBirth,ChronoUnit.YEARS.between(kimutakuBirth, now));
        Artist nakai = new Artist("中居正広",lionHeart,20,kimutakuBirth,ChronoUnit.YEARS.between(kimutakuBirth, now));
        Artist inagaki = new Artist("稲垣吾郎",lionHeart,20,kimutakuBirth,ChronoUnit.YEARS.between(kimutakuBirth, now));
        Set<Artist> members = new HashSet<Artist>();
        members.add(kimutaku);
        members.add(kusanagi);
        members.add(nakai);
        members.add(inagaki);
        members.add(katori);
        Music onlyOneFlower = new Music("世界に一つだけの花",Genre.JPOP);
        GroupArtist smap = new GroupArtist("SMAP", onlyOneFlower, 530, smapStart, smapEnd, ChronoUnit.YEARS.between(smapStart, smapEnd),members);

        System.out.println(kimutaku.toString());
        System.out.println(smap.toString());
//
        // Musicクラスのインスタンス生成
        System.out.println("----------------------------------");
       //Genre soul = new Genre("soul");
        Music fantasy = new Music("fantasy",Genre.SOUL);
        System.out.println(fantasy.toString());


        for(Music music:musicBox){
            if(music.getGenre().getGenreName().equals(Genre.HIPHOP.getGenreName())){
                System.out.println("ジャンルがHipHopの曲は"+music.getMusicTitle());
            }
        }

    }
}