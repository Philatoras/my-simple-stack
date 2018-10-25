package deqo.lcle.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {
    //Attributs
    private ArrayList<Item> pile;
    private int size;

    public MySimpleStack(){
        pile = new ArrayList<>();
        size = 0;
    }
    @Override
    public boolean isEmpty(){
        return pile.isEmpty();
    }
    @Override
    public int getSize(){
        return pile.size();
    }
    @Override
    public void push(Item item){
        size++;
        pile.add(0, item);
    }
    @Override
    public Item peek() throws EmptyStackException{
        if(size <= 0){
            throw new EmptyStackException();
        }
        return pile.get(0);
    }
    @Override
    public Item pop() throws EmptyStackException{
        if(size <= 0){
            throw new EmptyStackException();
        }
        size --;
        return pile.remove(0);
    }
}
