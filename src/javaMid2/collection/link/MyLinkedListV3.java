package javaMid2.collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size;

    public void add(Object o)
    {
        Node newNode = new Node(o);
        if(first ==null)
        {
            first = newNode;
        }
        else
        {
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
        return x;
    }

    //코드 추가
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first; // 새로운 노드에 first의 기존 참조값을 담고
            first = newNode;    // first 변수에 새로만든 Node를 넣는다.
        }
        else {
            Node prev = getNode(index - 1); //해당 인덱스의 이전 노드 값을 얻는다
            newNode.next = prev.next; //new node에 기존 참조값을 담는다.
            prev.next = newNode; //
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        }else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV2{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
