package controller;
import model.gamer;
import java.util.ArrayList;

public class GamerController {
    private ArrayList<gamer> gamerList;

    public GamerController() {
        gamerList = new ArrayList<>();
        toFillGamers();
    
    }
    public GamerController(ArrayList<gamer> gamerList) {
        this.gamerList = gamerList;
    }
    public void createGamer(gamer g) {
        gamerList.add(g);
    }
    public gamer findGamer(int i){
        gamer g=new gamer();
        for (gamer gamer : gamerList){
            if(gamer.getIdGamer()==i) g=gamer;
        }
        return g;
    }
    public void modifyGamer (gamer g){
        gamerList.set(gamerList.indexOf(g),g);
    }
    public void deleteGamer(gamer g){
        gamerList.remove(g);
    }
    private void toFillGamers(){
        gamerList.add(new gamer(1,"John Lopez","jalopez","Gamer123",999999,"Amateur"));
        gamerList.add(new gamer(2,"Jane Smith","jasmith","Gamer456",888888,"Intermediate"));
        gamerList.add(new gamer(3,"Bob Johnson","bjohnson","Gamer789",777777,"Expert"));

    }



}
