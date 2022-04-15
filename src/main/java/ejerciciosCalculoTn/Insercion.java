package ejerciciosCalculoTn;

public class Insercion {
    public static void main(String[] args) {

    }

    public static void inserción(int[] v, int tamaño) {
        int i, j;//2
        //3
        for (i = 0; i < tamaño-2; i++) {
            //4
            int min = i;//2
            //4
            for (j = i+1;  j<tamaño-1 ; j++) {
                //4
                if (v[j] < v[min]) min = j;//3+1
            }
            intercambia(v[i],v[min]);//1+5
        }
    }

    public static void intercambia(int x, int y) {
        int aux;//1
        aux=x;//1
        x = y;//1
        y = aux;//1
        //1
    }
}
