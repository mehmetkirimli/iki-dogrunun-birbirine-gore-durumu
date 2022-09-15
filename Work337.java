import java.util.Scanner;

public class Work337 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double m1 = 1;
        double m2 = 1;
        double n1 = 1;
        double n2 = 1 ;
        double xc1 ;
        double yc1 ;


        System.out.println("1. nokta icin x sonra y degerini giriniz : ");
        double x1 = input.nextDouble();
        System.out.print(" y= ");
        double y1 = input.nextDouble();

        System.out.println("2. nokta icin x sonra y degerini giriniz : ");
        double x2 = input.nextDouble();
        System.out.print(" y= ");
        double y2 = input.nextDouble();

        System.out.println("3. nokta icin x sonra y degerini giriniz : ");
        double x3 = input.nextDouble();
        System.out.print(" y= ");
        double y3 = input.nextDouble();

        System.out.println("4. nokta icin x sonra y degerini giriniz : ");
        double x4 = input.nextDouble();
        System.out.print(" y= ");
        double y4 = input.nextDouble();



        m1 = (y2 - y1) / (x2-x1) ;
        m2 = (y4 - y3) / (x4-x3) ;

        System.out.println("m1 = " + m1 + " \n m2 =" + m2);


        if(m1 == m2)
        {
            System.out.println("X1Y1  - X2Y2  dogrusu && X3Y3 - X4Y4 dogrusuna  P A R A L E L D I R. \n veya tek cakisik noktadirlar");
        }

        else if (m1 != m2)

        {
            System.out.println("paralel degil");
            System.out.println("paralel degilse denklemler bulunmalidir.");

            n1 = y1 - (m1*x1) ;
            n2 = y3 - (m2*x3) ;

            System.out.print("1.denklem = ");
            System.out.print("y= "+m1+" x  +  "+n1);

            System.out.println();

            System.out.print("2.denklem = ");
            System.out.println("y= "+m2+" x  +  "+n2);

            System.out.println(" iki denklemi birbirine esitlememiz gerekli . ( y1 = y2 )");
            System.out.println("Esitlenen denklemden X degerini daha sonra Y degerini bulmaliyiz , bu degerler kesisim noktasinin koordinatlaridir.");

            xc1 = ( n2-n1 ) / (m1 -m2 ) ;
            System.out.println(xc1 + " kesisen noktanin X koordinatidir.");

            yc1 = (m1*xc1) + n1 ;
            System.out.println(yc1 + " kesisen noktanin Y koordinatidir.");

            System.out.println(" ### (X , Y ) = " + xc1 + "," + yc1 );





        }

    }

}



