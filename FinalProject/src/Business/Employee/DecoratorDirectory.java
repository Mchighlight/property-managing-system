/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DecoratorDirectory {

    private ArrayList<Decorator> decoratorList;

    public DecoratorDirectory() {
        decoratorList = new ArrayList();
    }

    public ArrayList<Decorator> getDecoratorList() {
        return decoratorList;
    }

    public Decorator createDecorator(String name, String email) {
        Decorator decorator = new Decorator();
        decorator.setName(name);
        decorator.setEmail(email);
        decoratorList.add(decorator);
        return decorator;
    }
}
