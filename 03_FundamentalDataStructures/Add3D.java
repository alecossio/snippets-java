public class Add3D {
    public int[][][] add (int[][][] A, int[][][] B){
        if(A.length < 1 || A[0].length < 1 || A[0][0].length < 1 || B.length < 1 || B[0].length < 1 || B[0][0].length < 1)
            throw new IllegalArgumentException("matrix row/col size must be at least 1");
        if(A.length != B.length || A[0].length != B[0].length || A[0][0].length != B[0][0].length)       
            throw new IllegalArgumentException("matrix sizes must match");
        
            int[][][] C = new int[A.length][A[0].length][A[0][0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                for (int k = 0; k < A[0][0].length; k++){
                    C[i][j][k] = A[i][j][k] + B[i][j][j];
                }
            }
        }
        return C;
    }
    
    public void printMatrix(int[][][] C){
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[0].length; j++){
                for (int k = 0; k < C[0][0].length; k++){
                    System.out.print(C[i][j][k] + " | ");
                }
                System.out.print("\n-------\n");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Add3D add = new Add3D();
        
        int[][][] A = new int[2][2][2];
        int[][][] B = new int[2][2][2];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                for (int k = 0; k < A[0][0].length; k++){
                        A[i][j][k] = 3;
                        B[i][j][k] = 3;
                }
            }
        }
        add.printMatrix(add.add(A, B));
    }
}
