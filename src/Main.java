
public class Main {
    public static void main(String[] args) {
        String[] kisiler= { "Kadir", "Gökhan" ,"Hakan" , "Suzan", "Pınar" , "Mehmet","Ali", "Emel",
                " fırat", "James", "jale" ,"Ersin","Deniz", "Gözde","Anıl","Burak"};
        int[] derece= { 341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        System.out.println("birinci:" + birinci(kisiler,derece) + " dakika");
        System.out.println("ikinci:" + ikinci(kisiler,derece) +" dakika");
        System.out.println("üçüncü:" + ucuncu(kisiler,derece) +" dakika");
        puanlar(derece);
    }
    public static String birinci (String [] isim, int[] derece) {
        int temp = 0;
        String tempIsim;
        for (int i = 0; i < derece.length - 1; i++) {
            for (int j = i + 1; j < derece.length; j++) {
                if (derece[i] > derece[j]) {
                    tempIsim = isim[i];
                    isim[i] = isim[j];
                    isim[j] = tempIsim;
                    temp = derece[i];
                    derece[i] = derece[j];
                    derece[j] = temp;
                }
            }
        }
        return isim[0] + " " + derece[0];
    }
    public static String ikinci (String [] isim , int[] derece){
        birinci(isim,derece);
        return isim[1] + " " + derece[1];
    }

    public static String ucuncu (String[] isim, int[] derece){
        ikinci(isim,derece);
        return isim[2]+" "+ derece[2];
    }

    public static void puanlar(int [] derece){
        int dereceOne=0 , dereceTwo=0 , dereceThree=0;
        for(int i=0; i<derece.length; i++) {
            if (200 <= derece[i] && derece[i] <= 299)
                dereceOne++;
            if (300 <= derece[i] && derece[i] <= 399)
                dereceTwo++;
            if (400 <= derece[i])
            dereceThree++;
        }
        System.out.println("A->" + dereceOne);
        System.out.println("B->" + dereceTwo);
        System.out.println("C->" + dereceThree);


    }
}