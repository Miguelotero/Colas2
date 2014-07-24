package es.miguel;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;

/**
 * Created by ada on 24/07/14.
 */
public interface Cola {
    ArrayList stack = new ArrayList();

    public void push(Object a);

    public Object pop();

    public Object peek();

    public void sort(String a);

    public void sort(Integer a);

    public void sort(Boolean a);
}


//~ Formatted by Jindent --- http://www.jindent.com
