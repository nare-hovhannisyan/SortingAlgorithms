public class exercise {

    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addLast(5);
        list.addLast(2);
        list.addLast(11);
        list.addLast(19);
        list.addLast(6);
        list.addLast(4);
        list.addLast(1);

        //var result = list.first();
        var result = MergeSortSinglyLinkedList.MergeSort(list.first());

        System.out.println(result);
        while(result != null)
        {
            System.out.println(result.getElement());
            result = result.getNext();
        }

    }
}
