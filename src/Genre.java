public enum Genre {

    CLASSIC("クラシック音楽"),
    HIPHOP("HIP-HOP"),
    JPOP("J-POP"),
    SOUL("ソウルミュージック"),
    POPS("ポップス");
    private final String genreName;

    private Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return this.genreName;
    }

}
