package de.telran.practice3;

public class Task1 {
    interface Playable{
        public void play(String trackName);


        public void stop();


        public  String getTrackName();


    }
    interface Recordable{
        public void record();


        public void stopRecording();


    }
}
//Создайте интерфейс Playable с методами play() и stop().
// Затем создайте класс AudioPlayer, который реализует
// интерфейс Playable. Создайте еще один интерфейс
// Recordable с методами record() и stopRecording().
// Создайте класс AudioRecorder, который реализует оба интерфейса.
// В методе main создайте объекты AudioPlayer и
// AudioRecorder и продемонстрируйте их работу.