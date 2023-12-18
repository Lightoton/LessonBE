package de.telran.practice3;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
            player.play("Road");
        System.out.println(player.getTrackName());
        player.stop();

        AudioRecorder recorder = new AudioRecorder();
        recorder.record();
        recorder.play("In The END");
        System.out.println(recorder.getTrackName());
        recorder.stopRecording();
    }

}
