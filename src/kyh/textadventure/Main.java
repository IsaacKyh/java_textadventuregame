package kyh.textadventure;

import java.util.Scanner;


public class Main {
    public static void  main(String[] args) {
        // Initialisering
        String[][] map = {
                {"A pink room", "A hall"},
                {"The entrance", "A dark cave"}
        };
        int row = 1;
        int col = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to the Text Adventure Game (TAG)");

        boolean running = true;

        // här börjar spelloopen
        while(running){
            // 1. Skriv ut vilket rum vi är i
            System.out.println(map[row][col]);

            // 2. Läs in kommando från användaren
            System.out.print("> ");
            String command = input.nextLine();

            // 3. dela upp kommandot i delar, varje ord blir en sträng i en array
            //    Vi delar upp det inmatade värdet vid varje mellanslag
            String[] commandParts = command.split(" ");

            // 4. kollar viljet "huvudkomando" som har angivits
            //    Dessa är:
            //      -go
            //      -quit
            if(commandParts[0].equalsIgnoreCase("go")){
                // vi har angett "go" som kommando

                // Kolla efter riktning
                // kontrollera att man har skrivit något efter "go", alltså en riktning
                if(commandParts.length >= 2){
                    if(commandParts[1].equalsIgnoreCase("north")){
                        row--;
                        // Kontrollerar så att vi inte hamnar utanför kartan
                        if(row < 0 ){
                            row = 0;
                        }
                    }
                   else if(commandParts[1].equalsIgnoreCase("south")){
                        row++;
                        if(row >= map.length){
                            row--;
                        }
                    }
                   else if(commandParts[1].equalsIgnoreCase("east")){
                        col++;
                        if(col >= map[row].length){
                            col--;
                        }
                    }
                    else if(commandParts[1].equalsIgnoreCase("west")){
                        col--;
                        if(col < 0 ){
                            col = 0;
                        }
                    }

                    System.out.println("Going " + commandParts[1]);

                }
                else{
                    System.out.println("You can't go without any direction");
                }
            }

            // tolka kommandot
            if(command.equalsIgnoreCase("quit")){
                running = false;
            }
        }
        System.out.println("Thanks for playing TAG");
    }
}
