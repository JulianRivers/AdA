package ejerciciosCalculoTn;

public class Ejercicio10aSaber {
    public static void main(String[] args) {

    }

    public static int aSaber(int[] v, int y) {
        int result=0, i;//3
        i = v.length-1;//3
        //1
        while (i >= 0){//1
            result = result +v[i];//3
            i--;//2
        }
        return result;//1
    }


}
