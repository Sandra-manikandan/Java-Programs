public class Duplicate {
    void duplicateElement(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == -1)
                    continue;
                if(arr[i]==arr[j])
                {
                        System.out.print("\nDuplicate Element Found:"+arr[i]);
                        arr[j]=-1;
                }
            }
        }
    }
}
