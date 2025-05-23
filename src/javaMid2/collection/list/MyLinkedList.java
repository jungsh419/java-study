package javaMid2.collection.list;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> first;
    private int size = 0;
    @Override
    public void add(E o)
    {
        Node<E> newNode = new Node<E>(o);
        if(first ==null) {
            first = newNode;
        }
        else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    private Node<E> getLastNode() {

        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    //코드 추가
    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first; // 새로운 노드에 first의 기존 참조값을 담고
            first = newNode;    // first 변수에 새로만든 Node를 넣는다.
        } else {
            Node<E> prev = getNode(index - 1); //해당 인덱스의 이전 노드 값을 얻는다
            newNode.next = prev.next; //new node에 기존 참조값을 담는다.
            prev.next = newNode; //
        }
        size++;
    }
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        }else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }
    @Override
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


    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item)
        {
            this.item = item;
        }

        @Override
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while(temp != null)
            {
                sb.append(temp.item);
                if(temp.next != null) {
                    sb.append("->");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }

    }
}
