# LAB--2: METHODS IN JAVA

## Objectives

1.  Understand the purpose and importance of methods in Java

2.  Define and call different types of methods

3.  Use methods with parameters and return values

4.  Apply control statements including if-else, switch, and ternary
    inside methods

5.  Write methods that work with Strings and Arrays

6.  Use built-in Math class functions through methods

7.  Understand and use command-line arguments

8.  Organize logic into reusable and readable code

## 1. Methods

A method is a block of code that performs a specific task. Methods help
reduce code repetition, improve readability, and make programs modular
and manageable. In this lab, all methods are declared static so they can
be called directly from the main method without creating objects.

### Method Syntax
```java
static returnType methodName(parameters) {
    // method body
}
```

## 2. Types of Methods

### 2.1 Method with No Parameters and No Return Value

This type of method is used when a task only performs an action such as
displaying a message and does not need input or output.

```java
static void greet() {
    System.out.println("Welcome to Java Methods Lab");
}
```

### 2.2 Method with Parameters and No Return Value

These methods accept input values as parameters and perform operations
without returning a result.
```java
static void printSquare(int num) {
    System.out.println("Square is: " + (num * num));
}
```
### 2.3 Method with Return Value and No Parameters

This type of method performs a calculation and returns a value without
taking any input parameters.
```java
static int getFixedNumber() {
    return 10;
}
```
### 2.4 Method with Parameters and Return Value

This is the most commonly used method type. It takes input, processes
it, and returns a result.
```java
static int add(int a, int b) {
    return a + b;
}
```
## 3. Methods with Control Statements

### 3.1 If--Else Inside a Method

If--else statements allow decision-making inside methods based on
conditions.
```java
static String checkResult(int marks) {
    if (marks >= 40)
        return "Pass";
    else
        return "Fail";
}
```

### 3.2 Ternary Operator in Methods

The ternary operator is a short form of if--else used for simple
conditional expressions.
```java
static int findMax(int a, int b) {
    return (a > b) ? a : b;
}
```
### 3.3 Switch Statement in Methods

The switch statement is used when multiple conditions are based on a
single variable value.
```java
static String dayName(int day) {
    switch (day) {
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        default: return "Invalid Day";
    }
}
```
## 4. Methods with String Basics

### 4.1 String Length

The length() method returns the number of characters present in a
string.
```java
static int getLength(String text) {
    return text.length();
}
```
### 4.2 String Comparison

Strings should be compared using equals() instead of == to compare
actual content.
```java
static boolean checkName(String name) {
    return name.equals("Ali");
}
```
### 4.3 String Case Conversion
```java
static String convertToUpper(String word) {
    return word.toUpperCase();
}
```
## 5. Methods with Arrays

### 5.1 Sum of Array Elements

Arrays can be passed to methods to perform calculations on multiple
values.
```java
static int sumArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
```
### 5.2 Find Maximum Element in Array
```java
static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max;
}
```
## 6. Methods Using Math Class

The Math class provides built-in static methods for common mathematical
operations. These methods can be used directly without creating objects.

### 6.1 Power Function
```java
static int calculatePower(int a, int b) {
    return (int) Math.pow(a, b);
}
```
### 6.2 Absolute Value
```java
static int getAbsolute(int x) {
    return Math.abs(x);
}
```
## 7. Command-Line Arguments

Command-line arguments allow data to be passed to the program at the
time of execution. They are received as an array of strings in the main
method.

### Example: Using Command-Line Arguments
```java
class CommandLineExample {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum: " + (a + b));
    }
}
```
## 8. Complete Example Program
```java
class MethodLab2 {

    static int square(int x) {
        return x * x;
    }

    static boolean isPositive(int x) {
        return x > 0;
    }

    static String checkDay(int d) {
        return dayName(d);
    }

    static String dayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            default: return "Invalid";
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Square: " + square(n));
        System.out.println("Is Positive: " + isPositive(n));
        System.out.println("Day: " + checkDay(1));
    }
}
```
## Lab Guidelines

• All methods must be static\
• Write logic inside methods, not directly in main\
• Use meaningful method names\
• Follow proper indentation and formatting

## Outcome

After completing this lab, students will be able to design modular Java
programs using methods and apply control logic, strings, arrays, math
operations, and command-line arguments effectively.

# Exercises

Instructions:\
• Solve all tasks using methods only.\
• main() should only call methods and print results.\
• All methods must be static.\
• Focus on logic and clean implementation.

## Task 0: Syntax Errors

 | Broken Code                     | Find the Error                   | Fix It                                 |
