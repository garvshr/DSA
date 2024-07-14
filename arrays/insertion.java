public class insertion {
    public static void main(String args[])
    {
        int arr[] = {91,76,34,56,12,78,98};
        int current,j,i;
        for(i = 0 ; i < arr.length ; i++)
        {
            current = arr[i];
            j = i - 1;
            while(j >= 0 && current < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for(i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
