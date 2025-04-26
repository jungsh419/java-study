package javaMid2.collection.linked;

public class Node<E> {
    E item;
    Node next;

    public Node(E item)
    {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while(x != null)
        {
            sb.append(x.item);
            if(x.next != null)
            {
                sb.append("->");

            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