|---------------------------------|----------------------------------|----------------------------------------|
| `static int add(int a int b){ return a+b; }` | Comma is missing between arguments | `static int add(int a, int b){ return a+b; }` |
| `static void show(){ System.out.println("Hi") }` | Semi-colon missing | `static void show(){ System.out.println("Hi"); }` |
| `static int square(int x){ System.out.println(x*x); }` | Return type is int but we're returning nothing, wrong behavior | `static int square(int x){ return x*x; }` |
| `switch(x){ case 1: System.out.println("One") break; }` | Missing semicolon | `switch(x){ case 1: System.out.println("One"); break; }` |
| `int[] arr = new int[5]` | Statement missing semicolon | `int[] arr = new int[5];` |
| `public static void main(String args){ }` | Main method incorrect, there should be array of String | `public static void main(String[] args){ }` |
| `static int max(int[] arr){ return arr.length }` | Semicolon missing after `arr.length` | `static int max(int[] arr){ return arr.length; }` |


## Task 1: Smart Number Analyzer

Method Type:\
Return: String\
Parameters: int n\
\
Return:\
• \"Positive Even\" if number is positive and even\
• \"Positive Odd\" if positive and odd\
• \"Negative\" if number is negative\
• \"Zero\" if number is 0

Answer:
```java
import java.util.Scanner;

class SmartNumberAnalyzer {

    public static void main(String[] args) {

        System.out.println("**Hello! This Is SmartNumberAnalyzer**");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number To Analyze : ");
        int n = sc.nextInt();

        System.out.println("Result : " + analyze(n));

        sc.close();
    }

    static String analyze(int n) {
        if (n < 0) {
            return "Negative";
        } else if (n > 0) {
            if (n % 2 == 0) 
                return "Positive Even";
            else 
                return "Positive Odd";
        } else {
            return "Zero";
        }
    }
}
```
## Task 2: Conditional Calculator

Method Type:\
Return: int\
Parameters: int a, int b\
\
Rules:\
• If a \> b, return a − b\
• If a \< b, return b − a\
• If equal, return 0

Answer:
```
import java.util.Scanner;

class ConditionalCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number A: ");
        int a = sc.nextInt();

        System.out.print("Enter Any Number B: ");
        int b = sc.nextInt();

        int result = calc(a, b);

        System.out.println("Result = " + result);

        sc.close();
    }

    static int calc(int a, int b) {
        if (a > b) {
            return a - b;
        } else if (a < b) {
            return b - a;
        } else {
            return 0;
        }
    }
}
```
## Task 3: Array Balance Checker

Method Type:\
Return: boolean\
Parameters: int\[\] arr\
\
Return true if sum of even elements equals sum of odd elements.

Answer:
```java
import java.util.Scanner;

class ArrBal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array to check balance: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nResult = " + checkArr(arr));

        sc.close();
    }

    static boolean checkArr(int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return even == odd;
    }
}
```

## Task 4: Switch-Driven Grading System

Method Type:\
Return: String\
Parameters: int marks\
\
Use switch on (marks / 10):\
• 10 → Distinction\
• 9 → Excellent\
• 8 → Very Good\
• Others → Fail

Note: marks are in range (0-100).

Answer:
```java
import java.util.Scanner;

class Grading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("Grading: " + grad(marks));

        sc.close();
    }

    static String grad(int marks) {
        switch (marks / 10) {
            case 10:
                return "Distinction";
            case 9:
                return "Excellent";
            case 8:
                return "Very Good";
            default:
                return "Fail";
        }
    }
}
```

## Task 5: String Pattern Validator

Method Type:\
Return: boolean\
Parameters: String s\
\
Return true if:\
• Length ≥ 6\
• First character uppercase\
• Last character is a digit

Answer:
```java
import java.util.Scanner;

class Stpattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String to validate pattern: ");
        String str = sc.nextLine();

        boolean result = pattern(str);

        System.out.println("Pattern Valid: " + result);

        sc.close();
    }

    static boolean pattern(String str) {
        if (str.length() >= 6 &&
            Character.isUpperCase(str.charAt(0)) &&
            Character.isDigit(str.charAt(str.length() - 1))) {
            return true;
        }
        return false;
    }
}
```

## Task 6: Array Peak Finder

Method Type:\
Return: int\
Parameters: int\[\] arr\
\
Return index of the largest element.\
If multiple max values exist, return first index.

