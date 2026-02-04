# LAB--3: Objects, Instance Methods & Encapsulation (Java)

## Objectives

1.  Understand the difference between static and non-static members

2.  Define classes with instance variables

3.  Create and use objects in Java

4.  Call non-static methods using objects

5.  Understand reference variables and object aliasing

6.  Use constructors to initialize objects

7.  Apply basic encapsulation using private

8.  Implement getters and setters

9.  Use the this keyword correctly

## Prerequisite

Students should have completed Lab--2 and must be familiar with static
methods, control statements, arrays, and basic Java syntax.

## 1. Transition from Static to Object-Oriented Programming

Static methods belong to the class, whereas non-static methods belong to
objects. Object-oriented programming focuses on methods operating on
object data.

### Example
```java
// Static
static int add(int a, int b) { 
    return a + b; 
}

// Non-static
int add(int a, int b) { 
    return a + b; 
}
```
## 2. Class and Object Basics

A class is a blueprint, and an object is an instance created from that
class.

### Example
```java
class Student {
    String name;
    int age;
}

Student s1 = new Student();
```
## 3. Instance Variables vs Local Variables

Instance variables belong to objects, while local variables exist only
within methods.

### Example
```java
class Student {
    String name;
    void show() {
        int x = 10;
    }
}
```
## 4. Object Creation and Method Calling

Non-static members are accessed using objects and the dot operator.

### Example
```java
Student s1 = new Student();
s1.name = "Ali";
s1.age = 20;
s1.display();
```
## 5. Reference Variables and Object Aliasing

Multiple references can point to the same object.

### Example
```java
Student s1 = new Student();
Student s2 = s1;
s1.name = "Ali";
System.out.println(s2.name);  // Prints "Ali"
```
## 6. Constructors

Constructors initialize objects and are called automatically.

### Example
```java
class Student {
    String name;
    int age;
    
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```
## 7. Encapsulation

Encapsulation hides data using private and provides controlled access.

### Example
```java
class Student {
    private int age;
}
```
## 8. Getters and Setters

Getters and setters access private data safely.

### Example
```java
class Student {
    private int age;
    
    void setAge(int a) { age = a; }
    int getAge() { return age; }
}
```
## 9. this Keyword

this refers to the current object and resolves naming conflicts.

### Example
```java
class Student {
    private int age;
    
    void setAge(int age) {
        this.age = age;
    }
}
```
# Practice Tasks

Instructions:\
• All methods must be non-static (except main).\
• Use private data members wherever applicable.\
• Access data using constructors, getters, and setters.\
• Do not write logic directly inside main.\

## Task 1: Student Profile Management

Create a class named Student with the following private fields:
• id (int)\
• name (String)\
• age (int)\
• cgpa (double)\

Requirements:
1. Create setters and getters for all fields.
2. Validate age (15--60) and cgpa (0.0--4.0).
3. If invalid data is provided, do not update the value and display a
message.
4. Create an instance method display() to print complete student
information.

In main:\
• Create two Student objects.\
• Set values using setters and display both objects.\

Answer:
```java
class Student {
    private int id;
    private String name;
    private int age;
    private double cgpa;

    int getId() { return this.id; }
    void setId(int id) { this.id = id; }

    String getName() { return this.name; }
    void setName(String name) { this.name = name; }

    int getAge() { return this.age; }
    void setAge(int age) {
        if(age >= 15 && age <= 60) {
            this.age = age;
        } else {
            System.out.print("Invalid Age!");
        }
    }

    double getCgpa() { return this.cgpa; }
    void setCgpa(double cgpa) {
        if(cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA!");
        }
    }

    void display() {
        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Student CGPA : " + cgpa);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setId(123);
        s1.setName("Qadeer");
        s1.setAge(19);
        s1.setCgpa(3.67);

        s2.setId(234);
        s2.setName("Kabeer");
        s2.setAge(17);
        s2.setCgpa(3.92);

        s1.display();
        s2.display();
    }
}

```
## Task 2: Bank Account System

Create a class named BankAccount with the following private fields:
• accountNumber (String)\
• accountHolder (String)\
• balance (double)\
\
Requirements:
1. Use a parameterized constructor to initialize all fields.\
2. Create methods deposit(amount) and withdraw(amount).\
3. Deposit amount must be greater than 0.\
4. Withdrawal amount must be greater than 0 and less than or equal to
balance.\
5. Create a method getBalance() that returns current balance.\
6. Create a method printStatement() to display account details.\
\
In main:\
• Create one account object.\
• Perform multiple deposits and withdrawals.\
• Display account details after each operation.\

