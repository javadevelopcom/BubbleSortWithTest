public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 9, 4, 8, 3, 7, 6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int a = 1; a < arr.length; a++) {
            for (int b = arr.length - 1; b >= a; b--) {
                if (arr[b] < arr[b - 1]) {
                    int z = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = z;
                }
            }
        }
        System.out.println();
        System.out.println("-------------------");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
