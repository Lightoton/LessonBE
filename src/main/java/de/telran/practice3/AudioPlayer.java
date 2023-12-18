package de.telran.practice3;

public class AudioPlayer implements Task1.Playable {
    String trackName;
    @Override
    public void play(String trackName) {
        this.trackName = trackName;
    }
    @Override
    public void stop() {
        trackName = null;
        System.out.println("Track stopped");
    }
    @Override
    public String getTrackName() {

        return trackName;
    }
}
