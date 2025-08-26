package bridgeLabzday1;
public class bridgeLabz {

    public static void aocy(int r, int h) {
        double vol = 3.14 * (Math.pow(r, 2)) * h;
        System.out.println("Volume of Cylinder: " + vol);
    }

    public static void aoc(int r) {
        double area = (3.14) * (Math.pow(r, 2));
        System.out.println("Area of Circle: " + area);
    }

    public static void farhen(int x) {
        int farhen = (x * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + farhen);
    }

    public static void  add(int x, int y) {
        System.out.println(x + y);
    }

    public static void hello() {
        System.out.println("Welcome to Bridgelabz!");
    }

    static void simpleInterest(double P, double R, double T) {
        System.out.println("Simple Interest: " + (P * R * T) / 100);
    }

    static void perimeterOfRectangle(double l, double w) {
        System.out.println("Perimeter Of Rectangle: " + 2 * (l + w));
    }

    static void powerCalculation(int b, int e) {
        System.out.println("Power: " + Math.pow(b, e));
    }

    static void averageOfThree(int num1, int num2, int num3) {
        System.out.println("Average of three: " + (num1 + num2 + num3) / 3.0);
    }

    static void kilometersToMiles(double km) {
        System.out.println("Miles: " + km * 0.621371);
    }

      static void car() {
        class Car {
            String brand;
            int speed;
            static int wheels = 4;
            Car(String brand, int speed) {
                this.brand = brand;
                this.speed = speed;
            }
            void display() {
                System.out.println("Brand: " + brand + ", Speed: " + speed + ", Wheels: " + wheels);
            }
        }
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("BMW", 150);
        Car car3 = new Car("Honda", 100);
        car1.display();
        car2.display();
        car3.display();
        car1.wheels = 6;
        System.out.println("\nAfter changing wheels:");
        car2.display();
        car3.display();
    }

    static void studentPassFail() {
        class Student {
            String name;
            int marks;
            Student(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }
            void checkResult() {
                if (marks >= 40)
                    System.out.println(name + " Passed");
                else
                    System.out.println(name + " Failed");
            }
        }
        Student s1 = new Student("Aman", 35);
        Student s2 = new Student("Riya", 75);
        s1.checkResult();
        s2.checkResult();
    }

    static void thisKeywordExample() {
        class TestThis {
            int num = 10;
            void show() {
                int num = 20;
                System.out.println("Local num: " + num);
                System.out.println("Instance num: " + this.num);
            }
        }
        new TestThis().show();
    }

    static void localVariableError() {
        System.out.println("Cannot run here: Local variables must be initialized before use.");
    }

    static void rectangleExample() {
        class Rectangle {
            int length, width;
            Rectangle(int length, int width) {
                this.length = length;
                this.width = width;
            }
            void calculate() {
                int area = length * width;
                int perimeter = 2 * (length + width);
                System.out.println("Area: " + area + ", Perimeter: " + perimeter);
            }
        }
        new Rectangle(5, 3).calculate();
    }

    static void employeeExample() {
        class Employee {
            String name;
            double salary;
            Employee(String name) {
                this.name = name;
                this.salary = 0;
            }
            Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
            void display() {
                System.out.println("Name: " + name + ", Salary: " + salary);
            }
        }
        Employee e1 = new Employee("Raj");
        Employee e2 = new Employee("Simran", 50000);
        e1.display();
        e2.display();
    }

    static void laptopExample() {
        class Laptop {
            String brand;
            int ram;
            double price;
            Laptop(String brand, int ram, double price) {
                this.brand = brand;
                this.ram = ram;
                this.price = price;
            }
            void display() {
                System.out.println(brand + " - " + ram + "GB RAM - Rs." + price);
            }
        }
        Laptop[] laptops = {
            new Laptop("Dell", 8, 55000),
            new Laptop("HP", 16, 65000),
            new Laptop("Lenovo", 12, 60000)
        };
        for (Laptop l : laptops) l.display();
    }

    static void primitiveConversion() {
        int num = 10;
        double decimal = 5.75;
        char letter = 'A';
        boolean flag = true;
        System.out.println("int: " + num);
        System.out.println("double: " + decimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + flag);
        double numToDouble = num;
        int doubleToInt = (int) decimal;
        System.out.println("int to double: " + numToDouble);
        System.out.println("double to int: " + doubleToInt);
    }

    static void averageMarks() {
        int[] marks = {80, 70, 90, 60, 75};
        int sum = 0;
        for (int m : marks) sum += m;
        double avg = (double) sum / marks.length;
        System.out.println("Average marks: " + avg);
    }

    static void vowelCheck(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is a consonant.");
    }

    static void accessCheck(boolean access) {
        if (access)
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");
    }

    static void bankAccountExample() {
        class BankAccount {
            String accountHolder;
            double balance;
            static String bankName = "MyBank";
            BankAccount(String accountHolder, double balance) {
                this.accountHolder = accountHolder;
                this.balance = balance;
            }
            void deposit(double amt) {
                balance += amt;
            }
            void withdraw(double amt) {
                balance -= amt;
            }
            void display() {
                System.out.println(accountHolder + " | " + bankName + " | Balance: " + balance);
            }
        }
        BankAccount acc1 = new BankAccount("Rohit", 5000);
        BankAccount acc2 = new BankAccount("Priya", 8000);
        acc1.display();
        acc2.display();
        BankAccount.bankName = "SuperBank";
        acc1.display();
        acc2.display();
    }

    static void circleExample() {
        class Circle {
            double radius;
            Circle(double r) { radius = r; }
            double area() { return Math.PI * radius * radius; }
            double circumference() { return 2 * Math.PI * radius; }
        }
        Circle c = new Circle(5);
        System.out.println("Area: " + c.area() + ", Circumference: " + c.circumference());
    }

    static void personAgeExample() {
        class Person {
            int birthYear;
            Person(int year) { birthYear = year; }
            int age(int currentYear) { return currentYear - birthYear; }
        }
        Person p = new Person(2000);
        System.out.println("Age: " + p.age(2025));
    }

    static void swapExample() {
        int a = 5, b = 10;
        System.out.println("Before: a=" + a + ", b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After: a=" + a + ", b=" + b);
    }

    static void reverseString(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }

    static void primeCheck(int num) {
        boolean prime = true;
        if (num <= 1) prime = false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) { prime = false; break; }
        }
        System.out.println(num + (prime ? " is Prime" : " is Not Prime"));
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static void studentMarksExample() {
        int sub1 = 85, sub2 = 70, sub3 = 90;
        int total = sub1 + sub2 + sub3;
        double percentage = total / 3.0;
        String grade;
        if (percentage >= 75) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 40) grade = "C";
        else grade = "Fail";
        System.out.println("Total: " + total + ", Percentage: " + percentage + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        hello();
        aocy(5, 10);
        aoc(7);
        farhen(25);
        add(4, 6);
        simpleInterest(100.0, 3.4, 2.0);
        perimeterOfRectangle(5.0, 3.0);
        powerCalculation(2, 5);
        averageOfThree(4, 7, 10);
        kilometersToMiles(10);
        car();
        studentPassFail();
        thisKeywordExample();
        localVariableError();
        rectangleExample();
        employeeExample();
        laptopExample();
        primitiveConversion();
        averageMarks();
        vowelCheck('a');
        accessCheck(true);
        bankAccountExample();
        circleExample();
        personAgeExample();
        swapExample();
        reverseString("Hello");
        primeCheck(17);
        System.out.println("Factorial of 5: " + factorial(5));
        studentMarksExample();
    }
}