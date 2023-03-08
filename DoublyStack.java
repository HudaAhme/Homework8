/**
 * Created by DELL on 08/03/2023.
 */
public class DoublyStack<E> extends Stack<E> {

    DoublyLinkedList<E>list=new DoublyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(E e) {
        list.addLast(e);
    }

    @Override
    public E pop() {
        return list.removeLast();
    }
}
