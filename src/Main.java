import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma=0;

        while(n!=0)
        {
            int temp=n%10;
            n=n/10;
            suma+=temp;
        }

        return suma;
    }

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        int n;
        do {
            System.out.print("Unesite broj: ");
            n = ulaz.nextInt();
            if(n <= 0)
                System.out.println("Unesite ponovo, broj nije veci od 0.");
        } while ( n <= 0 );
        System.out.println("Brojevi koji su djelivi sa sumom svojih cifara su: ");
        for (int i=1; i <=n ; i++ ) {

            if (i % sumaCifara(i) == 0)
                System.out.print(i + " " );
        }
    }
}

