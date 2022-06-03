
import java.util.Arrays;
/*
Class for simple character graphics figures to send to the screen.
 */
public abstract class Shape {
    // If you move the variables to other classes, do not change 
    // their name!

    private String symbol;
    private int lineNumber;

    public Shape(String symbol, int lineNumber) {
        this.symbol=symbol;
        this.lineNumber = lineNumber;
    }

    protected String getSymbol() {
        return this.symbol;
    }

    protected abstract void _displayHelper();

    protected void display() {

        _displayHelper();

        int count;
        for(count =0; count<lineNumber;count++)
            System.out.println();

    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;

        Shape s = (Shape)o;
        boolean result = true;

        if (symbol == null)
            result = s.getSymbol() == null;
        else
            result = symbol.equals(s.getSymbol());

        return result && lineNumber == s.lineNumber;
    } 

}
