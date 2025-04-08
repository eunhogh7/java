import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kor = 0,eng = 0, mat = 0, scl = 0;
        int sum = 0;
        int intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;


        kor = scanner.nextInt();
        eng = scanner.nextInt();
        mat = scanner.nextInt();
        scl = scanner.nextInt();

        sum = kor + eng + mat + scl;

        intAvg = sum / 4;
        doubleAvg = sum/4;

        boolRslt = intAvg == doubleAvg;

        System.out.println( sum);
        System.out.println(intAvg);
        System.out.println(doubleAvg);
        System.out.println(boolRslt);

        scanner.close();


    }
}"