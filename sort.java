import java.util.*;
public class sort
{
    public static void main(String args[])
    {
        int[] array1={100,111,556,345,789,205,11,456};
        String[] array2={"java","python","PHP","C","C++","C#"};
        System.out.println("Original numeric array:"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array:"+Arrays.toString(array1));
        System.out.println("Original string array:"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array:"+Arrays.toString(array2));
    }
}
