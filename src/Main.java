import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.List.of;

public class Main {
    private static int i;


    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[9999];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 999);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("***");

        //Copy
        int[] copyArr = new int[9999];
        System.arraycopy (arr, 0, copyArr, 0, 9999);
        for (int i=0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Runnable> tasks = of(
                Timer(copyArr::sortBubble, "Sort Bubble"),
                Timer(copyArr::sortSelect, "Sort Select"),
                Timer(copyArr::sortInsert, "Sort Insert")
        );

        for (Runnable task : tasks) {
            task.run();
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);


    }
}
