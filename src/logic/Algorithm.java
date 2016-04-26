package logic;

/**
 * Created by Oliver on 4/26/2016.
 */
public class Algorithm {

    public double RunAlgorithm(int walkerLength) {
        while(true) {
            for(int i = 0; i < )
        }
    }

    private boolean checkIfBlack(int x, int y) {
        if(isPrime(x*x + y*y)) return true;
        if(isPrime(x) && y == 0){
            if(x % 4 == 3) return true;
        }
        if(isPrime(y) && x == 0){
            if(y % 4 == 3) return true;
        }
        return false;
    }

    private boolean isPrime(int p) {
        if(p < 2) return false;
        if(p == 2 || p == 3) return true;
        if(p % 2 == 0 || p % 3 == 0) return false;
        long sqrtN = (long)Math.sqrt(p) + 1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(p % (i-1) == 0 || p % (i+1) == 0) return false;
        }
        return true;
    }
}
