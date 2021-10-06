package Soal2;

public class GameCharacter {
    private String nama;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    public void setLifePoint(int lifePoint){
        this.lifePoint = lifePoint;
    }
    public int getLifePoint(){
        return lifePoint;
    }

    public void hit (GameCharacter karB){
        karB.setLifePoint(karB.getLifePoint()-this.attackHitPoint);
    }
    public void kick (GameCharacter karB){
        karB.setLifePoint(karB.getLifePoint()-this.attackKickPoint);
    }

    public GameCharacter(String nama, int attackHitPoint, int attackKickPoint){
        this.nama = nama;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getNama(){
        return nama;
    }

    public void battle(GameCharacter karB){
        int status = Integer.compare(this.lifePoint, karB.getLifePoint());
        if (status > 0){
            System.out.println(this.nama + "Win ");
        }else if (status < 0 ){
            System.out.println(karB.getNama() + "Lose");
        }else {
            System.out.println("Draw Battle");
        }
    }
}
