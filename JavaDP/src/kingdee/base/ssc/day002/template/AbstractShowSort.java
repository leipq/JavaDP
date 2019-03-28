package kingdee.base.ssc.day002.template;

public abstract class AbstractShowSort {
    public abstract void sort(int[] arr);
    public final void show(int[] arr){
        this.sort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
