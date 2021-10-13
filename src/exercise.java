public class exercise {

    public static void main(String[] args)
    {
        ArrayDequeue<Integer> arrayDeq = new ArrayDequeue<>();

        arrayDeq.addFirst(9);
        arrayDeq.addFirst(7);
        arrayDeq.addLast(1);
        arrayDeq.removeFirst();
        arrayDeq.removeLast();
        arrayDeq.print();
    }
}
