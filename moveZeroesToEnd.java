public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,1,2};
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]);;
            
        }
    }
    
}
