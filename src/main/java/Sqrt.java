public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrtOwO(15));
    }
    static int sqrtOwO(int num) {
        int izq = 1;
        int der = num;
        int resultado = 0;
        while (izq <= der) {
            int mitad = izq + (der - izq) / 2;
            if (mitad * mitad == num) {
                return mitad;
            }
            if (mitad * mitad < num) {
                izq = mitad + 1;
                resultado = mitad;
            }
            else {
                der = mitad - 1;
            }
        }
        return resultado;
    }
}
