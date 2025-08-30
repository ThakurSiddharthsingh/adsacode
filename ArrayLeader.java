public class ArrayLeader {
    public static void main(String[] args) {
        int[]arr={17,18,5,4,6,1};
        int index=0;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]>max){
                max=arr[i];
            }
            arr[index]=max;
            index++;
            
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]);
            
        }
    }
    
}
