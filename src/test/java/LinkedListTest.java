import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyFirstNode.setNext(MySecondNode);
        MySecondNode.setNext(MyThirdNode);
        boolean result=MyFirstNode.getNext().equals(MySecondNode)&&
                MySecondNode.getNext().equals(MyThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddAtTop() {
        MyNode<Integer> MyFirstNode=new MyNode<>(70);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(56);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.add(MySecondNode);
        linkedList.add(MyThirdNode);
        boolean result=MyLinkedList.head.equals(MyThirdNode)&&
                MyLinkedList.head.getNext().equals(MySecondNode)&&
                MyLinkedList.tail.equals(MyFirstNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeaddAtLast() {
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.append(MySecondNode);
        linkedList.append(MyThirdNode);
        linkedList.PrintMyNodes();
        boolean result=MyLinkedList.head.equals(MyFirstNode)&&
                MyLinkedList.head.getNext().equals(MySecondNode)&&
                MySecondNode.getNext().equals(MyThirdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult(){
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.append(MyThirdNode);
        linkedList.insert(MyFirstNode,MySecondNode);
        boolean result=linkedList.head.equals(MyFirstNode)&&
                linkedList.head.getNext().equals(MySecondNode)&&
                linkedList.tail.equals(MyThirdNode);

        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

    @Test
    public void given3NumberswhenDeletingFirstElementShouldPassTheLinkedList(){
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.append(MySecondNode);
        linkedList.append(MyThirdNode);
        INode<Integer> poppedNode=linkedList.pop();
        linkedList.PrintMyNodes();
        Assert.assertEquals(MyFirstNode,poppedNode);

    }

    @Test
    public void given3NumbersDeletingLastElementShouldPassTheLinkedList() {
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.append(MySecondNode);
        linkedList.append(MyThirdNode);
        INode<Integer> popLastNode=linkedList.popLast();
        linkedList.PrintMyNodes();
        Assert.assertEquals(MyThirdNode,popLastNode);
    }

}
