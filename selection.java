public class selection {
    public static void main(String args[])
    {
        int arr[]={7,1,89,45,12};
        int i,smallest,temp,j;
        for(i = 0 ; i < arr.length -1 ; i++)
        {
            smallest = i;
            for(j = i+1 ; j < arr.length ; j++)
            {
                if(arr[smallest] > arr[j])
                    smallest = j;   
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
}
