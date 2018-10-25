package deqo.lcle.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import  static  org.junit.Assert .*;
public class MySimpleStackTest {

    @Before
    public void setup(){
        /*SimpleStack s0 = new MySimpleStack();
        SimpleStack s1 = new MySimpleStack();
        SimpleStack s2 = new MySimpleStack();*/
    }

    @Test
    public void testCreateEmpty() {
        SimpleStack s0 = new MySimpleStack();
        assertTrue("A new stack should be empty",s0.isEmpty());
        assertEquals("A new stack had no element",0,s0.getSize());

    }

    @Test
    public void testPush(){
        SimpleStack s0 = new MySimpleStack();
        Item  item = new  Item ();
        // Code  under  test
        s0.push(item);
        //  assertions (oracle)
        assertFalse("The  stack  must be not  empty", s0.isEmpty ());
        assertEquals("The  stack  shoult  contain 1 item", 1, s0.getSize ());
        assertSame("Pushed  itm  should  be on top of  stack", item,s0.peek ());
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekEmpty() throws EmptyStackException {
        //  Setup  the "state of the  world"
        SimpleStack s0 = new  MySimpleStack ();
        // Code  under  test

        s0.peek();
        //  should  throws  an  EmptyStackException.
    }

    @Test (expected = EmptyStackException.class)
    public void testPopEmpty() throws EmptyStackException {
        //  Setup  the "state of the  world"
        SimpleStack s0 = new  MySimpleStack ();
        // Code  under  test
        s0.pop();
        //  should  throws  an  EmptyStackException.

    }

    @Test
    public void testPushPop(){
        SimpleStack s0 = new MySimpleStack();
        Item  item = new  Item ();
        Item item2;
        // Code  under  test
        s0.push(item);
        s0.pop();
        //  assertions (oracle)
        assertTrue("The  stack  must be empty", s0.isEmpty ());
    }

}