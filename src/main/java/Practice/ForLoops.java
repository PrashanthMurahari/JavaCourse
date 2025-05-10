package Practice;

public class ForLoops {

    public void printName5Times() {
        String name = "Prashanth";
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }

    public void printNaturalNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void printNaturalNumbersInReverseOrder() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void printTheGivenNumberOfNaturalNumbers(int userInput) {
        for (int i = 0; i < userInput; i++) {
            System.out.println(i);
        }
    }

    public void printTheGivenNumberOfNaturalNumbersInReverseOrder(int userInput) {
        for (int i = userInput; i <= 1; i--) {
            System.out.println(i);
        }
    }

    public void First10EvenNumbers() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void First10OddNumbers() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void multiplicationTableOfGivenTable(int userInput) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(userInput + " * " + i + " = " + userInput * i);
        }
    }

    public void sumOfNNaturalNumbers(int userInput) {
        int count = 0;
        for (int i = 0; i < userInput; i++) {
            count += i;
        }
        System.out.println(count);
    }

    public void productOfNNaturalNumbers(int userInput) {
        int count = 1;
        for (int i = 1; i < userInput; i++) {
            count *= i;
        }
        System.out.println(count);
    }

    public void sumOfEvenNNaturalNumbers(int userInput) {
        int count = 0;
        for (int i = 0; i < userInput; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println(count);
    }

    public void sumOfOddNNaturalNumbers(int userInput) {
        int count = 0;
        for (int i = 0; i < userInput; i++) {
            if (i % 2 != 0) {
                count += i;
            }
        }
        System.out.println(count);
    }

    public void countTheDigitsInTheNumber(Integer number) {
        number = Math.abs(number);
        System.out.println(number);
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        System.out.println(count);
    }

    public void sumTheDigitsInTheNumber(Integer number) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            count += number % 10;
            number = number / 10;
        }
        System.out.println(count);
    }


}