Answer:
```java
import java.util.Scanner;

class ArrPeak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int result = peakfinder(arr);

        System.out.println("Index of largest element: " + result);

        sc.close();
    }

    static int peakfinder(int[] arr) {
        int largest = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        return index;
    }
}
```

## 

## Task 7: Math-Based Decision Maker

Method Type:\
Return: String\
Parameters: int a, int b\
\
Return \"Perfect Square Difference\" if \|a − b\| is a perfect square.\
Otherwise return \"Not Perfect Square\".

Answer:
```java
import java.util.Scanner;

class Maths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter any integer b: ");
        int b = sc.nextInt();

        String result = isPerfect(a, b);

        System.out.println("Result: " + result);

        sc.close();
    }

    static String isPerfect(int a, int b) {
        int num = a - b;

        if (num < 0) return "Not Perfect Square";

        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            return "is Perfect Square Difference";
        } else {
            return "Not Perfect Square";
        }
    }
}
```

## 

## Task 8: Command-Line Validator

Method Type:\
Return: void\
Parameters: String\[\] args\
\
Accept 3 numbers via command-line and print:\
• Largest number\
• Smallest number\
• Difference between them

Answer:
```java
class CommandLine {

    public static void main(String[] args) {
        validate(args);
    }

    static void validate(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int largest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));
        int difference = largest - smallest;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Difference: " + difference);
    }
}
```

## Task 9: Array Trend Detector

Method Type:\
Return: String\
Parameters: int\[\] arr\
\
Return:\
• \"Increasing\" if strictly increasing order in numbers\
• \"Decreasing\" if strictly decreasing order in numbers\
• \"Mixed\" otherwise

Answer:
```java
class ArrTrend {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 2};

        System.out.println(trend(arr));
    }

    static String trend(int[] arr) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            } else if (arr[i] < arr[i - 1]) {
                increasing = false;
            } else {
                increasing = false;
                decreasing = false;
            }
        }

        if (increasing) return "Increasing";
        if (decreasing) return "Decreasing";
        return "Mixed";
    }
}
```

## Task 10: Mini Decision Engine

Method Type:\
Return: String\
Parameters: int n\
\
Return:\
• \"Prime Even\" if n = 2\
• \"Prime Odd\" if prime and odd\
• \"Composite\" if not prime\
• \"Invalid\" if n ≤ 1

Answer:
```java
class MiniDec {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 1, 17, 20};

        for (int n : arr) {
            System.out.println(n + " : " + decision(n));
        }
    }

    static String decision(int n) {

        if (n <= 1) {
            return "Invalid";
        }

        if (n == 2) {
            return "Prime Even";
        }

        if (isPrime(n)) {
            return "Prime Odd";
        }

        return "Composite";
    }

    static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
```

## 

## Task 11: Debugging Practice 

| Broken Code                     | Find the Error                               | Fix It                                 |
|---------------------------------|----------------------------------------------|----------------------------------------|
| `int[] a = new int[5]; a[5] = 10;` | Index `[5]` out of bound error in Java. Arrays are 0-indexed | `int[] a = new int[5]; a[4] = 10;` |
| `int sum; for(int i=0;i<arr.length;i++) sum+=arr[i];` | Variable `sum` is not initialized to 0 | `int sum=0; for(int i=0;i<arr.length;i++) sum+=arr[i];` |
| `static int max(int[] arr){ int m=0; ... }` | Initializing `m = 0` but in case of negative numbers it would give error | `int m = arr[0]; ...` |
| `switch(x){ case 1: System.out.println("One"); case 2: ... }` | Break missing after switch statement case | `switch(x){ case 1: System.out.println("One"); break; case 2: ... }` |
| `Integer.parseInt(args[0]);` | `Integer` with capital I is fine in Java but may confuse beginners | `int.parseInt(args[0]);` (or `Integer.parseInt(args[0])` is correct) |
| `static void calc(int a,int b){ return a+b; }` | Method type is `void` but returning integer | `static int calc(int a,int b){ return a+b; }` |
| `return arr[arr.length];` | Wrong index; arrays are 0-indexed | `return arr[arr.length-1];` |
| `static String day(int d){ switch(d){ case 1: return "Mon"; case 2: return "Tue"; default: "Invalid"; } }` | Default should return string `"Invalid"` | `static String day(int d){ switch(d){ case 1: return "Mon"; case 2: return "Tue"; default: return "Invalid"; } }` |
| `static int add(int a,int b){ System.out.println(a+b); }` | Return type `int` but returning nothing | `static int add(int a,int b){ return (a+b); }` |

## 
