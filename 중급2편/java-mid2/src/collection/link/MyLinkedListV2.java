package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    /**
     * 마지막에 데이터를 추가: o(n)
     */
    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return  x;
    }

    /**
     * 특정 위치에 데이터를 추가
     */
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    /**
     * 특정 위치에 있는 데이터를 찾아서 변경하고, 기존 값을 반환: o(n)
     */
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    /**
     * 특정 위치에 있는 데이터를 제거
     */
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if(index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    /**
     * 특정 위치에 있는 데이터를 반환: o(n)
     */
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    /**
     * 데이터를 검색하고, 검색된 위치를 반환: o(n)
     */
    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
