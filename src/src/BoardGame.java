public class BoardGame {
    private String gameTitle;

    public BoardGame(String gameTitle){
        this.gameTitle = gameTitle;
    }

    public String getGameTitle(){
        return gameTitle;
    }

    @Override
    public String toString() {
        return "BoardGame" +
                "The Tittle of the game is: " + gameTitle + '\'';
    }
}
