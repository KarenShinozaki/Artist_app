import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // LocalDate型で誕生日を取得
        LocalDate now = LocalDate.now();
        YearMonth yearMonthNow = YearMonth.now();

        Optional<LocalDate> vivaldiDeath = Optional.ofNullable(LocalDate.of(1741, 7, 28));
        Optional<LocalDate> tchaikovskyDeath = Optional.ofNullable(LocalDate.of(1893, 5, 7));
        Optional<LocalDate> eminemDeath = Optional.ofNullable(null);
        Optional<LocalDate> kanyeDeath = Optional.ofNullable(null);
        Optional<LocalDate> kimutakuDeath = Optional.ofNullable(null);

        Optional<LocalDate> vivaldiBirth = Optional.of(LocalDate.of(1678, 3, 4));
        Optional<LocalDate> tchaikovskyBirth = Optional.of(LocalDate.of(1840, 5, 7));
        Optional<LocalDate> eminemBirth = Optional.of(LocalDate.of(1972, 10, 17));
        Optional<LocalDate> kanyeBirth = Optional.of(LocalDate.of(1972, 10, 17));

        Optional<LocalDate> kimutakuBirth = Optional.of(LocalDate.of(1972, 11, 13));

        Optional<YearMonth> smapStart = Optional.of(YearMonth.of(1988, 12));
        Optional<YearMonth> smapEnd = Optional.of(YearMonth.of(2016, 12));

        Set<Music> musicBox = new HashSet<>();
        // ClassicArtistクラスのインスタンスを生成
        Music fourSeasons = new Music("四季", Genre.CLASSIC);
        musicBox.add(fourSeasons);
        Artist vivaldi = new Artist("antonio lucio vivaldi", fourSeasons, 800, vivaldiBirth.get(), ChronoUnit.YEARS.between(vivaldiBirth.get(), vivaldiDeath.orElse(now)), vivaldiDeath.get());
        Music swanLake = new Music("白鳥の湖", Genre.CLASSIC);
        musicBox.add(swanLake);
        Artist tchaikovsky = new Artist("Peter Ilyich Tchaikovsky", swanLake, 100, tchaikovskyBirth.get(), ChronoUnit.YEARS.between(tchaikovskyBirth.get(), tchaikovskyDeath.orElse(now)), tchaikovskyDeath.get());
        System.out.println("----------------------------------");
        // 諸情報を出力
        System.out.println(vivaldi.toString());
        System.out.println(tchaikovsky.toString());
        System.out.println("----------------------------------");

        Music loseYourSelf = new Music("Lose your self", Genre.HIPHOP);
        musicBox.add(loseYourSelf);
        // Hip-HopArtistクラスのインスタンスを生成
        Artist eminem = new Artist("Eminem", loseYourSelf, 546, eminemBirth.get(), ChronoUnit.YEARS.between(eminemBirth.get(), eminemDeath.orElse(now)), "8 mile");
        Music power = new Music("Power", Genre.HIPHOP);
        musicBox.add(power);
        Artist kanyeWest = new Artist("Kanye West", power, 324, kanyeBirth.get(), ChronoUnit.YEARS.between(kanyeBirth.get(), kanyeDeath.orElse(now)));

        // 諸情報を出力
        System.out.println(eminem.toString());
        System.out.println(kanyeWest.toString());
        System.out.println("----------------------------------");

        // Genre jPop = new Genre("J-POP");
        Music lionHeart = new Music("ライオンハート", Genre.JPOP);
        musicBox.add(lionHeart);
        Artist kimutaku = new Artist("木村拓哉", lionHeart, 20, kimutakuBirth.get(), ChronoUnit.YEARS.between(kimutakuBirth.get(), kimutakuDeath.orElse(now)));
        Artist kusanagi = new Artist("草なぎ剛", lionHeart, 20, kimutakuBirth.get(), ChronoUnit.YEARS.between(kimutakuBirth.get(), kimutakuDeath.orElse(now)));
        Artist katori = new Artist("香取慎吾", lionHeart, 20, kimutakuBirth.get(), ChronoUnit.YEARS.between(kimutakuBirth.get(), kimutakuDeath.orElse(now)));
        Artist nakai = new Artist("中居正広", lionHeart, 20, kimutakuBirth.get(), ChronoUnit.YEARS.between(kimutakuBirth.get(), kimutakuDeath.orElse(now)));
        Artist inagaki = new Artist("稲垣吾郎", lionHeart, 20, kimutakuBirth.get(), ChronoUnit.YEARS.between(kimutakuBirth.get(), kimutakuDeath.orElse(now)));
        Set<Artist> members = new HashSet<Artist>();
        members.add(kimutaku);
        members.add(kusanagi);
        members.add(nakai);
        members.add(inagaki);
        members.add(katori);
        Music onlyOneFlower = new Music("世界に一つだけの花", Genre.JPOP);
        GroupArtist smap = new GroupArtist("SMAP", onlyOneFlower, 530, smapStart.get(), smapEnd.orElse(yearMonthNow), ChronoUnit.YEARS.between(smapStart.get(), smapEnd.orElse(yearMonthNow)), members);

        System.out.println(kimutaku.toString());
        System.out.println(smap.toString());
//
        // Musicクラスのインスタンス生成
        System.out.println("----------------------------------");
        //Genre soul = new Genre("soul");
        Music fantasy = new Music("fantasy", Genre.SOUL);
        System.out.println(fantasy.toString());


        for (Music music : musicBox) {
            if (music.getGenre().getGenreName().equals(Genre.HIPHOP.getGenreName())) {
                System.out.println("ジャンルがHipHopの曲は" + music.getMusicTitle());
            }
        }

    }
}