package com.cydeo;

public class MySinglyLinkedList {

    // Node isimli class ta id ile Node next ikilisini tanımladık.
    // burada da head -tail- size tanımlaması yapıp methodlarımızı oluşturduk:
    Node head;
    Node tail;
    int size;

    // listenin boş olup olmadığını konntrol etme:
    boolean isEmpty(){
        return head == null;
    }

    // linked List ile listeye eleman ekleme:
    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // linked List ile oluşturulan listeyi yazdırma:
    void printNodes(){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+"=> ");
            }
            current=current.next;
        }
    }


    // listeden veri silme (3 durum var başta-sonda-ortada):
    // aslında silmiyoruz listeden bağını koparıyoruz.
    // ortada kalan elemanı garb.collect. topluyor:)
    void deleteById(int id){
        // check if empty ==> ile kontrol ettik
        if(isEmpty()) System.out.println("List is empty!!!");
        // assign prev and current with the head

        Node prev=head;     // burası başlangcı sağlıyor--?? tekrar bak???
        Node current=head; // ilk olarak currenti tanımladık

        while(current!=null){
            if(current.id==id){// there is a match
                //case 1: head  ==> current heade eşitse baştadır. currentten sonra geleni head olarak tanımladık.
                                   // currentin sonunu null yaparak listeden bağını kopramış olduk. bu garb.collect. oldu.
                if(current==head){
                    head=current.next;
                    current.next=null;
                }
                // case 2 : tail  ==> currrent tail e eşitse sondadır. daha onnce template olarak tanımladığımız
                                     // (current öncesi diyemediğimzi için böyle yaptık galiba) prev i tail olarak atadık.
                                     // prev den sonra gelenin bağını null yapıp son elman haline getirdik
                                     // yani current boşa çıktı. garb.colelect oldu.
                else if(current==tail){
                    tail=prev;
                    prev.next=null;//Ex -Tail will be eligible for Garbage Collection
                }
                // case 3 : middle  ==> currentten sonra geleni(current.next) currentten önce gelenden sonrasına(prev.next) eşitledik.
                                        // current sonrasını null yaparak ta currenti boşa çıkaıp gar. coll. oldu
                else{
                    prev.next=current.next;
                    current.next=null;// Current will be eligible for Garbage Collection
                }
                // after deletion   ==> silme işlemleri bitince de size 1 azalttım
                size--;
            }
            // move forward on the elements of the list
            prev=current;
            current=current.next;

        }

    }

    /*
Assignment -1: indexOf() Method
1. Find the indexOf an element and return it.
2. If not found return -1.
     */
    int indexOf(int id){
        if (isEmpty()) return -1;
        int pos=0;
        // iterate through the list
        Node current=head;// set my current with the starting element;
        while(current!=null){
            if(current.id==id) return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }

    /*
Assignment -2: addFirst(int value) Method
1. Implement a method that makes the insertion into
    first element of LinkedList
 */
    // linked List ile listenin başına eleman ekleme:
    void addFirst(int data){
        // create a new node object from data
        Node node=new Node(data);
        // case 1: list empty
        if(isEmpty()){
            head=tail=node;
        } else{      // case 2 : list is not empty
            node.next=head;
            head=node;
        }
        //increase size
        size++;
    }

    /*
Assignment -3: Get Kth Item From the Last
1. You don’t know the size of the singly linked list.
2. Find the Kth item from last and print it in one pass.
3. Item already exists in the linked list.
  */
    public int getKthItemFromLast(int k){
        // create two pointers
        Node ptr1=head;
        Node ptr2=head;
        // move ptr2 k-1 times

        for (int i = 0; i < k-1; i++) {
            ptr2=ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while(ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;
    }

      /*
 Assignment -4: Remove Kth Item From the Last (Optional )
1. You don’t know the size of the singly linked list.
2. Delete the Kth item from last in one pass
     */
    public void removeKthItemFromLast(int k){
        // create three pointers
        Node ptr1=head;
        Node ptr2=head;
        Node prev=null;
        // move ptr2 k-1 times

        for (int i = 0; i < k-1; i++) {
            ptr2=ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while(ptr2.next!=null){
            prev=ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
        // Do delete operation
        if (ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else if(ptr1==tail){
            tail=prev;
            prev.next=null;
            size--;
        } else {
            prev.next=ptr1.next;
            ptr1.next=null;
            size--;
        }
    }

    public void removeKthFromLast2(int k){
        Node ptr1=head;
        Node ptr2=head;
        for(int i=0;i<k-1;i++) {
            ptr2=ptr2.next;
            if (ptr2==null)  System.out.println("Less than k elements");
            else if(ptr2.next==null){
                head=ptr1.next;
                ptr1.next=null;
                return;
            }
        }
        while(ptr2.next.next!=null) {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr1.next=ptr1.next.next;
        ptr1=ptr1.next;
        ptr1=null;
    }






}
