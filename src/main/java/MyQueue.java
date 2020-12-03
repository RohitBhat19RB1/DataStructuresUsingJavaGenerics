public class MyQueue {

    private final MyLinkedList myLinkedList;
    private final MyStack myStack;

    public MyQueue() {
        this.myLinkedList=new MyLinkedList();
        this.myStack=new MyStack();
    }

    public void enqueue(INode myNode) {
        if(isEmpty()) {
            myLinkedList.add(myNode);
        }else{
            myLinkedList.append(myNode);
        }
    }

    public INode checkQueue() {
        return myLinkedList.head;
    }
    public boolean isEmpty(){
        return myStack.IsEmpty();
    }

    public void deQueue() {
        myStack.emptyingTheStack();
    }
}
