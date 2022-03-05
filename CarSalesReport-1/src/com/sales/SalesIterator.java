package com.sales;

import java.util.ArrayList;
import java.util.Iterator;

public class SalesIterator 
{
    ArrayList list;
  
    int pos = 0;
  
    public  SalesIterator (ArrayList list)
    {
        this.list = list;
    }
  
    public Object next()
    {
    	String st = (String) list.get(pos);
        pos += 1;
        return st;
    }
  
    public boolean hasNext()
    {
        if (pos >= list.size() ||
        		list.get(pos) == null)
            return false;
        else
            return true;
    }
}