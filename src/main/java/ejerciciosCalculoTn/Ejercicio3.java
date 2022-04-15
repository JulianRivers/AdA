package ejerciciosCalculoTn;

public class Ejercicio3 {
    public static void main(String[] args) {
        int i = 1, j = 1;//4
        int a [][]= {{1,2,3,4}
                    ,{1,2,3,4}
                    ,{1,2,3,4}
                    ,{1,2,3,4}};//1+k
        int n = a[0].length-2;//3
        //3
        System.out.println(n);
//i=n+1    y j=n
        while (i<=n && j<=n){//3
            if(a[i][j+1] < a[i+1][j]){//3
                j++;//2
            } else{
                i++;//2
            }
        }
    }
}
