public class Sports {
    public static void main(String[] args) {
        Cricket_player cricketPlayer = new Cricket_player("Neymar", 44, "Defender");
        Football_player footballPlayer = new Football_player("Messi", 30, "Center");
        Hockey_player hockeyPlayer = new Hockey_player("Lucky", 28, "MidFielder");
        
        cricketPlayer.play();
        cricketPlayer.train();
        
        footballPlayer.play();
        footballPlayer.train();
        
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
