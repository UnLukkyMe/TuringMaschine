public class Zustand {
    //Binärer Zustand
    Zustand zeroEdge;
    Zustand oneEdge;
    //char cameFromAOneEdge;
    //char cameFromAZeroEdge;

    public Zustand(Zustand zero, Zustand one){
        this.zeroEdge=zero;
        this.oneEdge=one;
    }

}
