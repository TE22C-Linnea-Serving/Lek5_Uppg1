import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        
        //a)
        int[] fält1 = {8,4,6,3,9};                                                  //Fält1
        System.out.println("Fält1 1:a tal är: \""+fält1[0]+"\"");                   //Skriver ut 1:a talet i fält1
        System.out.println("Fält1 2:a tal är: \""+fält1[1]+"\"");                   //Skriver ut 2:a talet i fält1                   
        System.out.println("Fält1 3:e tal är: \""+fält1[2]+"\"");                   //Skriver ut 3:e talet i fält1
        System.out.println("Fält1 4:e tal är: \""+fält1[3]+"\"");                   //Skriver ut 4:e talet i fält1
        System.out.println("Fält1 5:e tal är: \""+fält1[4]+"\"");                   //Skriver ut 5:e talet i fält1

        System.out.println("Antal element i fält1 är: \""+fält1.length+"\"");
        int summafält1 = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        System.out.println("Medelvärdet för fält1 är: \""+summafält1/(double)fält1.length+"\"");

        System.out.println(" "); //Nytt stycke

        //b)
        int[] fält2 = {18,14,16,13,19};   //Fält 2
        int summafält2 = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];                              //Summan av fält 2
        int summafält1_2 = summafält1+summafält2;                                                   //Summan av fält 1 och 2
        System.out.println("Summan av fält 1 och fält 2 är: \""+summafält1_2+"\"");                 //Skriver ut summan av fält 1 och 2
        System.out.println("Medelvärdet av fält 2 är: \""+summafält2/(double)fält2.length+"\"");    //Skriver- och räknar ut medelvärdet av fält 2

        System.out.println(" "); //Nytt stycke

        //c)
        int[] summafält = new int[5];     //Fältet av summan av de olika talen i fält 1 och fält 2
        summafält[0] = fält1[0]+fält2[0];
        summafält[1] = fält1[1]+fält2[1];
        summafält[2] = fält1[2]+fält2[2];
        summafält[3] = fält1[3]+fält2[3];
        summafält[4] = fält1[4]+fält2[4];


        //d)
        System.out.println("Skriv in 4 tal som du vill veta summan av: ");
        int[] fält3 = new int[4];          //Fält 4
        int nr0 = tangentbord.nextInt();
        int nr1 = tangentbord.nextInt();
        int nr2 = tangentbord.nextInt();
        int nr3 = tangentbord.nextInt();

        fält3[0] = nr0;
        fält3[1] = nr1;
        fält3[2] = nr2;
        fält3[3] = nr3;

        System.out.println("Summan är: \""+(fält3[0]+fält3[1]+fält3[2]+fält3[3])+"\""); //Skriver ut summan av talen användaren skrev in
    }

}
