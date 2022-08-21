import java.util.ArrayList;
import java.util.Random;

public class RandomQueue {

    private Random random;
    private ArrayList<String> list;

    public RandomQueue() {
        list = new ArrayList<>();
        random = new Random();
    }

    public void push(String text) {
        list.add(text);
    }

    public String pop() {
        int index = random.nextInt(list.size());
        String indexText = list.get(index);
        list.remove(index);
        return indexText;
    }
}
