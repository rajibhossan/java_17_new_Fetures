public class PatternMatching {


    public static void main(String[] args) {
        PatternMatching patternMatching=new PatternMatching();

        int m=2;
        Integer i= 100;
        Double d=50d;

        System.out.println(patternMatching.multiply(i,m));
        System.out.println(patternMatching.multiplyWithDouble(d,m));
        System.out.println(patternMatching.isBiggerThanZero(d));
        System.out.println(patternMatching.isBiggerThanZero(i));

    }
    public boolean isBiggerThanZero(Object object){
        return object instanceof Integer number && number > 0;
    }

    public int multiply(Object object, int multiplier){
        if (object instanceof Integer i && i>0){
            i=i*multiplier;
            return i;
        }
        return 0;
    }

    public double multiplyWithDouble(Object object, int multiplier){
        if (object instanceof Double i && i>0){
            i=i*multiplier;
            return i;
        }
        return 0;
    }
}
