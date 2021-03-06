public class BucketSort {
    public static void sort(int[] a, int maxVal) {
        if(maxVal < 0) return;

        if(a == null || a.length <= 1) return;

        int [] bucket=new int[maxVal+1];
        bucket = new int[maxVal + 1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        int outPos2=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }
}
