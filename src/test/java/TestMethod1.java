import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMethod1 {

    MyClass myClass;

    @Before
    public void prepare () {
        myClass = new MyClass();
    }
    @Test
    public void test1Method1(){
        int [] arr1  = {1,2,3,4,5,6};
        int[] arr2 = {5,6};
        Assert.assertArrayEquals(arr2, myClass.method1(arr1));
    }
    @Test(expected = RuntimeException.class)
    public void test2Mthod1(){
        int [] arr1  = {1,2,3,5,6};
        myClass.method1(arr1);
    }
    @Test
    public void test3Method1(){
        int [] arr1  = {1,4,3,4,5,4};
        int[] arr2 = {};
        Assert.assertArrayEquals(arr2, myClass.method1(arr1));
    }
    @Test
    public void test4Mthod1(){
        int [] arr1  = {1,4,3,4,5,6};
        int[] arr2 = {5,6};
        Assert.assertArrayEquals(arr2, myClass.method1(arr1));
    }
    @Test
    public void test1Method2() {
        int[] arr1 = {1, 1, 4, 4, 1, 1};
        Assert.assertTrue(myClass.metod2(arr1));
    }
    @Test
    public void test2Method2() {
        int[] arr1 = {1, 1, 1, 1};
        Assert.assertTrue(!myClass.metod2(arr1));
    }
    @Test
    public void test3Method2() {
        int[] arr1 = {4, 4, 4, 4};
        Assert.assertTrue(!myClass.metod2(arr1));
    }
    @Test
    public void test4Method2() {
        int[] arr1 = {1, 2, 4, 4};
        Assert.assertTrue(!myClass.metod2(arr1));
    }
}
