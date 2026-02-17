// import java.util.*;
// public class binarysearcharr {
//     public static int firstoccurence(int arr[],int size , int key){
//         int ans=-1;
//         int s=0;
//         int e= size-1;
//         int mid = s+(e-s)/2;
//         while(s<=e){
//             if(arr[mid]==key){
//                 ans=mid;
//                 e=mid-1;

//             }
//             else if(key<arr[mid]){
//                 e=mid-1;
//             }
//             else{
//                 s=mid+1;
//             }
//             mid=s+(e-s)/2;
            
//         }
//         return ans;


        
        
//     }
//     public static int lastoccurence(int arr[],int size , int key){
//         int s=0;
//         int e= size-1;
//         int ans=-1;
//         int mid = s+(e-s)/2;
//         while(s<=e){
//             if(arr[mid]==key){
//                 ans=mid;
//                 s=mid+1;

//             }
//             else if(key<arr[mid]){
//                 e=mid-1;
//             }
//             else{
//                 s=mid+1;
//             }
//             mid=s+(e-s)/2;
            
//         }
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         Scanner scn= new Scanner(System.in);
//         int n= scn.nextInt();
//         int arr[]= new int[n];
//         for(int i=0; i<=arr.length; i++){
//             arr[i]=scn.nextInt();
//         }
//         int d = firstoccurence(arr[], size, key);
//         System.out.println(d);
//         int h = lastoccurence(arr[], size, key);
//         System.err.println(h);
//     }
// }
