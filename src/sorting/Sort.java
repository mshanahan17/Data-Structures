package sorting;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 101 + 1);
        }
        double start = System.nanoTime();
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.bubbleSort(arr)));
        double finished = (System.nanoTime() - start)/1000000000.0;
        System.out.println("Bubble Sort " + finished);
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 101 + 1);
        }
        start = System.nanoTime();
        System.out.println(Arrays.toString(sort.selectionSort(arr)));
        finished = (System.nanoTime() - start)/1000000000.0;
        System.out.println("Selection Sort: " + finished);
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 101 + 1);
        }
        start = System.nanoTime();
        sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        finished = (System.nanoTime() - start)/1000000000.0;
        System.out.println("Quick Sort: " + finished);
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 101 + 1);
        }
        start = System.nanoTime();
        sort.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        finished = (System.nanoTime() - start)/1000000000.0;
        System.out.println("Merge Sort: " + finished);
    }

    public int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr){
        int min;
        int index;
        for(int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public void quickSort(int[] arr, int low, int high){

        if(low < high){
            int parIndex = partition(arr, low, high);

            quickSort(arr, low, parIndex - 1);
            quickSort(arr, parIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot) {
                i++;

                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        return i + 1;
    }

    public void mergeSort(int[] arr, int left, int right){

        if(left < right){
            int mid = (left + right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right){
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for(int i = 0; i < size1; i++){
            arr1[i] = arr[i + left];
        }
        for(int j = 0; j < size2; j++){
            arr2[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0;

        int k = left;
        while(i < size1 && j < size2){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < size1){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < size2){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }


}