Answer:
```java
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " deposited successfully!");
        } else {
            System.out.println("Invalid Amount! Please Deposit Correct Amount");
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn successfully!");
        } else {
            System.out.println("Incorrect amount! Use your brain.");
        }
    }

    double getBal(){ return balance; }

    void printStatement(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Total Balance : " + balance);
        System.out.println();
    }

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("PK12345","Abdul Qadeer",70000);
        acc1.printStatement();
        acc1.deposit(5000);
        acc1.printStatement();
        acc1.withdraw(10000);
        System.out.println("Current Amount : " + acc1.getBal());
        acc1.printStatement();
    }
}
```

## Task 3: Car Showroom Inventory

Create a class named Car with the following private fields:
• brand (String)\
• model (String)\
• year (int)\
• price (double)\

Requirements:
1. Create a parameterized constructor using the this keyword.\
2. Create a display() method to print car details.\
3. Create a getter for price only.\

In main:\
• Create three Car objects.\
• Display all car details.\
• Identify and display the most expensive car.\

Answer:
```java
class Car {

    private String brand;
    private String model;
    private int year;
    private double price;

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Year Of Manufacturing : " + year);
        System.out.println("Car Price : " + price);
        System.out.println();
    }

    double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mercedez", "ZY12", 2015, 45000.99);
        Car car2 = new Car("BMW", "TR21", 2021, 780000);
        Car car3 = new Car("Toyota", "DALA8", 2024, 990000);

        System.out.println("Car Details :");
        car1.display();
        car2.display();
        car3.display();

        if (car1.getPrice() > car2.getPrice() && car1.getPrice() > car3.getPrice()) {
            System.out.println("Most Expensive Car : Car 1");
        } else if (car2.getPrice() > car1.getPrice() && car2.getPrice() > car3.getPrice()) {
            System.out.println("Most Expensive Car : Car 2");
        } else {
            System.out.println("Most Expensive Car : Car 3");
        }
    }
}
```

## 

## Task 4: Reference and Object Aliasing Demonstration

Create a class named Box with the following fields:
• length (double)\
• width (double)\
\
Requirements:\
1. Create an instance method area() that returns the area.\
2. In main:\
• Create one Box object and assign values.\
• Create another reference pointing to the same object.\
• Modify dimensions using the second reference.\
• Print area using both references.\
\
Observation:\
• Both references should reflect the same updated area.\

Answer:
```java
class Box {

    double length;
    double width;

    double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.length = 4.2;
        b1.width = 4.3;

        Box b2 = b1; // b2 references the same object as b1

        System.out.println("Area Using b1 : " + b1.area());

        b2.length = 2.3;
        b2.width = 3.2;

        System.out.println("Area Using b2 : " + b2.area());
    }
}
```

## 

## Task 5: Employee Salary Calculator

Create a class named Employee with the following private fields:
• employeeId (int)\
• name (String)\
• basicSalary (double)\
\
Requirements:
1. Create setters and getters with validation (basicSalary ≥ 30000).\
2. Create methods:
• hra() → returns 20% of basic salary\
• tax() → returns 5% of basic salary\
• netSalary() → returns basic + hra − tax\
• printSlip() → prints formatted salary slip\
\
In main:\
• Create two Employee objects.\
• Display salary slips for both employees.\

Answer:
```java
class Employee {

    private int empId;
    private String name;
    private double basicSalary;

    void setBasicSalary(double basicSalary) {
        if (basicSalary >= 30000) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Salary must be at least 30000!");
        }
    }

    double getBasicSalary() {
        return basicSalary;
    }

    void setEmpId(int empId) {
        this.empId = empId;
    }

    int getEmpId() {
        return empId;
    }

    void setEmpName(String name) {
        this.name = name;
    }

    String getEmpName() {
        return name;
    }

    double hra() {
        return 0.2 * basicSalary;
    }

    double tax() {
        return 0.05 * basicSalary;
    }

    double netSalary() {
        return basicSalary + hra() - tax();
    }

    void printSlip() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra());
        System.out.println("Employee Tax : " + tax());
        System.out.println("Employee Net Salary : " + netSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpId(123);
        emp1.setEmpName("Qadeer");
        emp1.setBasicSalary(33000);

        Employee emp2 = new Employee();
        emp2.setEmpId(223);
        emp2.setEmpName("Kabeer");
        emp2.setBasicSalary(40000);

        emp1.printSlip();
        emp2.printSlip();
    }
}
```
