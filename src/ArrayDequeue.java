public class ArrayDequeue<E> implements IDequeue<E> {

    public static final int CAPACITY = 5;
    private E[] data;
    private int f = -1;
    private int rear = 0;
    private int size = 0;

    public ArrayDequeue()
    {
        this(CAPACITY);
    }
    public ArrayDequeue(int capacity)
    {
        data = (E[])new Object[capacity];
    }

    public void print()
    {
        if(!isEmpty())
        {
            int i = f;
            if(f == rear)
            {
                System.out.print(" "+data[f]);
            }
            else
            {
                do {
                    System.out.print(" " + data[i]);
                    i = ++i % data.length;}
                while (i != rear);
                System.out.print(" "+data[rear]);
            }

        }
    }


    public int size() {return size;}
    public boolean isEmpty() {return size == 0; }

    public E first() {
        if(isEmpty()) return null;
        return data[f];
    }

    public E last() {
        if(isEmpty()) return null;
        return data[rear];
    }

    public void addFirst(E el) throws IllegalStateException
    {
        if(size == data.length) throw new IllegalStateException("dequeue overflow");

        //if queue is empty
        if(f == -1)
        {
            f = 0;
            rear = 0;
        }
        else if(f == 0)
            f = data.length-1;
        else
            f = f -1;

        data[f] = el;
        size ++;
    }

    public void addLast(E e) throws IllegalStateException
    {
        if(size() == data.length) throw new IllegalStateException();

        if(f == -1)
        {
            f = 0;
            rear = 0;
        }
        if(rear == data.length-1)
            rear = 0;

        else
            rear = rear + 1;

        data[rear] = e;
        size ++;
    }

    public E removeFirst()
    {

        if (isEmpty()) return null;

        var el = data[f];
        data[f] = null;

        if(f == rear)
        {
            f = -1;
            rear = -1;
        }
        else
        {
            if(f == data.length-1)
                f = 0;
            else
                f = f +1 ;
        }
        size--;
        return el;
    }

    public E removeLast()
    {
        if(isEmpty()) return null;

        var el = data[rear];
        data[rear] = null;

        if(f == rear)
        {
            f = -1;
            rear = -1;
        }
        else
        {
            if(rear == 0)
                rear = data.length -1;
            else
                rear = rear -1;
        }
        size--;
        return el;
    }
}
