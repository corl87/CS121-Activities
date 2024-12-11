package weekFour;

import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    int hp, damage, speed;
    String name, move;


    //ask for character info
    public void characterInfo() {
        Scanner scr = new Scanner(System.in);
        System.out.println("What is your characters name? ");
        name = scr.nextLine();
        System.out.printf("What should %s's signature move be? ", name);
        move = scr.nextLine();

        System.out.printf("What should %s's hit points be? ", name);
        hp = scr.nextInt();
        System.out.printf("What should %s's damage be? ", move);
        damage = scr.nextInt();
        System.out.printf("What should %s's speed be? ", move);
        speed = scr.nextInt();

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        int wins1 = 0, wins2 = 0, roundNum = 0;
        System.out.println("Enter an odd number of rounds");
        int totalRounds = scr.nextInt();
        while (totalRounds % 2 == 0) {
            System.out.println("try an odd number this time");
            totalRounds = scr.nextInt();
        }

        //ok now make the rounds lol
        while(roundNum<totalRounds) {
            CharacterBattle character1 = new CharacterBattle();
            CharacterBattle character2 = new CharacterBattle();
            character1.characterInfo();
            character2.characterInfo();

            while (character1.hp > 0 && character2.hp > 0) {
                if (character1.speed > character2.speed) {
                    character2.hp -= character1.damage;
                    if (character2.hp <= 0) {
                        System.out.printf("Player 1's %s Victory\n", character1.name);
                        wins1 += 1;
                        break;
                    }
                    character1.hp -= character2.damage;
                    if (character1.hp <= 0) {
                        System.out.printf("Player 2's %s Victory\n", character2.name);
                        wins2 += 1;
                    }
                }
                if (character1.speed < character2.speed) {
                    character1.hp -= character2.damage;
                    if (character1.hp <= 0) {
                        System.out.printf("Player 2's %s Victory\n", character2.name);
                        wins2 += 1;
                        break;
                    }
                    character2.hp -= character1.damage;
                    if (character2.hp <= 0) {
                        System.out.printf("Player 1's %s Victory\n", character1.name);
                        wins1 += 1;
                    }
                }


                if (character1.speed == character2.speed) {
                    if (rand.nextInt(2) == 1) {
                        character1.speed = -1;
                    } else {
                        character2.speed = -1;
                    }
                }
            }
            roundNum++;
        }
        System.out.println("Player 1 points: " + wins1);
        System.out.println("Player 2 points: " + wins2);
        if(wins1>wins2){
            System.out.println("Player 1 wins it all!");
        }else if(wins2>wins1){
            System.out.println("Player 2 wins it all!");
        }else{
            System.out.println("Tie!");
        }
    }
}

