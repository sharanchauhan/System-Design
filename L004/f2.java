import java.io.*;
import java.util.*;

// probelm in this code
class f2 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    Car[] cars = new Car[5];
    cars[0] = new Car(200, 100, "A");
    cars[1] = new Car(300, 500, "B");
    cars[2] = new Car(100, 200, "C");
    cars[3] = new Car(20, 1000, "D");
    cars[4] = new Car(2000, 10, "E");

    ArrayList<Car> l1 = new ArrayList<>();
    ArrayList<Car> l2 = new ArrayList<>();
    ArrayList<Car> l3 = new ArrayList<>();
    for(Car car: cars){
      l1.add(car);
      l2.add(car);
      l3.add(car);
    }

    Collections.sort(l1);
    System.out.println(l1);

    Collections.sort(l2, new CarSpeedComparator());
    System.out.println(l2);

    Collections.sort(l3, Collections.reverseOrder(new CarSpeedComparator()));
    System.out.println(l3);
  }

  static class Car implements Comparable<Car> {
    int speed;
    int price;
    String name;

    Car(int speed, int price, String name){
      this.speed = speed;
      this.price = price;
      this.name = name;
    }

    public String toString(){
      return "[" + this.speed + ", " + this.price + ", " + this.name + "]";
    }

    // this.speed > other.speed => +ve
    // this.speed == other.speed => 0
    // this.speed < other.speed => -ve
    // regular implementations is this.p - other.p => small value of p is smaller object

    public int compareTo(Car other){
      return other.price - this.price;
    }
  }

  static class CarSpeedComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2){
      return c1.speed - c2.speed;
    }
  }
}