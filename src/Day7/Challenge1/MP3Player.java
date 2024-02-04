package Day7.Challenge1;

class MP3Player extends AudioPlayer {


    @Override
    public void play() {
        System.out.println("lecture du fichier mp3:");
    }

    @Override
    public void pause() {
        System.out.println("Pause de la lecture fichier mp3");
    }

    @Override
    public void stop() {
        System.out.println("stop de la lecture mp3");
    }
}
