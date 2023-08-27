package org.example.factorypattern;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        var engine = new MachaViewEngine();

        System.out.println(engine.render(viewName, context));
    }
}
