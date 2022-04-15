package ejerciciosCalculoTn;

public class Ejercicio6Insercion {
    public static void main(String[] args) {

    }

    public static void inserción(int[] v, int tamaño) {
        int i, j;//2
        //3
        for (i = 0; i < tamaño-2; i++) {
            //4
            int min = i;//2
            //4
            intercambia(v[i],posMinimo(v,i,tamaño-1,min));//1+5+1+posMinimo
        }
    }

    public static int posMinimo(int[] v,int init, int end, int min){
        int i, result;//2
        result=init;//1
        //3
        for (i = init+1; i < end; i++) {
            //3
            if (v[i] < v[min]){//3
                result = i;//1
            }
        }
        return result;//1
    }
    public static void intercambia(int x, int y) {
        int aux;//1
        aux=x;//1
        x = y;//1
        y = aux;//1
        //1
    }
}
