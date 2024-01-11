public class JavaSeal {

    public static void main(String[] args) {

        Shap2 shap2 = new Rajib();
        Shap2 shap21 = new Triangle();
        System.out.println(shap2.getClass());
        System.out.println(shap21.getClass());


    }

    public void isClass(Test test) {
        switch (test) {
            case Shap2 -> {
                System.out.println("Shap2");
            }
            case Triangle -> {
                System.out.println("Triangle");
            }
            case Rajib -> {
                System.out.println("Rajib");
            }
        }
    }
}
enum Test {Shap2, Triangle, Rajib}

sealed interface Shap2 permits Triangle, Rajib {

}

sealed class Triangle implements Shap2 {

}

final class Rajib extends Triangle implements Shap2 {

}


