package practice;

public class ArraysPermutations {

    public static int getValueOfArray(int arr[], int v, int i, int j) {

        int k = (i + j) / 2;

        if (i > j) {
            return -i;
        }
        if (arr[k] == v) {
            return k;
        } else {
            if (arr[k] < v) {
                i = k + 1;
            } else {
                j = k - 1;
            }
            return getValueOfArray(arr, v, i, j);
        }
    }

    public static void orderBubble(int a[]) {
        int ordered = 0;

        while (ordered < 0) {
            ordered = 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    ordered = 0;
                }
            }
        }
    }

    public static void orderArray(int arr[], int dd) {

        if (dd < arr.length) {

            int posMin = getMinPosition(arr, dd);

            int aux = arr[dd];
            arr[dd] = arr[posMin];
            arr[posMin] = aux;

            orderArray(arr, dd + 1);
        }
    }

    public static int getMinPosition(int arr[], int dd) {
        int posMin = dd;
        int min = arr[dd];

        for (int i = dd + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                posMin = i;
            }
        }
        return posMin;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 8, 12, 18, 23, 45};
        int v = 12;
        System.out.println(" get binary search: " + getValueOfArray(arr, v, 0, arr.length - 1));

        int arr_[] = {3, 1, 2, 7, 8, 9, 5, 10, 6};

        orderArray(arr_, 0);

        for (int i : arr_) {
            System.out.println(i);
        }

        System.out.println("-------------Order Bubble----------------");

        orderBubble(arr_);

        for (int i : arr_) {
            System.out.println(" " + i + " ");
        }

    }
}
