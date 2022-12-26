package beans;

import beans.tools.Compa;
import beans.tools.Ruler;
import beans.tools.Tools;
import beans.tools.ToolsList;

public class Student {
    private ToolsList toolsList;

    public void setToolsList(ToolsList toolsList) {
        this.toolsList = toolsList;
    }
    public void drawCircle()
    {
        Compa compa = (Compa) toolsList.getToolsMap().get("Compa");
        compa.drawCircle();
    }
    public void drawSquare()
    {
        Ruler ruler = (Ruler) toolsList.getToolsMap().get("Ruler");
        ruler.drawSquare();
    }
    public void drawRectangle()
    {
        Ruler ruler = (Ruler) toolsList.getToolsMap().get("Ruler");
        ruler.drawRectangle();
    }

}
