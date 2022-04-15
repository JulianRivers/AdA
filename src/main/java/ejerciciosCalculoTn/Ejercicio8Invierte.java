package ejerciciosCalculoTn;

public class Ejercicio8Invierte {

    public static void main(String[] args) {
        int i,j,n=10;//4
        int[][]a=new int[5][5];//2+k
        //2
        for (i = 0; i < n-1; i++) {
            //3
            //2
            for (j = 0; j < n-1 ; j++) {
                //3
                a[i][j] = 2*a[j][i] + a[i][j];//4
            }
        }
    }
}
