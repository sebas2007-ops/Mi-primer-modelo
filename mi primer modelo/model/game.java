package model;

public class game {
    private int idGame;
    private String name;
    private String type;
    private int levels; 
    private int amountGamers;
    private String goal;
   
    public game() {
        idGame = 0;
        name = "game" + idGame;
        type = "Battle";
        levels = 10;
        amountGamers = 5;
        goal = "to win the game";
    }

    public game(int idGame, String name, String type, int levels, int amountGamers, String goal) {
        this.idGame = idGame;
        this.name = name;
        this.type = type;
        this.levels = levels;
        this.amountGamers = amountGamers;
        this.goal = goal;
    }
    
    public int getIdGame() {
        return idGame;
    }
    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getLevels() {
        return levels;
    }
    public void setLevels(int levels) {
        this.levels = levels;
    }
    public int getAmountGamers() {
        return amountGamers;
    }
    public void setAmountGamers(int amountGamers) {
        this.amountGamers = amountGamers;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }

}