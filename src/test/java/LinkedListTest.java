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
}

