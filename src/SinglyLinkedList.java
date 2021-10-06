public class SinglyLinkedList<E> {
    public static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E _element, Node<E> _next)
        {
            element = _element;
            next = _next;
        }

        public E getElement() { return element;}
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> _next) {next = _next; }
    }


    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    public SinglyLinkedList() {}

    public boolean isEmpty() {return  size ==0;}
    public int size() {return size;}

    public void addFirst(E newest) {
        head = new Node(newest, head);
        if(size == 0)
            tail = head;
        size ++;
    }

    public void addLast(E newest) {
        var temp = new Node(newest, null);

        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        size ++;
    }

    public E removeFirst()
    {
        if(isEmpty()) return null;
        var temp = head.getElement();
        head = head.next;
        size --;
        if(size == 0)
            tail = null;

        return temp;
    }
}
