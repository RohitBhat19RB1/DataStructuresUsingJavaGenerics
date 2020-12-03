import org.junit.Assert;
import org.junit.Test;

public class stackTest {

    @Test
    public void givenThreeNumbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyStack stack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        INode peak=stack.peak();
        Assert.assertEquals(peak,myThirdNode);

    }

    @Test
    public void givenThreeNumbersInStackWhenPopperOutshouldmatchwithLastAddedNode(){
        MyStack stack=new MyStack();
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        int size=stack.size();
        stack.emptyingTheStack(size);
        boolean result=stack.IsEmpty();
        Assert.assertTrue(result);
    }

}
