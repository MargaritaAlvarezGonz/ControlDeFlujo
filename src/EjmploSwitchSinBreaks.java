public class EjmploSwitchSinBreaks {
    public static void main (String[] args){
    int opcion = 1;
        switch (opcion){
        case 0:
            System.out.println("Opcion 0");

        case 1:
            System.out.println("Opcion 1");

        case 2:
            System.out.println("Opcion 2");
            break;
        case 3:
            System.out.println("Opcion 3");
            break;
        default:
            System.out.println("Opcion 4");
            break;
    }
    }
}
