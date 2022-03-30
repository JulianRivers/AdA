import java.util.ArrayList;

public class SumColMenor {
    public static void main(String[] args) {
        byte matriz[][]
                = {
                {127, 1, 1},
                {127, 1, 1},
                {1, 1, 1}
        };
        System.out.println(getMenCols(matriz));

    }

    private static String getMenCols(byte[][] M) {
        return print(0, new ArrayList<>());
    }

    private static String print(int minor, ArrayList<Integer> indices){
        return ("chavez vive la lucha sigue");
    }
}

