package exercise.Stefan;

public class Node extends ListItem {

    Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem comparedItem) {
        if (comparedItem != null)
            return ((String) super.getValue()).compareTo((String) comparedItem.getValue());
        return -1;
    }
}
