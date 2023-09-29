public class Tester{
    public static void main(String[] args){
        
        Band band1 = new Band("0000000000");
        SLKopf kopf1 = new SLKopf();
        kopf1.pos=4;
        TuringTafel turingTafel = new TuringTafel();
        Zentraleinheit ZE = new Zentraleinheit();

        //turingTafel.useT1();
        //turingTafel.bieberN2();
        turingTafel.tmHallo();

        /*/
        System.out.println(turingTafel.tafel.get("q0-0"));
    

        
        System.out.println(kopf1.Lies(band1));
        */


         //System.out.println(turingTafel.tafel.get(ZE.derzeitigerZustand+"-"+kopf1.Lies(band1)));

         while(true){
            String inputTupel=ZE.derzeitigerZustand+"-"+kopf1.Lies(band1);
            String outputTupel=turingTafel.tafel.get(inputTupel);

            //System.out.println(outputTupel);

            kopf1.Schreibe(band1, outputTupel.charAt(0));
            kopf1.Bewege(outputTupel.charAt(2));

            if(outputTupel.charAt(2)=='S'){break;}

            ZE.derzeitigerZustand=outputTupel.substring(4);
            band1.BandAuslesen();
            
         }

         band1.BandAuslesen();

    }
}