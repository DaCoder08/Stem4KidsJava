public class Recursion{
    public static void countdown(int x){
        if (x <= 0 ){
            System.out.println(x);
        }else{
            System.out.println(x);
            countdown(x-1);
        }
    }
    public static int fact(int x){
        if (x <= 1){
            return x;
        }else{
            return x * fact(x-1);
        }
    }
    public static int addAll(int x){
        if (x <= 0){
            return x;
        }else{
            return x + fact(x-1);
        }
    }
    public static int addDigits(int x){
        if (x%10 == x){
            return x;
        }else{
            return x%10 + addDigits(x/10);
        }
    }

    public static int triangularNum(int x,int i){
        if ((i*(i+1))/2 >= x){
            return ((i-1)*i)/2;
        }
        else{
            return triangularNum(x, i+1);
        }
    }
    public static int PowerOf2(int x,int i){
        if (Math.pow(2.0,i) >= x){
            return (int)Math.pow(2.0,(i-1));
        }
        else{
            return (int)PowerOf2(x, i+1);
        }
    }
    public static void triangleOfStars(int x,int i){
        if(i == x){
            for(int j = 0;j<x;j++){
                System.out.print('*');
            }
            System.out.println("");
        }else{
            for(int j = 0;j<x;j++){
                System.out.print('*');
            }
            System.out.println("");
            triangleOfStars(x+1,i);
        }
    }
    public static void subtractFirstAndLast(int x){
        String x2 = ""+x;
        int xl = (int)x2.charAt(x2.length()-1);
        int xf = (int)x2.charAt(0);
        System.out.println(xf-xl);
    }
    public static void GCFR(int x,int y,int i,int i2){
        if(i>x||i>y){
            System.out.println(i2);
        }else{
            if(x%i == 0 && y%i == 0){
                i2 = i;
            }
            GCFR(x,y,i+1,i2);
        }
    }
    public static void GCF(int x,int y){
        GCFR(x,y,1,1);
    }
    public static void main(String[] args) {
        GCF(12,18);
    }
}
