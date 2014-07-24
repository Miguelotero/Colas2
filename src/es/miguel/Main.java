package es.miguel;

public class Main {
    public static void main(String[] args) {

        Fifo f = new Fifo();
        f.push(1);
        f.push(3);
        System.out.println(f.pop().toString());
        System.out.println(f.pop().toString());
        Lifo l = new Lifo();
        l.push(1);
        l.push(3);
        System.out.println(l.pop().toString());
        System.out.println(l.pop().toString());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
