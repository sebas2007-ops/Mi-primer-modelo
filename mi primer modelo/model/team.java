package model;

import java.util.ArrayList;

public class team {
    private int idTeam;
    private String name;
    private ArrayList<gamer> gamerList;
    private long score;
    private String level;
    private gamer leader;

    public team() {
     idTeam = 0;
     name = "team"+idTeam;
     gamerList = new ArrayList<gamer>();
     score = 0;
     level = "amateur";
     leader = new gamer();

    }
    
    public team(int idTeam, String name, ArrayList<gamer> gamerList, long score, String level, gamer leader) {
        this.idTeam = idTeam;
        this.name = name;
        this.gamerList = gamerList;
        this.score = score;
        this.level = level;
        this.leader = leader;
    }
    public int getIdTeam() {
        return idTeam;
    }
    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<gamer> getGamerList() {
        return gamerList;
    }
    public void setGamerList(ArrayList<gamer> gamerList) {
        this.gamerList = gamerList;
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
    public gamer getLeader() {
        return leader;
    }
    public void setLeader(gamer leader) {
        this.leader = leader;
    }

}