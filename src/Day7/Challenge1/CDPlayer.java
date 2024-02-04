package Day7.Challenge1;

class CDPlayer extends AudioPlayer {


    @Override
    public void play() {
        System.out.println("lecture du CD : ");
    }

    @Override
    public void pause() {
        System.out.println("Pause de la lecture du CD : ");
    }

    @Override
    public void stop() {
        System.out.println("stop de la  lecture du CD : ");
    }
}
