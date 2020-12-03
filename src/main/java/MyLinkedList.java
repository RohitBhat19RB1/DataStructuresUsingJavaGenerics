public class MyLinkedList<K> {
    public static INode head;
    public static INode tail;
    public K key;


    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void add(INode newNode) {
        if(this.tail==null) {
            tail = newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    public void PrintMyNodes(){
        StringBuffer myNodes=new StringBuffer("MyNodes:");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNode) {
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }else{
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode=this.head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        tempNode.setNext(null);
        this.tail=tempNode;
        return tempNode;
    }

    public  INode search(K key ) {
        INode tempNode=this.head;
        while (tempNode!=null){
            if(tempNode.equals(key)){
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void inserInmiddle(K key,INode newNode){
        insert(search(key),newNode);
    }

    public void deleteInMiddle(K key,INode previous){
        INode tempNode=this.head;
        while (!tempNode.getNext().equals(key)){
            tempNode=tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        System.out.println("size of linklist:"+size());
    }
    public int size(){
        INode tempNode=this.head;
        int size=0;
        while (tempNode!=null){
            size++;
            tempNode=tempNode.getNext();
        }
        return size;
    }
}

