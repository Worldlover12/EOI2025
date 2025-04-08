package ComposiciónAsociación;

public class LineSub extends Punto{
    private Punto end;
    public LineSub(int p1, int p2, Punto end) {
        super(p1, p2);
        this.end = end;
    }
}
