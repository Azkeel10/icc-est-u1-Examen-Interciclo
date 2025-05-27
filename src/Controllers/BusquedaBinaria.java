package Controllers;

import Models.Universidad;

public class BusquedaBinaria {
    public static Universidad binarySearchByEnrollment(Universidad[] arr, int valor, boolean ascendente) {
        int inicio = 0, fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio].matriculados == valor) {
                return arr[medio];
            }

            if (ascendente) {
                if (arr[medio].matriculados < valor) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                if (arr[medio].matriculados > valor) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
        }

        return null;
    }
}

