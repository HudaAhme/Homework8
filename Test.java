/**
 * Created by DELL on 08/03/2023.
 */
public class Test {
    public static void main(String[] args) {

        ArrayStack<Integer>s= new ArrayStack<>(2);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(10);
        s.push(20);
    }
}
