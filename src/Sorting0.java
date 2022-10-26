import java.util.Random;
public class Sorting0{
    public static void main(String[] args){
        int[] numList = new int[20];
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
        bubbleSort(numList);
        System.out.println("S O R T E D   L I S T");
        for(int y=0; y<numList.length; y++){
            System.out.print(numList[y]);
            System.out.print(", ");
        }
    }
    
    // slow, but works
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