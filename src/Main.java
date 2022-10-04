import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("n=");
        int n;
        double s=0;
        double durchschnitt;
        Scanner myInput = new Scanner( System.in );
        n = myInput.nextInt();
        System.out.println("Zahlen:");
        for(int i=0; i<n; i++){
            s+=myInput.nextInt();
        }
        durchschnitt=s/n;
        System.out.println(durchschnitt);
    }

}