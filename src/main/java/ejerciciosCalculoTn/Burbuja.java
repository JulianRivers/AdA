package ejerciciosCalculoTn;

public class Burbuja {
    public static void main(String[] args) {

    }

    public static void burbuja(int[] vec, int tamaño) {
        int i, j;//2
        //3
        for (i = 2; i < tamaño-1; i++) {
           //4
           //3
            for (j = 0;  j<tamaño-1 ; j++) {
                //4
                if (vec[j] > vec[j+1]){//3
                    intercarbia(vec[j],vec[j+1] );//1+5
                }
            }
        }
    }

    public static void intercarbia(int x, int y) {
        int aux;//1
        aux=x;//1
        x = y;//1
        y = aux;//1
        //1
    }
}
