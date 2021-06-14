package code.tasks;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class HomeTasks_PrimitiveInterfaces {

    public static void main(String[] arg)
    {
        inPredicatePrime();
        intConsumerSquare(10);
        inSupplierRandom();
    }

    public static void inPredicatePrime()
    {
        IntPredicate intPredicate = (x) ->
        {
            boolean flag = true;
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        };

        System.out.println("Is 7 is prime number ? : "
                + intPredicate.test(7));
        System.out.println("Is 200 is prime number ? : "
                + intPredicate.test(200));
    }
    public static void intConsumerSquare(int number)
    {
        IntConsumer display = a -> System.out.println("Square :"+a * a);
        display.accept(number);
    }

    public static void inSupplierRandom()
    {
        IntSupplier
                sup
                = () -> (int)(Math.random() * 5000)+1;

        System.out.println("Random Number below 5000 : "+sup.getAsInt());
    }
}
