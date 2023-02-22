import java.awt.*;
import java.util.Collection;
public class test {
    private Object[]objects=new Object[100];
    public Object get(int i){
        return objects[i];
    }
    public void add(Object o){
        for (int i = 0; i < objects.length; i++) {
            if(objects[i]==null){
                objects[i]=o;
                break;
            }
        }
    }
    public static void main(String[]args){
        test t=new test();
        t.add("a");
        t.add(123);
        System.out.println(t.get(0));
        System.out.println(t.get(1));
        List list=new List();
        
    }
}
