package ejerciciosCalculoTn;

/*
* En un array de n elementos se almacenan los números de 1 a n+1, excepto uno de ellos. Encuentre cuál falta.
* */
public class Ejercicio1 {

    public static void main(String[] args) {
        int vec[] = {1,2,3,4,5,6,7,8,9,10,11,12,14, 13,15,16,17};
        System.out.println("El faltante es: "+getFaltante1(vec));
        System.out.println("El faltante es: "+getFaltante(vec));
        getFaltanteFast(vec);
    }
    public static int getFaltante1(int[] vec){
        int sumVec = 0, sum = 0;//2
        for (int i = 0; i < vec.length; i++) {
            sumVec += vec[i];//3
        }int n=vec.length+1;//3
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum - sumVec;//2
    }
    public static int getFaltante(int[] vec){
        int sumVec = 0;//2
        for (int i = 0; i < vec.length; i++) {
            sumVec += vec[i];//3
        }
        int n=vec.length+1;//3
        int sum = (n*(n+1))/2;//3

        return sum - sumVec;//2

    }
    public static int getFaltanteFast(int[] vec){
        int n = vec.length-1,m = vec.length/2;
        int p1 = vec[0], p2 = vec[1], pM= vec[m], pPostM = vec[m+1], pPreM= vec[m-1], pPreF=vec[n-1], pF= vec[n];
        System.out.println(p1+" "+p2+" "+pPreM+" "+pM+" "+pPostM+" "+pPreF+" "+pF);
        return 0;
    }
}
