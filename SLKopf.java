public class SLKopf{
    int pos=0;
    

    public void Bewege(char ch){
        if(ch=='L'){pos--;}
        if(ch=='R'){pos++;}
        else{//stop
        }

    }

    public char Lies(Band band1){
        if(pos<=band1.bandLaenge){
        return band1.arr[pos];
        } 
        else return '?';  
    }

   public void Schreibe(Band band1, char ch){
    band1.arr[pos]=ch;
   }


}