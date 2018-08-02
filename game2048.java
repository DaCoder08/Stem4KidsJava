    import java.util.*;
public class game2048{
    static Scanner sc = new Scanner(System.in);
    static int[][] grid = new int[4][4];
    public static void printBoard(int[][] board){
        for (int i = 0;i < 4;i++ ) {
            System.out.print("|");
            for (int j = 0;j < 4;j++ ) {
                int len = (board[i][j]+"").length();
                for(int k = 0;k<5-len;k++){
                    System.out.print(0);
                }
                System.out.print(grid[i][j]+"|");
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
                }else if(grid[i][2] == grid[i][3]){
                    grid[i][2] = grid[i][2]*2;
                    grid[i][3] = 0;
                }
            }
        }
        else if(con.equals("d")){
            for(int i = 3;i>-1;i--){
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
                }else if(grid[i][2] == grid[i][3]){
                    grid[i][2] = grid[i][2]*2;
                    grid[i][3] = 0;
                }
            }
        }
        else if(con.equals("w")){
            for(int i = 3;i>-1;i--){
                if(grid[0][i] == grid[1][i]){
                    grid[0][i] = grid[0][i]*2;
                    grid[1][i] = 0;
                    if(grid[2][i] == grid[3][i]){
                        grid[2][i] = grid[2][i]*2;
                        grid[3][i] = 0;
                    }
                }
                else if(grid[1][i] == grid[2][i]){
                    grid[1][i] = grid[1][i]*2;
                    grid[2][i] = 0;
                    if(grid[2][i] == grid[3][i]){
                        grid[2][i] = grid[2][i]*2;
                        grid[3][i] = 0;
                    }
                }else if(grid[2][i] == grid[3][i]){
                    grid[2][i] = grid[2][i]*2;
                    grid[3][i] = 0;
                }
            }
        }
        else if(con.equals("s")){
            for(int i = 0;i<4;i++){
                if(grid[0][i] == grid[1][i]){
                    grid[0][i] = grid[0][i]*2;
                    grid[1][i] = 0;
                    if(grid[2][i] == grid[3][i]){
                        grid[2][i] = grid[2][i]*2;
                        grid[3][i] = 0;
                    }
                }
                else if(grid[1][i] == grid[2][i]){
                    grid[1][i] = grid[1][i]*2;
                    grid[2][i] = 0;
                    if(grid[2][i] == grid[3][i]){
                        grid[2][i] = grid[2][i]*2;
                        grid[3][i] = 0;
                    }
                }else if(grid[2][i] == grid[3][i]){
                    grid[2][i] = grid[2][i]*2;
                    grid[3][i] = 0;
                }
            }
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
        shiftOnce(con);
    }
    public static boolean gameOver(){
        int[][] temp = new int[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                temp[i][j] = grid[i][j];
            }
        }
        shift("w");
        if(temp != grid){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    grid[i][j] = temp[i][j];
                }
            }
            return false;
        }
        shift("s");
        if(temp != grid){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    grid[i][j] = temp[i][j];
                }
            }
            return false;
        }
        shift("a");
        if(temp != grid){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    grid[i][j] = temp[i][j];
                }
            }
            return false;
        }
        shift("d");
        if(temp != grid){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    grid[i][j] = temp[i][j];
                }
            }
            return false;
        }
        return true;
    }
    public static String ask(String ques){
        System.out.print(ques);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        spawn();
        spawn();
        printBoard(grid);
        while(!gameOver()){
            shift(ask(": "));
            spawn();
            printBoard(grid);
        }
        System.out.println("Game Over :(");
    }
}
