import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Queue {

    private final int TopIndex = 0;
    private ArrayList<listElement> list;

    private class listElement {
        private String text;
        private int priority;

        private listElement(String inputText, int inputPriority) {
            this.text = inputText;
            this.priority = inputPriority;
        }
        private String getText() {
            return this.text;
        }
        private int getPriority() {
            return this.priority;
        }
    }

    public Queue() {
        list = new ArrayList<>();
    }

    public void push(String inputText, int inputPriority) {
        listElement element = new listElement(inputText, inputPriority);
        list.add(element);
    }

    public String pop() {
        Collections.sort(list, new Comparator<listElement>() {
            @Override
            public int compare(listElement elementFirst, listElement elementSecond) {
                return Integer.compare(elementSecond.getPriority(), elementFirst.getPriority());

            }
        });
        listElement top = list.get(TopIndex);
        list.remove(TopIndex);
        return top.getText();
    }
}
