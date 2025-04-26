package javaMid2.collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        Node x = first;
        while(x != null)
        {
            System.out.println(x.item);
            x = x.next;
        }

        System.out.println("연결된 노드 확인");
        System.out.println(first);

    }
}
