package MegaBytesConverter;

public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
        //should print "2050 KB = 2 MB and 2 KB"
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {


        //YY represents the calculated megabytes
        int  megaBytes = kiloBytes / 1024; // YY
        //ZZ represents the calculated remaining kilobytes
        int remainingKilo = kiloBytes  % 1024; //ZZ
        //if kilobytes is < 0, print "Invalid Value"
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        //print msg in format "XX KB = YY MB and ZZ KB" representing
        System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainingKilo + "KB");
        //value of kiloBytes



    }
}
