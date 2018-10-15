import org.junit.Test;

import static org.junit.Assert.*;

public class BucketSortTest {
    @Test
    public void test_1(){
        BucketSort bucketSort = new BucketSort();
        int maxVal=5;
        int [] data= {5,3,0,2,4,1,0,5,2,3,1,4};

        bucketSort.sort(data, maxVal);
        int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        assertArrayEquals(expected, data);
    }

    @Test
    public void test_2(){
        BucketSort bucketSort = new BucketSort();
        int maxVal=11;
        int [] data= {10,2,1,5,4,3,11,9,7,8,6,0};

        bucketSort.sort(data, maxVal);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        assertArrayEquals(expected, data);
    }

    @Test
    public void test_3(){
        BucketSort bucketSort = new BucketSort();
        int maxVal = 5;
        int[] data = {};

        bucketSort.sort(data, maxVal);
        int[] expected = {};
        assertArrayEquals(expected, data);
    }

    @Test
    public void test_4(){
        BucketSort bucketSort = new BucketSort();
        int maxVal = -1;
        int[] data = {2, 3, 1, 3, 2, 5};

        bucketSort.sort(data, maxVal);
        int[] expected = {2, 3, 1, 3, 2, 5};
        assertArrayEquals(expected, data);
    }
}