package adapter;

public class MediaAdapter implements MediaPlayer {
    private MediaPackage mediaPackage;

    public MediaAdapter(MediaPackage m) {
        mediaPackage = m;
    }

    @Override
    public void play() {
        System.out.print("playing with adapter -> ");
        mediaPackage.playFile();
    }
}
