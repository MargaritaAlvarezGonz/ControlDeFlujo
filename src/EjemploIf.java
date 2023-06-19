public class EjemploIf {

    public static void main(String[] args){
        int edad = 15;
        boolean puedeEntrar=edad>=18;
        if(puedeEntrar){
            System.out.println("Puede ingresar al lugar");
        }else{
            System.out.println("Solo se permiten mayores de edad");
        }
    }
}
