public class MusicPlayerPlayCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerPlayCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }
}