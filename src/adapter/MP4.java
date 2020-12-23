package adapter;

public class MP4 implements MediaPackage {
    @Override
    public void playFile() {
        System.out.println("playing mp4!");
    }
}
