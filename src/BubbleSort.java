public class BubbleSort {


    public static void BubbleSort(int[] data)
    {
        int n = data.length;

        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < n-i; j++)
            {
                if(data[j-1] > data[j])
                {
                    int temp = data[j-1];
                    data[j-1]  = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] data = {9, 6,3,2,4};

        BubbleSort(data);
        System.out.println("aaaaaa");

        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }

    }
}
