package interview_programs;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int rotatingIndex = 3;
        int[] b = new int[a.length];

        int j = 0;
        for (int i = rotatingIndex; i < a.length; i++) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < rotatingIndex; i++) {
            b[j] = a[i];
            j++;
        }
        for (j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
    }
}