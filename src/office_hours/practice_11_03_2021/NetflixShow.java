package office_hours.practice_11_03_2021;

public final class NetflixShow extends Streaming {

    String showName;
    int episodeNumber;
    int seasonNumber;

    public NetflixShow(double duration, String showName, int episodeNumber, int seasonNumber) {
        super("Netflix", duration);
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }
}
