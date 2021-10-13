public class DoublyLinkedList<E> {
    private static class Node<E>
    {
        private E element;
        private Node<E> next;
        private Node<E> prev;
        public Node(E e, Node<E> n, Node<E> p)
        {
            element = e;
            next = n;
            prev = p;
        }

        public E getElement(){ return element;}
        public Node<E> getNext() {return next;}
        public Node<E> getPrev() {return  prev;}
        public void setPrev(Node<E> e) {prev = e;}
        public void setNext(Node<E> e) {next = e;}
    }

    private int size = 0;
    private Node<E> header;
    private Node<E> tailer;

    public DoublyLinkedList()
    {
        header = new Node(null, null, null);
        tailer = new Node(null, null, header);
        header.setNext(tailer);
    }

    public int size() { return size; }
    public boolean isEmpty() {return size == 0; }

    public E first() {
        if(isEmpty())
            return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tailer.getPrev().getElement();
    }

    public void addFirst(E el)
    {
        addBetween(el, header, header.getNext());
    }


    public void addBetween(E e, Node<E> prev, Node<E> next)
    {
        var newNode = new Node(e, next, prev);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size ++;
    }
    public void addLast(E el)
    {
        addBetween(el, tailer.getPrev(), tailer);
    }


    public E remove(Node<E> node)
    {
        Node<E> prev = node.getPrev();
        Node<E> next = node.getNext();

        prev.setNext(next);
        next.setPrev(prev);
        size -- ;
        return node.getElement();
    }
    public E removeFirst()
    {
        if(isEmpty())
            return null;

        return remove(header.getNext());
    }

    public E removeLast()
    {
        if(isEmpty())
            return null;

        return remove(tailer.getPrev());
    }
}
