package kyh.textadventure;

import java.util.Scanner;

public class AdventureGame {

    public void initialization(){
        // Initialisering
        Room pinkRoom = new Room( "Pink room", "this is a room with pink walls filled with pink furniture.");
        Room aHall = new Room( "A hall", "A large hallway with a fancy rug on the floor.");
        Room theEntrance = new Room( "The entrance", "A large entrance to the map.");
        Room aDarkCave  = new Room( "A dark cave", "A very dark cave without any lights, and it is close to pitch black.");


        Room[][] map = {
                {pinkRoom, aHall},
                {theEntrance, aDarkCave}
        };
        int row = 1;
        int col = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Text Adventure Game (TAG)");

        boolean running = true;
    }

    public void gameLoop() {

    }

    public void exitGame() {


    }

}
