import java.util.Random;
public class SortingFull{
	// more sorting methods
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

        numList = bogoSort(numList);

        System.out.println("S O R T E D   L I S T");
        for(int y=0; y<numList.length; y++){
            System.out.print(numList[y]);
            System.out.print(", ");
        }
    }

    public static int[] bubbleSort(int[] numList){
        //goes through the list and if a number is greater than the next number, it swaps.
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
    
    public static int[] selectionSort(int[] numList){
        //goes through the list from a selected number to find a number smaller than one that is selected, and swaps with it.
        for(int b=0; b<numList.length; b++){
            int lowNum = b;
            for(int c=b; c<numList.length; c++){
                if(numList[lowNum] > numList[c]){
                    lowNum = c;
                }
            }
            int temp = numList[lowNum];
            numList[lowNum] = numList[b];
            numList[b] = temp;
        }
        return numList;
    }

    public static int[] insertionSort(int[] numList){
        //assumes first number is sorted and other numbers go left or right compared to other numbers.
        for(int d=1; d<(numList.length); d++){

            for(int e=0; e<numList.length; e++){
                System.out.print(numList[e]);
                System.out.print(", ");
            }
            System.out.println();

            int f = 0;
            while(numList[d-f-1] > numList[d-f]){
                int temp = numList[d-f-1];
                numList[d-f-1] = numList[d-f];
                numList[d-f] = temp;
                f++;
            }
        }
        System.out.println();
        return numList;
    }

    public static void shuffle(int[] numList){
        Random rand = new Random();
        for(int h=0;h<numList.length; h++){
            int r = rand.nextInt(numList.length);
            int temp = numList[r];
            numList[r] = numList[h];
            numList[h] = temp;
        }
    }

    public static int[] bogoSort(int[] numList){
        //randomizes a set of numbers and if it isn't sorted, repeat.
        int count = 0;
        boolean sorted = false;
        while(sorted == false){
            sorted = true;
            for(int i=0; i<numList.length; i++){
                System.out.print(numList[i]);
                System.out.print(", ");
            }
            System.out.println();
            for(int g=0; g<(numList.length-1); g++){
                if(numList[g] > numList[g+1]){
                    sorted = false;
                }
            }
            if(sorted == false){
                shuffle(numList);
                count++;
            }
        }
        System.out.println();
        System.out.println("This list had to be shuffled " +count+ " times to sort it.");
        return numList;
    }
}