public class binarysearch 
{
    static boolean binary(int arr[], int target)
    {
        int n = arr.length;
        int left = 0, right =n - 1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid -1; 
        }
        return false;
    }    

    static boolean binaryRec(int arr[], int left, int right, int target)
    {
        if(left > right)
            return false;
        int mid = (left + right)/2;
        if(arr[mid] == target)
            return true;
        else if(arr[mid] > target)
            return binaryRec(arr, left, mid-1, target);
        else
            return binaryRec(arr, mid + 1, right, target);
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        boolean bl = binary(arr, 5);
        System.out.println(bl);
    }
}
