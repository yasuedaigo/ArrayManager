import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(String text) {
        list.add(text);
    }

    public String pop() {
        int lastIndex = list.size() - 1;
        String last = list.get(lastIndex);
        list.remove(lastIndex);
        return last;
    }
}
