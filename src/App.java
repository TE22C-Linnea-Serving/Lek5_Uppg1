public class App {
    public static void main(String[] args) throws Exception {
        
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
    }
}
