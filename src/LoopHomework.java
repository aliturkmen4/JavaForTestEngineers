public class LoopHomework {
    public static void main(String[] args) {
        String kelime="Hello World!";
        int index=0;
        String yeniKelime="";
        while (index<kelime.length()){
            char bulunanKarakter=kelime.charAt(index);
            if(bulunanKarakter=='o'){
                yeniKelime=yeniKelime + 0;
            }
            else{
                yeniKelime=yeniKelime+bulunanKarakter;
            }
            index++;
        }
        System.out.println(yeniKelime);
    }
}
