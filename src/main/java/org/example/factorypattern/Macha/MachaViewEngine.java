package org.example.factorypattern;

import java.util.Map;

public class MachaViewEngine {
    public String render(String viewName, Map<String, Object> context){
        return "View rendered by Matcha";
    }

}
