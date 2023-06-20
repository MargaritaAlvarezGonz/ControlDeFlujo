public class UsoTags {
    //los tags se ocupan para anotar los ciclos for
    // Podemos romper un ciclo en específico y pueda compilar lo demas; rompe lo que decidimos
    public static void main(String[] args){
        outer: for (int j = 0; j <= 10; j++) {
            System.out.println("Imprimiendo tabla del " + j + "\n");
            inner: for (int i = 0; i <= 10; i++) {
                if(i%2==0){
                    break inner;
                }

                System.out.println(j + "x" + i + "=" + (j * i));

            }
        }
    }

}
