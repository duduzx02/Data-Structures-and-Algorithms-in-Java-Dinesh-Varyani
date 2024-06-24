package SinglyLinkedList;


public class Main {
    public static void main(String[] args) {
        ListNode<Integer> node = new ListNode<>();
        node.setData(20);

        ListNode<Integer> head = node;
        ListNode<Integer> second = new ListNode<>();
        second.setData(30);
        node.setNext(second);

        // Acessando o ultimo dado do nó
        ListNode<Integer> lastNode = head;
        while(lastNode.getNext() != null){
            lastNode = lastNode.getNext();
        }
        int lastData = lastNode.getData();
        System.out.println(lastData);
    }
}
