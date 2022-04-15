package ejerciciosCalculoTn;

public class Ejercicio9 {
    public static void main(String[] args) {//2

        int[]a = {1,2,3,4,5,6,1};//2+k
     
        int n = a.length-1;//6
        int max = 0, cont, j;//4
        //3
        cont = 0;//1
        for (int i = 1; i < n; i++) {
            //3
            j = i + 1;//2
            //3
            while (a[i] <= a[j]) {
                //3
                j++;//2
                cont++;//2
            }
            if (cont > max) {//1
                max = cont;//1
            }
            //cont++;//2
        }
        System.out.println(cont);
    }
}
