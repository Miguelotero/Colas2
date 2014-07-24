package es.miguel;

//~--- JDK imports ------------------------------------------------------------

import java.util.Collections;

/**
 * Created by ada on 24/07/14.
 */
public class Lifo implements Cola {
    @Override
    public void push(Object a) {
        this.stack.add(a);
    }

    @Override
    public Object pop() {
        Object temp = this.stack.get(this.stack.size() - 1);

        this.stack.remove(this.stack.size() - 1);

        return temp;
    }

    @Override
    public Object peek() {
        Object temp = this.stack.get(this.stack.size() - 1);

        return temp;
    }

    @Override
    public void sort(String a) {
        try {
            if (a.equals("a")) {
                Collections.sort(this.stack);
            } else if (a.equals("d")) {
                Collections.sort(this.stack);
                Collections.reverse(this.stack);
            }
        } catch (Exception e) {
            System.out.println("Se ordena con a o d");
        }
    }

    @Override
    public void sort(Integer a) {
        try {
            if (a.equals("0")) {
                Collections.sort(this.stack);
            } else if (a.equals("1")) {
                Collections.sort(this.stack);
                Collections.reverse(this.stack);
            }
        } catch (Exception e) {
            System.out.println("Se ordena con 0 o 1");
        }
    }

    @Override
    public void sort(Boolean a) {
        try {
            if (a.equals(true)) {
                Collections.sort(this.stack);
            } else if (a.equals(false)) {
                Collections.sort(this.stack);
                Collections.reverse(this.stack);
            }
        } catch (Exception e) {
            System.out.println("Se ordena con true o false");
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
