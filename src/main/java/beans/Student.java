package beans;

import beans.tools.Compa;
import beans.tools.Ruler;

public class Student {
    private Compa compa;
    private Ruler ruler;

    public void setCompa(Compa compa) {
        this.compa = compa;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    public void drawCircle()
    {
        compa.drawCircle();
    }
    public void drawSquare()
    {
        ruler.drawSquare();
    }
    public void drawRectangle()
    {
        ruler.drawRectangle();
    }

}
