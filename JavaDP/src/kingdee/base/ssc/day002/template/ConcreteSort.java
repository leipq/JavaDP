package kingdee.base.ssc.day002.template;

public class ConcreteSort extends AbstractShowSort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
