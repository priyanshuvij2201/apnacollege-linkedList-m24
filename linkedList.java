public class linkedList{
    public static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){//To add elements at head
        if(head==null){
            Node newNode =new Node(data);
            head=newNode;
            tail=newNode;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){//To add elements at tail
        if(head==null){
            Node newNode =new Node(data);
            head=newNode;
            tail=newNode;
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){//To print all elements
        if(head==null)
        return;
        Node newNode;
        newNode=head;
        while(newNode!=null){
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }   
        System.out.print("null");
        System.out.println();
    }
    public int length(){
        Node newNode=head;
        int l=0;
        while(newNode!=null){
        newNode=newNode.next;
        l++;}
        return l;
    }
    public void addAtPosition(int pos,int data){
        if(pos==1){
            Node newNode=new Node(data);
            head=newNode;
            tail=newNode;
        }    
        if(pos==this.length()){
            Node newNode=new Node(data);
            tail.next=newNode;
            tail=newNode;
        }
        
    }
    public void removeLast(){
        if(tail==null){
            return;
        }
        Node newNode,removeNode;
        newNode=head;
        removeNode=newNode;
        while(newNode.next!=null){
            removeNode=newNode;
            
            newNode=newNode.next;
        } 
        removeNode.next=null;
        tail=removeNode;

    }
    public void removeAtPos(int pos){
        if(head==null){
            return;
        }
        
        Node curr,prev;
        curr=head;
        prev=null;
        if(pos==1){
            head=curr.next;
            curr.next=null;
            return;
        }
        int cnt=0;
        int l=this.length();
        while(cnt<pos-1){
            prev=curr;
            curr=curr.next;
            cnt++;
        }
        if(pos==l){
            prev.next=null;
            curr.next=null;
        }
        
        prev.next=curr.next;
        curr.next=null;
    }
    public void removeFirst(){
        if(head==null){
            return;
        }
        Node newNode;
        newNode=head;
        head=newNode.next;
        newNode.next=null;
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addFirst(1);
        
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(6);
        ll.addFirst(3);
        ll.addAtPosition(5, 7);
        System.out.println(ll.length());
         ll.print();
         ll.removeAtPos(1);
         ll.print();
    }
}