public class Dragon {
    int x, y, width, height;
    boolean isGameOver = false;

    void moveLeft(){
        if (x > 0) 
            x -= 1;
        else 
            detectCollision(x-1, y);
    }

    void moveRight() {
        if (width > x) 
            x += 1;
        else 
            detectCollision(x+1, y);
    }

    void moveUp() {
        if (height > y) 
            y += 1;
        else 
            detectCollision(x, y+1);
    }

    void moveDown() {
        if (y > 0) 
            y -= 1;
        else 
            detectCollision(x, y-1);
    }

    void printPosition() {

    }

    void detectCollision(int x, int y){
        System.out.println("\n*-----------------------------*");
        System.out.println("|          Game Over!         |");
        System.out.println("|    Kamu Menabrak Dinding    |");
        System.out.println("*-----------------------------*");
        System.out.printf("|    Ukuran Area (%-2d x %-2d)    |\n", width, height);
        System.out.printf("|  Game Berakhir di (%-2d, %-2d)  |\n", x, y);
        System.out.println("*-----------------------------*");
        isGameOver = true;
    }
}
