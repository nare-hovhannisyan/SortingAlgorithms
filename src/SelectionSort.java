public class SelectionSort {


    //first time scans throguh n elements to find the minimum, then in the next round scans throguh n-1 elements
    // and so on so
    // (n-1) + (n-2) + ... + 1
    public static void SelectionSortAlg(int[] data)
    {
        int n = data.length;
        for(int i = 0; i < n-1; i++)
        {
            int min = i;

            for(int j = i+1; j < n; j++)
            {
                if(data[j]<data[min])
                {
                    min = j;
                }
            }

            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }


    public static void main(String[] args)
    {
        int[] data = {9, 6,3,2,4};

        SelectionSortAlg(data);
        System.out.println("aaaaaa");

        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }

    }
}
