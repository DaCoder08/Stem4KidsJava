import java.util.Arrays;
public class BinarySearch{
    public static void main(String[] args) {
        int[] myArray = {2,3,7,9,4,6};
        int searchedNum = 4;
        Arrays.sort(myArray);
        boolean NumberNotFound = true;
        int indexNumberStart = 0;
        int indexNumberEnd = myArray.length-1;
        int two = 2;
        int indexNumberMiddle = 0;
        for(int i = 0;i<myArray.length;i++){
            System.out.print(myArray[i]+", ");
        }
        System.out.println();
        while(indexNumberStart<=indexNumberEnd){
            indexNumberMiddle = (indexNumberStart+indexNumberEnd)/2;
            if(searchedNum == myArray[indexNumberMiddle]){
                NumberNotFound = false;

                System.out.println("Number "+ searchedNum +" found");
                break;
            }
            else if(searchedNum < myArray[indexNumberMiddle]){
                indexNumberEnd = indexNumberMiddle+1;

            }else if(searchedNum > myArray[indexNumberMiddle]){
                indexNumberStart = indexNumberMiddle-1;
            }
        }
        System.out.println(indexNumberMiddle);
    }
}
