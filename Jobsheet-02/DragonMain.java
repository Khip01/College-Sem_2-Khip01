import java.util.Scanner;

public class DragonMain {
    
    public static void main(String[] args) {
        
        Dragon dragon = new Dragon();
        
        // declare rand position player
        dragon.height = 10;
        dragon.width = 10;
        dragon.x = 0;
        dragon.y = 0;
        Scanner input = new Scanner(System.in);
        String inputUser;
        boolean isInvalid = true;


        do{
            showMap(dragon.x, dragon.y);
            showMenu(dragon.x, dragon.y);
            System.out.print("(masukkan lalu enter)=> ");
            inputUser = input.nextLine();
            
            if (inputUser.length() == 1 && inputUser.equalsIgnoreCase("W") || inputUser.equalsIgnoreCase("A") || inputUser.equalsIgnoreCase("S") || inputUser.equalsIgnoreCase("D")) {
                System.out.println("\033[H\033[2J");
                isInvalid = false;
            } else {
                isInvalid = true;
            }
            
            while(isInvalid){
                System.out.println("\033[H\033[2J");
                System.out.println("*----------------------------------*");
                System.out.println("| Input harus 1 karakter 'W/A/S/D' |");
                System.out.println("*----------------------------------*");
    
                showMap(dragon.x, dragon.y);
                showMenu(dragon.x, dragon.y);
                System.out.print("(masukkan lalu enter)=> ");
                inputUser = input.nextLine();

                if (inputUser.length() == 1 && inputUser.equalsIgnoreCase("W") || inputUser.equalsIgnoreCase("A") || inputUser.equalsIgnoreCase("S") || inputUser.equalsIgnoreCase("D")) {
                    System.out.println("\033[H\033[2J");
                    isInvalid = false;
                } else {
                    isInvalid = true;
                }
            }

            switch (inputUser.toUpperCase()) {
                case "W":
                    dragon.moveUp();
                    break;
                case "A":
                    dragon.moveLeft();
                    break;
                case "S":
                    dragon.moveDown();
                    break;
                case "D":
                    dragon.moveRight();
                    break;
            }
        }while(!dragon.isGameOver);

    }


    static void showMenu(int x, int y) {
        System.out.printf("\nPosition: (%d, %d)\n", x, y);
        System.out.println("Selamat datang di Dragon!");
        System.out.println("Control 'WASD'");
        System.out.println("'W': Atas");
        System.out.println("'A': Kiri");
        System.out.println("'S': Bawah");
        System.out.println("'D': Kanan\n");
    }
    
    static void showMap(int x, int y) {
        String[][] map = {
            {"*", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "*"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"|", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "|"},
            {"*", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "*"},
        };

        map[11-y][x+1] = " * ";

        for (String[] row : map) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
