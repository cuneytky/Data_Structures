package com.cydeo;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList mylist1=new MySinglyLinkedList();   // mylist1 isimli listemi oluşturdum
        System.out.println(mylist1.isEmpty());    // true      // listemin boş olduğunu gördüm.
                                                  // Şimdi MySinglyLinkedList dosyamdaki methodları uygulamasına bakabilirim:

        System.out.println("--- add() ile eleman ekleyip printNodes methodu çalıştırma: ---");
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }
        mylist1.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
        System.out.println("index of 3: "+ mylist1.indexOf(8));

        System.out.println("--- deleteById metodu ile eleman silme: ---");
        mylist1.deleteById(7);  // aradan 7. elamanı sildim.
        mylist1.printNodes();   //0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null
        mylist1.deleteById(0);  // head-baştaki elamnı(0) sildim
        mylist1.printNodes();   // 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null
        mylist1.deleteById(9); //tail-sondaki elemanı(9) sildim
        mylist1.printNodes();   // 1=> 2=> 3=> 4=> 5=> 6=> 8=> null

//!!!!!!!!!!!!!!!!!!!!!!!!!! bu kısma tekrar et bi sıkıntı var!!!!!!!!!!!!!!!
        System.out.println("--- Find the indexOf an element: ---");
        mylist1.printNodes(); // 1=> 2=> 3=> 4=> 5=> 6=> 8=> null
        System.out.println("index of 3: "+ mylist1.indexOf(3)); // index of 3: 2
        System.out.println("index of 0: "+ mylist1.indexOf(0)); // index of 0: -1
        System.out.println("index of 8: "+ mylist1.indexOf(8)); // index of 8: 6





    }
}
