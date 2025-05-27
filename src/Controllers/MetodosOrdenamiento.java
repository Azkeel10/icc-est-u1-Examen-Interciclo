package Controllers;

import Models.Universidad;

public class MetodosOrdenamiento {
    public static void sortInsertionAsc(Universidad[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Universidad key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].matriculados > key.matriculados) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
//---------------------------------------------------------------------
    public static void sortInsertionDesc(Universidad[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Universidad key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].matriculados < key.matriculados) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
//---------------------------------------------------------------------
    public static void sortBubbleAsc(Universidad[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].matriculados > arr[j + 1].matriculados) {
                    Universidad temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
//---------------------------------------------------------------------
    public static void sortBubbleDesc(Universidad[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].matriculados < arr[j + 1].matriculados) {
                    Universidad temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
//---------------------------------------------------------------------
    public static void sortSelectionAsc(Universidad[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].matriculados < arr[minIdx].matriculados) {
                    minIdx = j;
                }
            }
            Universidad temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
//---------------------------------------------------------------------
    public static void sortSelectionDesc(Universidad[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].matriculados > arr[maxIdx].matriculados) {
                    maxIdx = j;
                }
            }
            Universidad temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
//---------------------------------------------------------------------
}
