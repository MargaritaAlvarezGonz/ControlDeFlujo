public class EFinal2 {
    public static void main (String[] args){
        for (int j = 1; j <= 20; j++) {
            System.out.println("Es par \n");
            for (int i = 0; i <= 10; i++) {

                if(j % 2==0)
                System.out.println(j + "x" + i + "=" + (j * i));
            }
        }
    }
}
