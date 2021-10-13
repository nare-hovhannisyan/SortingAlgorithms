public class DoublyLinkedListNOHeader<E> {

    private static class Node<E>
    {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E el, Node<E> p, Node<E> n)
        {
            element = el;
            prev = p;
            next = n;
        }

        public E getElement(){ return element;}
        public Node<E> getNext() {return next;}
        public Node<E> getprev() {return prev;}
        public void setNext(Node<E> el) {next = el;}
        public void setPrev(Node<E> el) {prev = el;}

    }

    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    public DoublyLinkedListNOHeader()
    {


    }

    public int size() {return size;}
    public boolean isEmpty() { return size == 0;}

    public E first()
    {
        if(isEmpty())
            return null;
        return head.getElement();
    }

    public E last()
    {
        if(isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E el)
    {
        if(isEmpty())
        {
            head = new Node(el, null, null);
            tail = head;
        }
        else
        {
            var newNode = new Node(el, head, head.getNext());
            head.setPrev(newNode);
            head = newNode;
        }

        size ++;
    }

    public void addLast(E el)
    {
        if(isEmpty())
        {
            tail = new Node(el, null, null);
            head = tail;
        }
        else
        {
            var newNode = new Node(el, tail, null);
            tail.setNext(newNode);
            tail = newNode;
        }

        size ++;
    }

    public E removeFirst()
    {
        if(isEmpty())
            return null;
        var answer = head.getElement();
        head.getNext().setPrev(null);
        head = head.getNext();
        size --;
        return answer;
    }

    public E removeLast()
    {
        if(isEmpty())
            return null;
        var answer = tail.getElement();
        tail.getprev().setNext(null);
        tail = tail.getprev();
        size --;

        return answer;
    }

    public void print()
    {
        var node = head;
        while(node != null)
        {
            System.out.print(node.getElement() + " ");
            node = node.getNext();

        }
        System.out.println();
    }
}
