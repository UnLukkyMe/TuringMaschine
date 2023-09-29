import java.util.HashMap;

public class TuringTafel {

   

    HashMap<String, String> tafel = new HashMap<String, String>();
    
    public void useT1(){
    tafel.put("q0-0", "1-R-q1"); //q1
    tafel.put("q0-1", "1-R-q0");

    tafel.put("q1-0", "1-R-q2"); 
    tafel.put("q1-1", "1-R-q2");
    
    tafel.put("q2-0", "1-S-q3");
    tafel.put("q2-1", "1-S-q3");
    }

    public void bieberN2(){
        tafel.put("q0-0", "1-R-q1");
        tafel.put("q0-1", "1-L-q1");

        tafel.put("q1-0", "1-L-q0");
        tafel.put("q1-1", "1-S-q1");
    }

    


}
