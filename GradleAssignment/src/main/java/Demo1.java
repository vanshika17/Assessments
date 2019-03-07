import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    private List list = Arrays.asList("hello!", "How", "aRe", "yoU");

    void convertToCapital() {
        System.out.println("Using StringUtils class ...");
        System.out.println("List before swapCase: " + list.toString());
        System.out.println("List after swapCase: " + StringUtils.swapCase(list.toString()));
    }
    public static void main(String[] args) {
        System.out.println("Hello gradle");
        Demo2 demo2=new Demo2();
        demo2.display();
        Demo1 demo1=new Demo1();
        demo1.convertToCapital();


    }
}
