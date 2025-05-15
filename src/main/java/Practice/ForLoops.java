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
                System.out.println(sum);
            }
        }
    }

    public void calculateLCM(int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public void checkPrimeOrNot(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number");
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                break;
            }
        }
        System.out.println(number + " is a prime number");
    }

    public void primeNumbersBetweenGivenNumbers(int startNum, int endNum) {
        for (int number = startNum; number <= endNum; number++) {
            if (number <= 1) {
                System.out.println(number + " is not a prime number");
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    break;
                }
            }
            System.out.println(number + " is a prime number");
        }
    }

    public void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }

    public void fibonacciSeries(int n) {
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    public void fibonacciSeries2(int n) {
        for (int i = 0; i < n; i++) {
            int fibonacci = getFibonacci(i);
            System.out.print(fibonacci);
        }
    }

    public int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public void binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(binary.charAt(i)));
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println(decimal);
    }

    public void rightAngleTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void englishAlphabets() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }

}