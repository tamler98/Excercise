package beans.tools;

public class Ruler implements Tools {
    private String name = "Ruler";

    public void drawSquare()
    {
        System.out.println("Use: "+name);
        System.out.println("Draw square successfully");
    }

    public void drawRectangle()
    {
        System.out.println("Use: "+name);
        System.out.println("Draw rectangle successfully");
    }
}
