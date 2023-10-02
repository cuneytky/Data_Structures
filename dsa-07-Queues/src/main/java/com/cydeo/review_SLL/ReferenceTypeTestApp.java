package com.cydeo.review_SLL;

public class ReferenceTypeTestApp {
    public static void main(String[] args) {

        System.out.println("--------- class type ---------------");
      //  Car car = new Car("Audi","A4");
      //  System.out.println(car);  //com.cydeo.review_SLL.Car@340f438e

        System.out.println("------------------------");

        System.out.println(new Car("Audi","A4"));  //com.cydeo.review_SLL.Car@30c7da1e (yukarısı yorum satırı değilken)
           // yukarıdaki car objectini yorum satırı haline getirince, burada aynı çıktıyı aldım: com.cydeo.review_SLL.Car@340f438e

        System.out.println("--------- array type ---------------");

        int[] arr = new int[5];
        System.out.println(arr);

        System.out.println("--------- Java heap ---------------");

        Person person1= new Person("Michael",new Car("Audi","A4"));
        System.out.println(person1); // com.cydeo.review_SLL.Person@57829d67

        System.out.println("--------- person classına Person next ekledik:  ---------------");

        Person person2= new Person("Michael",new Car("Audi","A4"));
        Person person3= new Person("MichaelNext",new Car("BMW","3 Series"));
        person2.next = person3;
        System.out.println(person2.next);  // com.cydeo.review_SLL.Person@19dfb72a
        System.out.println(person3);       // com.cydeo.review_SLL.Person@19dfb72a

        Person current = person3;
        System.out.println(current);      // com.cydeo.review_SLL.Person@19dfb72a


    }
}