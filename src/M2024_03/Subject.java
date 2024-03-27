package M2024_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(null, observer);
        }
    }
}

/*
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}

*/

/*
public interface Shape {
void draw();
}

public class Rectangle implements Shape {
@Override
public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
}
}

public class Circle implements Shape {
@Override
public void draw() {
    System.out.println("Inside Circle::draw() method.");
}
}

public abstract class ShapeFactory {
public abstract Shape createShape();
}

public class RectangleFactory extends ShapeFactory {
@Override
public Shape createShape() {
    return new Rectangle();
}
}

public class CircleFactory extends ShapeFactory {
@Override
public Shape createShape() {
    return new Circle();
}
}
*/

/*
public class Singleton {
private static Singleton instance;

private Singleton() {}

public static Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
}
}
*/