package Section03_BitMagic;

public class CheckBit {
    static int isBitSet(int N) {
        // code here
        if(N==0){
        return 0;
        }
        if ((N & (N+1)) == 0){   
        return 1;
        }
        else{
            return 0;
        }
    }
}