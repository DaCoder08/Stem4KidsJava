import java.util.*;
public class game2048{
    static Scanner sc = new Scanner(System.in);
    static int[][] grid = new int[4][4];
    public static void printBoard(int[][] board){
        for (int i = 0;i < 4;i++ ) {
            System.out.print("|");
            for (int j = 0;j < 4;j++ ) {
                System.out.print(board[i][j]+"|");
            }
            System.out.println("");
        }
    }
    public static boolean Array2DE(int[][] a1,int[][] a2){
        boolean x = true;
        for(int i = 0;i<4;i++){
            for (int j = 0;j<4;j++) {
                if(a1[i][j] != a2[i][j]){
                    x = false;
                }
            }
        }
        return x;
    }
    public static void spawn(){
        int numOf0 = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(grid[i][j] == 0){
                    numOf0++;
                }
            }
        }
        int randNum = (int)(Math.random()*numOf0)+1;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(grid[i][j] == 0){
                    randNum--;
                }
                if(randNum == 0){
                    grid[i][j] = ((int)(Math.random()*2)+1)*2;
                }
            }
        }
    }
    public static void merge(String con){
        if(con.equals("a")){
            for(int i = 0;i<4;i++){
                if(grid[i][0] == grid[i][1]){
                    grid[i][0] = grid[i][0]*2;
                    grid[i][1] = 0;
                    if(grid[i][2] == grid[i][3]){
                        grid[i][2] = grid[i][2]*2;
                        grid[i][3] = 0;
                    }
                }
                else if(grid[i][1] == grid[i][2]){
                    grid[i][1] = grid[i][1]*2;
                    grid[i][2] = 0;
                    if(grid[i][2] == grid[i][3]){
                        grid[i][2] = grid[i][2]*2;
                        grid[i][3] = 0;
                    }
                }else if(grid[i][2] == grid[i][3]){
                    grid[i][2] = grid[i][2]*2;
                    grid[i][3] = 0;
                }
            }
        }
        else if(con.equals("d")){
            for(int i = 0;i<4;i++){
                if(grid[i][3] == grid[i][2]){
                    grid[i][3] = grid[i][3]*2;
                    grid[i][2] = 0;
                    if(grid[i][1] == grid[i][0]){
                        grid[i][1] = grid[i][1]*2;
                        grid[i][0] = 0;
                    }
                }
                else if(grid[i][2] == grid[i][1]){
                    grid[i][2] = grid[i][2]*2;
                    grid[i][1] = 0;
                    if(grid[i][1] == grid[i][0]){
                        grid[i][1] = grid[i][1]*2;
                        grid[i][0] = 0;
                    }
                }else if(grid[i][1] == grid[i][0]){
                    grid[i][1] = grid[i][1]*2;
                    grid[i][0] = 0;
                }
            }
        }
        else if(con == "a"){

        }
        else if(con == "d"){

        }
    }
    public static void shiftOnce(String con){
        int x = 1000;
        int y = 1000;
        boolean isBottom = false;
        switch(con){
            case "w":
                for(int j = 0;j<4;j++){
                    for(int i = 0;i<4;i++){
                        if(grid[i][j] == 0){
                            x = i;
                            y = j;
                            isBottom = true;
                        }else if(grid[i][j] != 0 && isBottom){
                            grid[x][y] = grid[i][j];
                            grid[i][j] = 0;
                            x = i;
                            y = j;
                        }
                    }
                    isBottom = false;
                }
                break;

            case "a":
                for(int i = 0;i<4;i++){
                    for(int j = 0;j<4;j++){
                        if(grid[i][j] == 0){
                            x = i;
                            y = j;
                            isBottom = true;
                        }else if(grid[i][j] != 0 && isBottom){
                            grid[x][y] = grid[i][j];
                            grid[i][j] = 0;
                            x = i;
                            y = j;
                        }
                    }
                    isBottom = false;
                }
                break;
            case "d":
                for(int i = 3;i>-1;i--){
                    for(int j = 3;j>-1;j--){
                        if(grid[i][j] == 0){
                            x = i;
                            y = j;
                            isBottom = true;
                        }else if(grid[i][j] != 0 && isBottom){
                            grid[x][y] = grid[i][j];
                            grid[i][j] = 0;
                            x = i;
                            y = j;
                        }
                    }
                    isBottom = false;
                }
                break;

            case "s":
                for(int j = 3;j>-1;j--){
                    for(int i = 3;i>-1;i--){
                        if(grid[i][j] == 0){
                            x = i;
                            y = j;
                            isBottom = true;
                        }else if(grid[i][j] != 0 && isBottom){
                            grid[x][y] = grid[i][j];
                            grid[i][j] = 0;
                            x = i;
                            y = j;
                        }
                    }
                    isBottom = false;
                }
                break;

        }
    }
    public static void shift(String con){
        int[][] beforeGrid = new int[4][4];
        while(!Array2DE(beforeGrid,grid)){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    beforeGrid[i][j] = grid[i][j];
                }
            }
            shiftOnce(con);
        }
        merge(con);
    }
    public static boolean gameOver(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(i == 0 && j == 0){
                    if(grid[0][0] != grid[0][1] && grid[0][0] != grid[1][0]){
                        return true;
                    }
                }else if(i == 3 && j == 3){
                    if(grid[3][3] != grid[3][2] && grid[3][3] != grid[2][3]){
                        return true;
                    }
                }
                else if(i == 0 && j == 3){
                    if(grid[0][3] != grid[0][2] && grid[0][3] != grid[1][3]){
                        return true;
                    }
                }
                else if(i == 3 && j == 0){
                    if(grid[3][0] != grid[2][0] && grid[3][0] != grid[3][1]){
                        return true;
                    }
                }
                else if(i == 1 && j == 0 || i == 2 && j == 0){
                    if(grid[i][j] == grid[i-1][j] && grid[i][j] == grid[i+1][j] || grid[i][j] == grid[i][j+1]){
                        return true;
                    }
                }
                else if(i == 1 && j == 3 || i == 2 && j == 3){
                    if(grid[i][j] == grid[i-1][j] && grid[i][j] == grid[i+1][j] || grid[i][j] == grid[i][j-1]){
                        return true;
                    }
                }
                else if(i == 0 && j == 1 || i == 0 && j == 2){
                    if(grid[i][j] == grid[j-1][j] && grid[i][j] == grid[i+1][j] || grid[i][j] == grid[i][j+1]){
                        return true;
                    }
                }
                else if(i == 3 && j == 1 || i == 3 && j == 2){
                    if(grid[i][j] == grid[j-1][j] && grid[i][j] == grid[i-1][j] || grid[i][j] == grid[i][j+1]){
                        return true;
                    }
                }
                else{
                    if(grid[i][j] == grid[i+1][j] && grid[i][j] == grid[i-1][j] && grid[i][j] == grid[i][j-1] && grid[i][j] == grid[i][j+1]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static String ask(String ques){
        System.out.print(ques);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        spawn();
        spawn();
        printBoard(grid);
        while(true){
            shift(ask(": "));
            spawn();
            printBoard(grid);
        }
    }
}
