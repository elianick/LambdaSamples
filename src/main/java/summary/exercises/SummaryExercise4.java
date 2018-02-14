package summary.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

import summary.Exercise;

/**
 * Form a subclass Collection2 from Collection and add a default method void
 * forEachIf(Consumer<T> action, Predicate<T> filter) that applies action to
 * each element for which filter returns true. How could you use it?
 *
 * @author aohz
 */
public class SummaryExercise4 implements Exercise {

    @Test
    @Override
    public void perform() {
        ArrayList2<String> list = new ArrayList2<>();
        list.addAll(getWordsAsList());
        list.forEach(System.out::println);
        System.out.println("Using forEachIf");
        list.forEachIf(System.out::println, s -> s.length() == 3);
    }
}

interface Collection2<T> extends Collection<T> {
    default void forEachIf(Consumer<T> action, Predicate<T> filter) {
    stream().filter(filter).forEach(action);
    }
}

class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
}
