//min to max at codechef

public class Question1 {
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        int count=0;
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
            
        }  
        for (int j = 0; j < a.length; j++) {
            if(min<a[j]){
                count++;
            }
        }
        System.out.print(count);
    }

    
}
