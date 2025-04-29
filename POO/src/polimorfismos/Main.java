package polimorfismos;

public class Main {
    public static void main(String[] args) {
        C o = new D ();
        o.p (o);
        ((D)(o)).p(o);
        o.p ((D)(o));
        ((D)(o)).p((D)(o));
    }
}
