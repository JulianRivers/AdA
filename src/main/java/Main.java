public class Main
{
    public static void main(String[] args) {
        int []vec = {1,2,3};
        String imp = "";

        System.out.println("Cree un vector de 3 posiciones:");
        System.out.println("Imprima ese vector en una sola línea separado por ',' ");
        for (int i=0; i<vec.length-1; i++){
                imp = imp + vec[i]+ ", ";
        }
        imp += vec[vec.length-1];
        System.out.println(imp);
    }
}
