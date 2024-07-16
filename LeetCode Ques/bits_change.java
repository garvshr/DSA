class bits_java 
{
    public static void main(String args[])
    {
        int n = 5;
        int arr[] = new int[15];
        int x=0;
        while(n!=0)
        {
           arr[x] = n%2;
            n/=2;
            d++;
        }

        // for(int i=0; i < arr.length; i++)
        // {
        //     if(arr[i] == 1)
        //         arr[i] = 0;
        //     if(arr[i] == 0)
        //         arr[i] = 1;
        // }
        int s=0;
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}