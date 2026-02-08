# ⚠️ Exception Handling in Java

> Managing runtime errors gracefully
> **Covered in:** Offline Classes ✅

---

## 🎯 Exception Hierarchy

```
                 Throwable
                     │
         ┌───────────┴───────────┐
       Error                Exception
    (Don't catch)                │
                      ┌──────────┴──────────┐
              RuntimeException         Checked Exceptions
               (Unchecked)            (Must handle)
                     │                      │
            NullPointerException    IOException
            ArrayIndexOutOfBounds   SQLException
            ArithmeticException     FileNotFoundException
```

---

## 📋 try-catch-finally

```java
try {
    // Code that might throw exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Handle specific exception
    System.out.println("Cannot divide by zero: " + e.getMessage());
} catch (Exception e) {
    // Handle any other exception
    System.out.println("Error: " + e.getMessage());
} finally {
    // Always executes (cleanup code)
    System.out.println("Cleanup here");
}
```

---

## 🔑 throw vs throws

```java
// throw - actually throw an exception
public void withdraw(double amount) {
    if (amount > balance) {
        throw new IllegalArgumentException("Insufficient funds");
    }
    balance -= amount;
}

// throws - declare that method might throw
public void readFile(String path) throws IOException {
    FileReader reader = new FileReader(path);
    // ...
}
```

---

## 🛠️ Custom Exceptions

```java
// Custom exception class
public class InsufficientFundsException extends Exception {
    private double amount;
    
    public InsufficientFundsException(double amount) {
        super("Insufficient funds: " + amount);
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

// Usage
public void withdraw(double amount) throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException(amount);
    }
}
```

---

## ✅ Best Practices

| Do ✅ | Don't ❌ |
|-------|---------|
| Catch specific exceptions | `catch (Exception e)` for everything |
| Log the exception | Ignore/swallow exceptions |
| Use try-with-resources | Manual resource cleanup |
| Throw meaningful exceptions | Throw generic Exception |

---

## 🔄 Try-with-Resources (Java 7+)

```java
// Automatically closes resources
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line = reader.readLine();
    // reader automatically closed
} catch (IOException e) {
    e.printStackTrace();
}
```

---

## ❓ Interview Questions

1. **Checked vs Unchecked** — Checked must be handled, Unchecked are RuntimeException
2. **finally vs finalize** — finally always runs, finalize is garbage collection
3. **Can finally not execute?** — System.exit(), JVM crash
4. **Exception vs Error** — Exception can be recovered, Error usually cannot

---

*Review from your class notes!*
