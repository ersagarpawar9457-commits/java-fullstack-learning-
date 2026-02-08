# ☕ OOP Concepts in Java

> Object-Oriented Programming fundamentals
> **Covered in:** Offline Classes ✅

---

## 🎯 Four Pillars of OOP

### 1. Encapsulation 📦

> Bundling data + methods, hiding internal details

```java
public class BankAccount {
    private double balance;  // Hidden from outside
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

**Key:** Use `private` fields + `public` getters/setters

---

### 2. Inheritance 👨‍👩‍👧

> Child class inherits from parent class

```java
// Parent
public class Animal {
    protected String name;
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Child
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking");
    }
}
```

**Key:** `extends` keyword, `super` to call parent

---

### 3. Polymorphism 🎭

> Same method, different behaviors

**Compile-time (Overloading):**
```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
}
```

**Runtime (Overriding):**
```java
public class Animal {
    public void sound() { System.out.println("Some sound"); }
}

public class Dog extends Animal {
    @Override
    public void sound() { System.out.println("Bark!"); }
}

// Usage
Animal a = new Dog();
a.sound();  // Outputs: Bark!
```

---

### 4. Abstraction 🎨

> Hiding complexity, showing only essential features

**Abstract Class:**
```java
public abstract class Shape {
    abstract double area();  // Must be implemented
    
    public void display() {  // Can have concrete methods
        System.out.println("This is a shape");
    }
}

public class Circle extends Shape {
    private double radius;
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

**Interface:**
```java
public interface Flyable {
    void fly();  // Implicitly public abstract
}

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
```

---

## 📊 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Abstract + Concrete | Abstract (default methods in Java 8+) |
| Variables | Any type | public static final only |
| Inheritance | Single | Multiple |
| Constructor | ✅ Yes | ❌ No |
| Use when | IS-A relationship | CAN-DO capability |

---

## 💡 Quick Reference

| Keyword | Usage |
|---------|-------|
| `this` | Current object reference |
| `super` | Parent class reference |
| `extends` | Inherit class |
| `implements` | Implement interface |
| `final` | Cannot override/extend |
| `static` | Belongs to class, not object |

---

## ❓ Common Interview Questions

1. **OOP vs Procedural** — OOP is about objects, procedural is about functions
2. **Abstract vs Interface** — Abstract for partial impl, Interface for contracts
3. **Why multiple inheritance not allowed** — Diamond problem
4. **What is IS-A and HAS-A** — Inheritance vs Composition

---

*Review these from your class notes!*
