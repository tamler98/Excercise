package beans.tools;

public class Compa implements Tools{
    private String name = "Compa";

    public void drawCircle()
    {
        System.out.println("Use: "+name);
        System.out.println("Draw circle successfully");
    }
}
