public class SinglyLinkedList<E> {
    private static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E _element, Node<E> _next)
        {
            element = _element;
            next = _next;
        }

        public E getElement() { return element;}
        public void setElement(E e)
        {
            element = e;
        }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> _next) {next = _next; }
    }



    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    public SinglyLinkedList() {}

    public boolean isEmpty() {return  size ==0;}
    public int size() {return size;}

    public void print()
    {
        var e = head;
        while(e != null)
        {
            System.out.print(e.getElement()+ " ");
            e = e.getNext();
        }
        System.out.println();
    }

    public E first() {return head.getElement();}
    public E last() { return tail.getElement();}

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



    //MERGE SORT

    public void MergeSort()
    {
        head = MergeSort(head);
    }

    public Node MergeSort(Node head)
    {

        if(head == null || head.getNext() == null)
        {
            return head;
        }

        var middle = getMiddle(head);
        var nextOfMidle = middle.getNext();

        middle.setNext(null);

        Node<Integer> left = MergeSort(head);

        Node<Integer> right = MergeSort(nextOfMidle);

        SinglyLinkedList.Node<Integer> sortedHead = SortedMerge(left, right);
        return  sortedHead;

    }
    public static Node SortedMerge(Node<Integer> left, Node<Integer> right)
    {
        Node<Integer> result = null;

        if(left == null)
            return right;
        if(right == null)
            return left;

        if(left.getElement() <= right.getElement())
        {
            result = left;
            result.setNext(SortedMerge(left.getNext(), right));
        }
        else
        {
            result = right;
            result.setNext(SortedMerge(left, right.getNext()));
        }

        return result;
    }


    public static Node getMiddle(Node head)
    {
        if(head == null)
            return head;

        Node slow = head, fast = head;

        while(fast.getNext() != null && fast.getNext().getNext() != null)
        {
            slow  = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }

    //END: MERGE SORT

    // QUICK SORT

    public void QuickSort()
    {
        QuickSort(head, tail);
    }

    public void QuickSort(Node start, Node end)
    {
        if(start == null || start == end || start == end.getNext())
            return;

        Node pivot_prev = partitionLast(start, end);

        QuickSort(start, pivot_prev);

        if(pivot_prev != null && pivot_prev == start)
            QuickSort(pivot_prev.getNext(), end);

        else if( pivot_prev != null && pivot_prev.getNext() != null)
            QuickSort(pivot_prev.getNext().getNext(), end);

    }

    public Node partitionLast(Node<Integer> start, Node<Integer> end)
    {

        if(start == end || start == null || end == null)
            return start;

        Node<Integer> pivot_prev = start;
        Node<Integer> curr = start;
        int pivot = end.getElement();

        while(start != end)
        {
            if(start.getElement() < pivot)
            {
                pivot_prev = curr;
                int temp = curr.getElement();
                curr.setElement(start.getElement());
                start.setElement(temp);
                curr = curr.getNext();
            }
            start = start.getNext();
        }

        int temp = curr.getElement();
        curr.setElement(pivot);
        end.setElement(temp);

        return pivot_prev;
    }
    // END: QUICK SORT
}
