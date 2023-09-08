import java.util.Scanner;
public class EjercicioResuelto11 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a, b, c;
        while(true){
            System.out.println("Ingrese el primer numero: ");
            a=entrada.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            b=entrada.nextInt();
            System.out.println("Ingrese el tercer numero: ");
            c=entrada.nextInt();
            if(a==b || b==c || c==a){
                System.out.println("Hay numeros iguales, ingrese numeros diferentes.");
            }
            else{
                break;
            }
        }
        if(a>b && b>c){
            System.out.println("El numero mayor es: "+a);
        }else if(b>a && b>c){
            System.out.println("El numero mayor es: "+b);
        }
        else{
            System.out.println("El numero mayor es: "+c);
        }


    }
}
