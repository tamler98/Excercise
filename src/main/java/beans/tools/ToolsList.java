package beans.tools;

import java.util.HashMap;
import java.util.Map;

public class ToolsList{
    Map<String, Tools> toolsMap = new HashMap<>();
    {
        Tools compa = new Compa();
        Tools ruler = new Ruler();

        toolsMap.put("Compa", compa);
        toolsMap.put("Ruler", ruler);
    }

    public Map<String, Tools> getToolsMap() {
        return toolsMap;
    }
}
