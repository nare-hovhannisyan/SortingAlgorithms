public class problem4 {


    public static void Arrange(ArrayQueue<Student> queue)
    {
        if(queue.isEmpty())
            return;

        var el = queue.dequeue();
        System.out.println(el.getFullName() + " asks question ");
        if(el.getQuestionsCount() != 0)
        {
            el.setQuestionsCount(el.getQuestionsCount()-1);
            queue.enqueue(el);
        }

        Arrange(queue);
    }

    public static void Main(String[] args)
    {
        var studentsList = new Student[2];

        var first = new Student("John", "Esiminch", 3);
        var second = new Student("Poghos", "Poghosyan", 2);
        studentsList[0] = first;
        studentsList[1] = second;

        ArrayQueue<Student> list = new ArrayQueue<>(5);


        list.enqueue(first);
        list.enqueue(second);

        Arrange(list);

    }

}


