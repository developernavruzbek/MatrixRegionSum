public class MatrixRegions {
    public static void main(String[] args) {
        float[][] A = new float[9][9];
        float sA = 0, sD = 0;


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                A[i][j] = i + j;
            }
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    sA += A[i][j];
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i < j && i + j < 8) || (i > j && i + j > 8)) {
                    sD += A[i][j];
                }
            }
        }

        System.out.println("(a) soha yig'indisi = " + sA);
        System.out.println("(d) soha yig'indisi = " + sD);
    }
}
