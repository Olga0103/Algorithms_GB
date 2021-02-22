package lession_6;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

public class TreeMapTest {

    @Test
    public void homework() {
        int countOfTrees = 20;

        int balanced = 0;
        for (int i = 0; i < countOfTrees; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            fillTreeMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Из " + countOfTrees + " деревьев сбалансировано всего " + balanced);
        System.out.println("Несбалансировано " + ((((int) (countOfTrees - balanced)) * 100) / (int) countOfTrees) + " %");
    }

    private void fillTreeMap(TreeMap<Integer, Integer> _MyTreeMap) {
        while (_MyTreeMap.height() < 6) {
            _MyTreeMap.put(ThreadLocalRandom.current().nextInt(-100, 100), 0);
        }
    }
}
