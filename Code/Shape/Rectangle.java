public class Rectangle extends Shape {

    private int length;
    private int height;

    Rectangle(String symbol, int lineNumber, int l, int h) {
        super(symbol, lineNumber);
        this.length = l;
        this.height = h;
    }

    protected void _displayHelper()
    {
        for(int i=0;i<this.length;i++)
            System.out.print(this.getSymbol());
        System.out.println();
        int h=1;
        while (h<height-1)
        {
            for(int i =0 ; i< length; i++)
               if(i==0 || i==length-1)
                  System.out.print(this.getSymbol());
               else
                  for(int l=0;l<this.getSymbol().length();l++)
                     System.out.print(" ");

            System.out.println();
            h++;
        }
        for(int i=0;i<length;i++)
           System.out.print(this.getSymbol());
        System.out.println();
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Rectangle r = (Rectangle)o;
        return this.length == r.length && this.height == r.height;
    }
    
}
