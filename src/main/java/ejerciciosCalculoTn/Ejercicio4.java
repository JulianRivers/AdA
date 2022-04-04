package ejerciciosCalculoTn;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n = 10, suma;//3
        int a [][]= new int[10][10];//1+k
        int b [][]= new int[10][10];//1+k
        int c [][]= new int[10][10];//1+k
        //3
        for (int i = 0; i < n; i++) {
            //3
            //3
            for (int j = 0; j < n; j++) {
                //3
                suma = 0;//1
                //3
                for (int k = 1; k < n; k++) {
                    //3
                    suma = suma + a[i][k]*b[k][j];//4
                }
                c[i][j] = suma;//2
            }
        }
    }
}
