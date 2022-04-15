package ejerciciosCalculoTn;

public class Ejercicio7 {
    public static void main(String[] args) {
        int i = 1;//2
        int n = 10;//2
        int j = n;//2
        int[]a = new int[10];//2+k
        //1
        while (i < j){
            //1
            if (a[i] < a[j]){//3
                i = i*2;//1
            }else{
                j = j/2;//1
            }
        }
    }
}
