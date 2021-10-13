public class ArrayQueue<E> implements IQueque<E> {
    public static final int CAPACITY = 100;
    private E[] data;
    private int f = 0;
    private int size = 0;


    public ArrayQueue()
    {
        this(CAPACITY);
    }
    public ArrayQueue(int capacity)
    {
        data = (E[])new Object[capacity];
    }

    public int size() { return  size;}
    public boolean isEmpty() { return size == 0;}

    public void enqueue(E el) throws IllegalStateException
    {
        if(size == data.length) throw new IllegalStateException("queue overflow");
        int n = (f+size) % data.length;
        data[n] = el;
        size ++;
    }

    public E first()
    {
        if(isEmpty()) {return null; }
        return data[f];
    }

    public E dequeue()
    {
        if(isEmpty()) {return null; }
        E answer = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        size --;
        return answer;
    }
}
