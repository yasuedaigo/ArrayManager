import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Queue {

    private final int TopIndex = 0;
    private ArrayList<ListElement> list;

    private class ListElement {
        private String text;
        private int priority;

        private ListElement(String inputText, int inputPriority) {
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
        ListElement element = new ListElement(inputText, inputPriority);
        list.add(element);
    }

    public String pop() {
        Collections.sort(list, new Comparator<ListElement>() {
            @Override
            public int compare(ListElement elementFirst, ListElement elementSecond) {
                return Integer.compare(elementSecond.getPriority(), elementFirst.getPriority());

            }
        });
        ListElement top = list.get(TopIndex);
        list.remove(TopIndex);
        return top.getText();
    }
}
