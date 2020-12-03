import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode)&&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddAtTop() {
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.add(mySecondNode);
        linkedList.add(myThirdNode);
        boolean result=MyLinkedList.head.equals(myThirdNode)&&
                MyLinkedList.head.getNext().equals(mySecondNode)&&
                MyLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeaddAtLast() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.PrintMyNodes();
        boolean result=MyLinkedList.head.equals(myFirstNode)&&
                MyLinkedList.head.getNext().equals(mySecondNode)&&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();

    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(myThirdNode);
        linkedList.insert(myFirstNode,mySecondNode);
        boolean result=linkedList.head.equals(myFirstNode)&&
                linkedList.head.getNext().equals(mySecondNode)&&
                linkedList.tail.equals(myThirdNode);

        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

    @Test
    public void given3NumberswhenDeletingFirstElementShouldPassTheLinkedList(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        INode<Integer> poppedNode=linkedList.pop();
        linkedList.PrintMyNodes();
        Assert.assertEquals(myFirstNode,poppedNode);

    }

    @Test
    public void given3NumbersDeletingLastElementShouldPassTheLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.popLast();
        boolean result=linkedList.head.equals(myFirstNode)&&
                linkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenSearchingShouldPassTheLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        INode<Integer> searchNode=linkedList.search(mySecondNode);
        Assert.assertEquals(mySecondNode,searchNode);
    }

    @Test
    public void given4NumbersWhenInsertingInMiddleShouldPassTheLinkedList(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(40);
        MyNode<Integer> myFourthNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myFourthNode);
        linkedList.inserInmiddle(mySecondNode,myThirdNode);
        boolean result=linkedList.head.equals(myFirstNode)&&linkedList.head.getNext().equals(mySecondNode)&&
                linkedList.head.getNext().getNext().equals(myThirdNode)&&
                linkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

    @Test
    public void given4NumbersWhenDeletingMiddleShuoldPassTheresult(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(40);
        MyNode<Integer> myFourthNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.append(myFourthNode);
        linkedList.deleteInMiddle(myThirdNode,mySecondNode);
        boolean result=linkedList.head.equals(myFirstNode)&&
                linkedList.head.getNext().equals(mySecondNode);
        linkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

}
