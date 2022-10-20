public class linkedlist{
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  static Node head=null;
  static void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
    return;
  }
  static void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    Node curNode=head;
    while(curNode.next!=null){
      curNode=curNode.next;
    }
    curNode.next=newNode;
  }
  static void print(){
    Node curNode = head;
    if(curNode==null){
      System.out.println("list is empty.");
      return;
    }
    while(curNode!=null){
      System.out.print(curNode.data+"->");
      curNode=curNode.next;
    }
    System.out.print("null");
  }
  public static void main(String args[]){
    linkedlist list = new linkedlist();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.print();
  }
}
