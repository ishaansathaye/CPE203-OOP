public class Triangle extends Shape {

    private int a;

    Triangle(String symbol, int lineNumber, int a) {
        super(symbol, lineNumber);
        this.a = a;
    }

    protected void _displayHelper() {
        for(int i=1; i<=a; i++)
        {
            for(int j=0; j<a-i; j++)
                System.out.print(" ");
            for(int j=0; j<(2*i-1); j++)
                System.out.print(this.getSymbol());
            System.out.println();
        }
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Triangle t = (Triangle)o;
        return this.a == t.a;
    }
    
}
