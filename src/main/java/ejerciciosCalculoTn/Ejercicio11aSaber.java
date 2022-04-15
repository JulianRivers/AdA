package ejerciciosCalculoTn;

public class Ejercicio11aSaber {
    public static void main(String[] args) {

    }

    public static int aSaber(int[] v, int y) {
        int result, i;//2
        result = 0;//1
        i = v.length-1;//2
        //1
        while (i >= 0){
            //1
            result = result +v[i];//2
            i = i-2;//2
        }
        return result;//1
    }


}
