package ejerciciosCalculoTn;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(num+" es triangular: "+esTriangular(num));
    }

    public static boolean esTriangular(int x){
        int sum = 0;//2
        boolean esTriangular = false;//2
        //3
        for (int i = 1; sum<x; i++) {
            //3
            sum = (i*(i+1))/2;//2
            if (sum == x){//1
                esTriangular = true;//1
            }
        }
        return esTriangular;//1
    }//2+2+3+n(3+1+1+1)+1 =>7+6n
}
