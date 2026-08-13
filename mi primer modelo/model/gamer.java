package model;

public class gamer{
    private int idGamer;
    private String name;
    private String user;
    private String password;
    private long score;
    private String level;

    public gamer() {
     idGamer = 0;
     name = "gamer"+idGamer;
     user = "nouseryet";
     password = "";
     score = 0;
     level = "amateur";
    }

    public gamer(int idGamer, String name, String user, String password, long score, String level) {
        this.idGamer = idGamer;
        this.name = name;
        this.user = user;
        this.password = password;
        this.score = score;
        this.level = level;
    }   
    public int getIdGamer() {
        return idGamer;
    }
    public void setIdGamer(int idGamer) {
        this.idGamer = idGamer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getScore() {
        return score;
    }
    public void setScore(long score) {
        this.score = score;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    
}








