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

    public void bieberN2linked(){
        Zustand q0= new Zustand(null, null);
        Zustand q1= new Zustand(null, null);

        q0.zeroEdge=q1;
        q0.oneEdge=q1;
        q1.zeroEdge=q0;
        q1.oneEdge=q1;

    }

    public void bieberN3(){
        tafel.put("q0-0", "1-R-q1");
        tafel.put("q0-1", "1-S-q0");

        tafel.put("q1-1", "1-R-q1");
        tafel.put("q1-0", "0-R-q2");

        tafel.put("q2-0", "1-L-q2");
        tafel.put("q2-1", "1-L-q0");
    }

    public void deleteOne1(){
        tafel.put("q0-0", "0-R-q0");
        tafel.put("q0-1", "0-S-q0");

    }

    public void nonStopLR1delete(){
        tafel.put("q0-0", "0-R-q0");
        tafel.put("q0-1", "0-L-q1");
        tafel.put("q0-|", "|-S-q0");

        tafel.put("q1-0", "0-L-q1");
        tafel.put("q1-1", "0-R-q0");
        tafel.put("q1-|", "|-S-q1");
    }

    


}
