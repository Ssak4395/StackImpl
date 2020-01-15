package com.company;

import javax.print.attribute.standard.JobKOctets;
import java.util.LinkedList;

public class StackImpl implements Stack {

    LinkedList<Object> linkedList = new LinkedList<>();


    @Override
    public Object push(Object object) {
        linkedList.add(object);

        return object;
    }

    @Override
    public void pop()  {
        linkedList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        if(linkedList == null)
        {
            return  true;
        }

        else
            return  false;
    }

    @Override
    public int search(Object O) {
      return linkedList.indexOf(O);
    }

    @Override
    public Object peek() {
        return this.linkedList.get(0);
    }

    public LinkedList show()
    {
        return this.linkedList;
    }
}
