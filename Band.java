public class Band{
    char[] arr;
    String eingabeString="";
    int bandLaenge=0;



    public Band(String str){
        this.eingabeString=str;
        this.arr = new char[str.length()];

        for(int i=0; i<arr.length; i++){
            arr[i]=eingabeString.charAt(i);
        }

        this.bandLaenge=eingabeString.length();
    }


    public void BandAuslesen(){
        String out="";
        for(int i=0; i<arr.length; i++){
            out+=arr[i];
        }
        System.out.println(out);
    }



}