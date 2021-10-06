package Soal2;

public class Main {
    public static void main(String[] args) {
        GameCharacter com1 = new GameCharacter(" Raiden ", 10, 20);
        GameCharacter com2 = new GameCharacter(" Sub-Zero ", 5, 25);

        com1.kick(com2);
        com2.kick(com1);

        for (int x = 0; x < 3; x++){
            com2.hit(com1);
        }
        for (int x = 0; x < 4; x++){
            com1.hit(com2);
        }

        System.out.println(" LifePoint Raiden : " + com1.getLifePoint());
        System.out.println(" LifePoint Sub-Zero : " + com2.getLifePoint());

        com1.battle(com2);
    }
}
