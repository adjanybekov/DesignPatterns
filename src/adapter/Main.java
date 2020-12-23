package adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3();
        mediaPlayer.play();

        mediaPlayer = new MediaAdapter(new MP4());
        mediaPlayer.play();
    }
}
