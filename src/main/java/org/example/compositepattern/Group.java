package org.example.composite.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    List<Component> components = new ArrayList<>();


    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }
    @Override
    public void render(){
        for (var component : components){
            component.render();
        }
    }
}
