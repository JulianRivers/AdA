public class RotarDerecha {

    public static void main(String[] args) {
        byte[] arr = {1,2,3,4,5,6,7};
        byte[] rotada = rotar_drecha(arr, (byte)3);
        System.out.println("//////////////");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(rotada[i]+", ");
        }
        System.out.println(rotada[rotada.length-1]+".");
    }

    public static byte[] rotar_drecha(byte[] arr, byte cant){
        byte longitud = (byte) arr.length;
        byte[] rotada = new byte[longitud];
        int j =0;
        for (int i = longitud-1; i >= longitud-cant; i--) {
            rotada[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length-cant; i++) {
            rotada[j] = arr[i];
            j++;
        }

        return rotada;
    }
}
