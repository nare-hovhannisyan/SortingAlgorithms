public class InsertionSort {

    public static void InsertionSortAlg(int[] data)
    {
        int n = data.length;
        for(int i = 1; i < n; i++)
        {
            int cur = data[i];
            int j = i;

            while(j > 0 && data[j-1] > cur)
            {
                data[j] = data[j-1];
                j--;
            }

            data[j] = cur;
        }
    }

    public static void main(String[] args)
    {
        int[] data = {9, 6,3,2,4};

        InsertionSortAlg(data);


        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }
}
