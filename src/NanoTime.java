import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NanoTime {

    public static void main(String[] args) {
        System.out.println("Hello world!\n------------------");

        // List<String> stringList = new LinkedList<>(); // 151700 LinkedList
        List<String> stringList = new ArrayList<>(); // 17900 ArrayList
        for (int i = 0; i < 10000; i++) {
            stringList.add(String.valueOf(i));
        }

        long startTime = System.nanoTime(); // 151700 LinkedList, // 17900 ArrayList
        // code
        codeExecute(stringList);

        long estinatedTime = System.nanoTime() - startTime;

        System.out.println("time it took to execute = " + estinatedTime);
    }

    private static void codeExecute(List l) {
        int size = l.size();
        Object o = l.get(size/2);
    }
}