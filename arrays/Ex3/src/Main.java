public class Main {
    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[A.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = 2 * (i + 1);
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] + A[i];
            System.out.print(B[i] + " ");
        }
    }
}