public class MergeSortSinglyLinkedList {

    public static SinglyLinkedList.Node MergeSort(SinglyLinkedList.Node<Integer> head)
    {

        if(head == null || head.getNext() == null)
        {
            return head;
        }

        var middle = getMiddle(head);
        var nextOfMidle = middle.getNext();

        middle.setNext(null);

        SinglyLinkedList.Node<Integer> left = MergeSort(head);

        SinglyLinkedList.Node<Integer> right = MergeSort(nextOfMidle);

        SinglyLinkedList.Node<Integer> sortedHead = SortedMerge(left, right);
        return  sortedHead;

    }

    public static SinglyLinkedList.Node SortedMerge(SinglyLinkedList.Node<Integer> left, SinglyLinkedList.Node<Integer> right)
    {
        SinglyLinkedList.Node<Integer> result = null;

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


    public static SinglyLinkedList.Node getMiddle(SinglyLinkedList.Node head)
    {
        if(head == null)
            return head;

        SinglyLinkedList.Node slow = head, fast = head;

        while(fast.getNext() != null && fast.getNext().getNext() != null)
        {
            slow  = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }
}
