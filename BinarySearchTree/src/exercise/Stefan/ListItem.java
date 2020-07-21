package exercise.Stefan;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    private Object value;

    ListItem(Object value) {
        this.value = value;
    }

    Object getValue() {
        return value;
    }

    void setValue(Object value) {
        this.value = value;
    }

    public abstract ListItem next();
    public abstract ListItem previous();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem setPrevious(ListItem item);
    public abstract int compareTo(ListItem item);

}
