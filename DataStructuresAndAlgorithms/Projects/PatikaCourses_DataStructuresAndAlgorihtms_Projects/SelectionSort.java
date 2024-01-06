public class SelectionSort{
    public static void main(String[] args) {
        //int list[] = {22, 27, 16, 2, 18, 6};
        int list[] = {7,3,5,8,2,9,4,15,6};
        for(int e : list){
            System.out.print(e);
            System.out.print(" ");
        }

        selectionSort(list);
        System.out.println();

        for(int e : list){
            System.out.print(e);
            System.out.print(" ");
        }
    }

    private static void selectionSort(int unsortedList[]){
        for(int i=0; i<unsortedList.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<unsortedList.length; j++){
                if (unsortedList[j] < unsortedList[min_idx]){
                    min_idx = j;
                }
            }

                int temp = unsortedList[min_idx]; 
                unsortedList[min_idx] = unsortedList[i]; 
                unsortedList[i] = temp; 
        }
    }
}