package Practice;

import org.junit.Test;

public class ForLoopsTest {

    @Test
    public void printName5Times() {
        ForLoops loops = new ForLoops();
        loops.printName5Times();
    }

    @Test
    public void printNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.printNaturalNumbers();
    }

    @Test
    public void printNaturalNumbersInReverseOrder() {
        ForLoops loops = new ForLoops();
        loops.printNaturalNumbersInReverseOrder();
    }

    @Test
    public void printTheGivenNumberOfNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.printTheGivenNumberOfNaturalNumbers(10);
    }

    @Test
    public void printTheGivenNumberOfNaturalNumbersInReverseOrder() {
        ForLoops loops = new ForLoops();
        loops.printTheGivenNumberOfNaturalNumbersInReverseOrder(10);
    }

    @Test
    public void first10EvenNumbers() {
        ForLoops loops = new ForLoops();
        loops.first10EvenNumbers();
    }

    @Test
    public void first10OddNumbers() {
        ForLoops loops = new ForLoops();
        loops.first10OddNumbers();
    }

    @Test
    public void multiplicationTableOfGivenTable() {
        ForLoops loops = new ForLoops();
        loops.multiplicationTableOfGivenTable(19);
    }

    @Test
    public void sumOfNNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.sumOfNNaturalNumbers(20);
    }

    @Test
    public void productOfNNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.productOfNNaturalNumbers(10);
    }

    @Test
    public void sumOfEvenNNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.sumOfEvenNNaturalNumbers(20);
    }

    @Test
    public void sumOfOddNNaturalNumbers() {
        ForLoops loops = new ForLoops();
        loops.sumOfOddNNaturalNumbers(20);
    }

    @Test
    public void countTheDigitsInTheNumber() {
        ForLoops loops = new ForLoops();
        int count = loops.countTheDigitsInTheNumber(246634);
        System.out.println(count);
    }

    @Test
    public void sumTheDigitsInTheNumber() {
        ForLoops loops = new ForLoops();
        loops.sumTheDigitsInTheNumber(248432);
    }

    @Test
    public void reverseAGivenNumber() {
        ForLoops loops = new ForLoops();
        loops.reverseAGivenNumber(123456);
    }

    @Test
    public void armstrongNumbersUnder1000() {
        ForLoops loops = new ForLoops();
        loops.armstrongNumbersUnder1000(10000);
    }


}