package lession_2;

import java.util.concurrent.TimeUnit;

public class Timer {

    private static Runnable measureTime(Runnable action, String actionName) {
        return () -> {
            long startTime = System.nanoTime();
            action.run();
            long finishTime = System.nanoTime();
            long duration = finishTime - startTime;

            System.out.printf("%s took time: %d micros.%n", actionName, TimeUnit.NANOSECONDS.toMicros(duration));
        };
    }
}


