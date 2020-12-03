import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void givenThreeNumbersWhenAddedShouldAddedLast() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue queue=new MyQueue();
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode result=queue.checkQueue();
        Assert.assertEquals(myFirstNode,result);

    }

}
