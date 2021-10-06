public class exercise {

    public static void Helper(int i)
    {
        for(int j = i; j > 0; j = j/2 )
        {
            System.out.println("aaa");
        }
    }

    public static void main(String[] args)
    {
        for(int i = 1; i < 10; i =i*2)
        {
            System.out.println("aaa");
            //Helper(i);
        }
    }
}
