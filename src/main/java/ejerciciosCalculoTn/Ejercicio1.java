package ejerciciosCalculoTn;

/*
* En un array de n elementos se almacenan los números de 1 a n+1, excepto uno de ellos. Encuentre cuál falta.
* */
public class Ejercicio1 {
    //1 2 3 4 5 = 15 ->6
    //1 2 3 4 6 = 16 ->5
    //1 2 3 5 6 = 17 ->4
    //1 2 4 5 6 = 18 ->3
    //1 3 4 5 6 = 19 ->2
    //2 3 4 5 6 = 20 ->1

    public static void main(String[] args) {
        int vec[] = {1,2,3,4,5,6,7,8,9,10,11,12,14, 13,15,16,17};
        System.out.println("El faltante es: "+getFaltante(vec));
        getFaltanteFast(vec);
    }
    public static int getFaltante(int[] vec){
        int sumVec = 0;//2
        //4
        //Sum i=0->n (4+2) =>6n
        for (int i = 0; i < vec.length; i++) {
            //4
            sumVec += vec[i];//2
        }
        int n=vec.length+1;//2
        int sum = (n*(n+1))/2;//2

        return sum - sumVec;//1
        //2+4+6n+2+2+1 => 6n+11
    }
    public static int getFaltanteFast(int[] vec){
        int n = vec.length-1,m = vec.length/2;
        int p1 = vec[0], p2 = vec[1], pM= vec[m], pPostM = vec[m+1], pPreM= vec[m-1], pPreF=vec[n-1], pF= vec[n];
        System.out.println(p1+" "+p2+" "+pPreM+" "+pM+" "+pPostM+" "+pPreF+" "+pF);
        return 0;
    }
}
