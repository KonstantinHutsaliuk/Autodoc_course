package lesson30.predicateExample;

import java.util.function.Predicate;

public class ForTest {
    public static void main(String[] args) {
        MyPredicate myPredicate = new MyPredicate() {
            @Override
            public boolean test(Integer value) {
                return value > 0;
            }
        };


        System.out.println(myPredicate.test(4));

        MyPredicate myPredicate1 = x -> x > 0;
        System.out.println(myPredicate1.test(0));

        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(1));
    }

}
