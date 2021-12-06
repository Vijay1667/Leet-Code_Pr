class Solution {
    int remove_duplicate(int a[],int n){
        // code here
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<n-1;i++) {
            if(a[i]==a[i+1]) {
                continue;
            }
            temp[k]=a[i];
            k++;
        }
        temp[k]=a[n-1];
        k++;
        for(int i=0;i<k;i++) {
            a[i]=temp[i];
        }
        
        return k;
    }
}
