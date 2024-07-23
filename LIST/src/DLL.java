public class DLL {
    Node head;
public  void  insertFirst(int value){
    Node node=new Node(value);
    node.next=head;
    node.prev=null;
    if(head!=null){
        head.prev=node;

    }
    head=node;
}
public void insertLast(int value){
    Node node=new Node(value);
    Node last=head;
    node.next=null;
    if(head==null){
        node.prev=null;
        head=node;
    }
    while (last.next!=null){
        last=last.next;
    }
    last.next=node;
    node.prev=last;
}
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public  void insert(int after,int value){
    Node p=find(after);
    if(p==null){
        System.out.println("does not exist");
        return;
    }
    Node node=new Node(value);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null){
        node.next.prev=node;
    }
    }
public  void display(){
    Node node=head;
    Node last=null;
    while(node!=null){
        System.out.print(node.value+"->");
        node=node.next;
        last=node;
    }
    System.out.println("END");
    while(last!=null){
        System.out.print(last.value+"<-");
last=last.prev;
    }
    System.out.println("start");
}
    private class Node{
        int value;
        Node prev;
        Node next;
        public Node(int value){
            this.value=value;

        }
        public  Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}