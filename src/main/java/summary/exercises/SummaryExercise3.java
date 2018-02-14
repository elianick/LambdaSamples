package summary.exercises;

import org.junit.Test;

import summary.Exercise;

/**
 * Didnt you always hate it that you had to deal with checked exceptions in a
 * Runnable? Write a method uncheck that catches all checked exceptions and
 * turns them into unchecked exceptions.
 * <p>
 * Hint: Define an interface RunnableEx whose run method may throw any
 * exceptions
 *
 * @author aohz
 */

@FunctionalInterface
interface RunnableEx {

    void run() throws Exception;
}

public class SummaryExercise3 implements Exercise {


    @Test
    @Override
    public void perform() {
        new Thread(uncheck( () ->{
                System.out.println("Zzz");
                Thread.sleep(1000);
        })).start();
    }

    public static Runnable uncheck(RunnableEx runnableEx){
        Runnable r = () ->{
            try{
                runnableEx.run();
            }catch (Exception checkedException){
            throw new RuntimeException((checkedException));
            }
        };
        return r;
    }
}