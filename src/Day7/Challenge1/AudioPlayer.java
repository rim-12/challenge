package Day7.Challenge1;

abstract class AudioPlayer implements Playable {
    private int volume;
    public AudioPlayer(){
        this.volume = 50;
    }
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("volume réglé à " + volume);
        } else {
            System.out.println("le volume doit etre 0 et 100");
        }
    }
    public int getVolume(){
        return volume;
    }


}
