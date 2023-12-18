package de.telran.practice3;

public class AudioRecorder extends AudioPlayer implements Task1.Playable, Task1.Recordable {



    @Override
    public void record() {
        System.out.println("Record Start!");
    }

    @Override
    public void stopRecording() {
        System.out.println("Record Stop!");
    }
}
