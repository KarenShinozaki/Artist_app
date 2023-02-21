import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Music> musicBox = new HashSet<>();
        // ClassicArtistクラスのインスタンスを生成
        Music fourSeasons = new Music("四季", Genre.CLASSIC);
        musicBox.add(fourSeasons);
        Artist vivaldi = new Artist("antonio lucio vivaldi", fourSeasons, 800, LocalDate.of(1678, 3, 4), LocalDate.of(1741, 7, 28));
        Music swanLake = new Music("白鳥の湖", Genre.CLASSIC);
        musicBox.add(swanLake);
        Artist tchaikovsky = new Artist("Peter Ilyich Tchaikovsky", swanLake, 100, LocalDate.of(1840, 5, 7),LocalDate.of(1893, 5, 7));
        System.out.println("----------------------------------");
        // 諸情報を出力
        System.out.println(vivaldi.toString());
        System.out.println(tchaikovsky.toString());
        System.out.println("----------------------------------");

        Music loseYourSelf = new Music("Lose your self", Genre.HIPHOP);
        musicBox.add(loseYourSelf);
        // Hip-HopArtistクラスのインスタンスを生成
        Artist eminem = new Artist("Eminem", loseYourSelf, 546, LocalDate.of(1972, 10, 17), "8 mile");
        Music power = new Music("Power", Genre.HIPHOP);
        musicBox.add(power);
        Artist kanyeWest = new Artist("Kanye West", power, 324, LocalDate.of(1972, 10, 17));

        Music htw = new Music("heal the world",Genre.POPS);
        Artist mj = new Artist("Michael Jackson",htw,136,LocalDate.of(1958,8,29),LocalDate.of(2009,6,25),"this is it");
        System.out.println(mj.toString());

        // 諸情報を出力
        System.out.println(eminem.toString());
        System.out.println(kanyeWest.toString());
        System.out.println("----------------------------------");

        Music lionHeart = new Music("ライオンハート", Genre.JPOP);
        musicBox.add(lionHeart);
        Artist kimutaku = new Artist("木村拓哉", lionHeart, 20, LocalDate.of(1972, 11, 13));
        Artist kusanagi = new Artist("草なぎ剛", lionHeart, 20, LocalDate.of(1972, 11, 13));
        Artist katori = new Artist("香取慎吾", lionHeart, 20,LocalDate.of(1972, 11, 13));
        Artist nakai = new Artist("中居正広", lionHeart, 20, LocalDate.of(1972, 11, 13));
        Artist inagaki = new Artist("稲垣吾郎", lionHeart, 20, LocalDate.of(1972, 11, 13));
        Set<Artist> members = new HashSet<Artist>();
        members.add(kimutaku);
        members.add(kusanagi);
        members.add(nakai);
        members.add(inagaki);
        members.add(katori);
        Music onlyOneFlower = new Music("世界に一つだけの花", Genre.JPOP);
        GroupArtist smap = new GroupArtist("SMAP", onlyOneFlower, 530, YearMonth.of(1988, 12), YearMonth.of(2016, 12), members);

        Music witi = new Music("Walk It Take It",Genre.HIPHOP);
        Music clout = new Music("Clout",Genre.HIPHOP);
        Artist offset = new Artist("Offset",clout,30,LocalDate.of(1991, 12, 14));
        Music vacation =new Music("vacation",Genre.HIPHOP);
        Artist takeoff = new Artist("Takeoff",vacation,20,LocalDate.of(1994,6,18),LocalDate.of(2022,11,1));
        Music passOut = new Music("PASS OUT",Genre.HIPHOP);
        Artist quavo = new Artist("Quavo",passOut,15,LocalDate.of(1991,4,2));
        Set<Artist> migosMember = new HashSet<>();
        migosMember.add(offset);
        migosMember.add(takeoff);
        migosMember.add(quavo);
        GroupArtist migos = new GroupArtist("Migos",witi,349,YearMonth.of(2008,1),migosMember);

        System.out.println(migos.toString());
        System.out.println(offset.toString());
        System.out.println(takeoff.toString());


        System.out.println(kimutaku.toString());
        System.out.println(smap.toString());



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