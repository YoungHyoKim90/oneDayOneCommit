//package M2024_02;
//
//import java.util.ArrayList;
//import java.util.List;
//
////public class Subject {
////    private List<Observer> observers = new ArrayList<>();
////    private int state;
////
////    public int getState() {
////        return state;
////    }
////
////    public void setState(int state) {
////        this.state = state;
////        notifyAllObservers();
////    }
////
////    public void attach(Observer observer) {
////        observers.add(observer);
////    }
////
////    public void notifyAllObservers() {
////        for (Observer observer : observers) {
////            observer.update();
////        }
////    }
////}
//
//public abstract class Observer {
//    protected Subject subject;
//    public abstract void update();
//}
//
//public class BinaryObserver extends Observer {
//    public BinaryObserver(Subject subject){
//        this.subject = subject;
//        this.subject.attach(this);
//    }
//
//    @Override
//    public void update() {
//        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
//    }
//}
//
//public class ObserverPatternExample {
//    public static void main(String[] args) {
//        Subject subject = new Subject();
//        new BinaryObserver(subject);
//
//        subject.setState(15);
//    }
//}
