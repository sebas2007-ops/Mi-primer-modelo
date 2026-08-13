package model;

import java.util.ArrayList;
import java.util.Date;

public class challenge {
    private int idChallenge;
    private Date date;
    private ArrayList<team> teamList;
    private int timeLimit;
    private team winner;
    private String premio;


    public challenge(){
    idChallenge = 0;
    date = new Date();
    teamList = new ArrayList<team>();
    timeLimit = 5;
    winner = new team();
    premio = "100.000 USD + International challenge + 10.000 Gold";
    }
    
    public challenge(int idChallenge, Date date, ArrayList<team> teamList, int timeLimit, team winner, String premio) {
        this.idChallenge = idChallenge;
        this.date = date;
        this.teamList = teamList;
        this.timeLimit = timeLimit;
        this.winner = winner;
        this.premio = premio;
    }

    public int getIdChallenge() {
        return idChallenge;
    }
    public void setIdChallenge(int idChallenge) {
        this.idChallenge = idChallenge;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public ArrayList<team> getTeamList() {
        return teamList;
    }
    public void setTeamList(ArrayList<team> teamList) {
        this.teamList = teamList;
    }
    public int getTimeLimit() {
        return timeLimit;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
    public team getWinner() {
        return winner;
    }
    public void setWinner(team winner) {
        this.winner = winner;
    }
    public String getPremio() {
        return premio;
    }
    public void setPremio(String premio) {
        this.premio = premio;
    }

}