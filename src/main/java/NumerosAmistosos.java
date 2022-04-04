
public class NumerosAmistosos {
    public static void main(String[] args) {

        System.out.println(sonAmistosos(6368,6232));
    }

    public static boolean sonAmistosos(int n, int m) {
        if (n==m)
            throw new RuntimeException("N no puede ser igual a M boboooo");

        int numDivN[] = new int[n];
        int numDivM[] = new int[m];
        int i = 2, j = 0, k = 0, sumN = 1, sumM = 1;
        int min = n>m? m:n;
        int max = n>m? n:m;
        while (i<min){//recorre hasta el min-1 para ambos
            if (n%i==0){
                numDivN[j] = i; j++;
            }
            if(m%i==0){
                numDivM[k] = i; k++;
            }
            i++;
        }
        while(min<max){//luego del max ya recorrió el min y sigue desde ahí
            if (max==m && m%min==0){//si m es el max empieza a mirar si hay divisores
                numDivM[k] = min; k++;
            } else if (max==n && n%min==0){//si n es el max empieza a mirar si hay divisores
                numDivN[j] = min; j++;
            }
            min++;
        }
        i=0;//para reutilizar
        while (numDivN[i]!=0){//para q solo recorra la cantidad de divisores de n
            sumN += numDivN[i]; i++;
        }
        i=0;//para reutilizar
        while (numDivM[i]!=0){//para q solo recorra la cantidad de divisores de m
            sumM += numDivM[i]; i++;
        }
        return sumN == m && sumM == n;
    }
}
