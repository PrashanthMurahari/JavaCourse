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
        for (int i = 1; i < userInput; i++) {
            System.out.println(i);
        }
    }

    public void printTheGivenNumberOfNaturalNumbersInReverseOrder(int userInput) {
        for (int i = userInput; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public void first10EvenNumbers() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void first10OddNumbers() {
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
        for (int i = 0; i <= userInput; i++) {
            count += i;
        }
        System.out.println(count);
    }

    public void productOfNNaturalNumbers(int userInput) {
        long count = 1;
        for (int i = 1; i <= userInput; i++) {
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

    public int countTheDigitsInTheNumber(Integer number) {
        number = Math.abs(number);
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        return count;
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

    public void reverseAGivenNumber(int userInput) {
        int remainingValue = 0;
        int rem;
        while (userInput > 0) {
            rem = userInput % 10;
            remainingValue = (remainingValue * 10) + rem;
            userInput = userInput / 10;
        }
        System.out.println(remainingValue);
    }

    public void armstrongNumbersUnder1000(int userInput) {
        for (int i = 1; i < userInput; i++) {
            int sum = 0;
            int number = i;
            int count = countTheDigitsInTheNumber(number);
            while (number > 0) {
                int num = number % 10;
                sum += Math.pow(num, count);
                number = number / 10;
            }
            if (sum == i) {
                System.out.println("Armstrong number " + sum);
            }
        }
    }


}