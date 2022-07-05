class BubbleSort {
    public static void main(String[] args) {
        BubbleSort a = new BubbleSort();
        int[] A = { 7885, 32, 124, 52, 89, 686, 678, 642, 6543 };
        int[] B = { 312, 11, 45, 67, -4, 43 };
        A = a.sort(A);
        System.out.println("Sorted A :");
        a.display_arr(A);
        B = a.sort(B);
        System.out.println("Sorted B :");
        a.display_arr(B);
        System.out.println("Merged Array :");
        a.display_arr(a.merge_array(A, B));
    }

    int[] sort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    int[] merge_array(int[] A, int[] B) {
        int[] arr = new int[A.length + B.length];
        int i = 0, max = (int) Math.max(A.length, B.length);
        for (int x = 0; x < max; x++) {
            if (x < A.length)
                arr[i++] = A[x];
            if (x < B.length)
                arr[i++] = B[x];
        }
        return arr;
    }

    void display_arr(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + "\t");
        }
        System.out.println();
    }
}
