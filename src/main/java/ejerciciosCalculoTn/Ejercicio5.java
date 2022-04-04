package ejerciciosCalculoTn;

public class Ejercicio5 {
    public static void main(String[] args) {
        int p = 0;//2
        int n = 10;//2 esto es inventado owo
        int[][] a = new int[10][10];//1+k esto también owo
        for (int i = 1; i < n; i++) {
            p = p+i*i;//2
            //3
            for (int j = 1; j < p; j++) {
                //3
                write(a[i][i]);//T'(n)+1
            }
        }
    }

    public static void write(int a) {

    }
}
