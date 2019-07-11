import java.util.Random;
public class Sorting1{
    public static void main(String[] args){
        int[] numList = new int[10];
        Random rand = new Random();
        for(int x=0; x<numList.length; x++){
            numList[x] = rand.nextInt(100);
        }
        System.out.println("U N S O R T E D   L I S T");
        for(int y=0; y<numList.length; y++){
            System.out.print(numList[y]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();
        numList = selectionSort(numList);
        System.out.println("S O R T E D   L I S T (not yet tho)");
        for(int y=0; y<numList.length; y++){
            System.out.print(numList[y]);
            System.out.print(", ");
        }
    }

    public static int[] selectionSort(int[] numList){
        for(int b=0; b<numList.length; b++){
            int lowNum = b;
            for(int c=1; c<(numList.length); c++){
                if(numList[lowNum] > numList[c]){
                    lowNum = numList[c];
                }
            }
            int temp = //sdfsdfsdf; //place  to , then place temp to lowNum
        }
        return numList;
    }

    public static int[] bubbleSort(int[] numList){
        for(int a=0; a<numList.length; a++){
            for(int z=0; z<(numList.length-1); z++){
                if(numList[z] > numList[z+1]){
                    //swap the places of both numbers
                    int temp = numList[z];
                    numList[z] = numList[z+1];
                    numList[z+1] = temp;
                }
            }
        }
        return numList;
    }
}