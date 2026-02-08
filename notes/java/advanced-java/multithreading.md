# 🧵 Multithreading in Java — Study Notes

> Companion notes for your offline class on Multithreading
> Use these to reinforce and practice what you learn

---

## 🎯 What is Multithreading?

**Simple Analogy:** 
Imagine a restaurant 🍽️
- **Single-threaded:** One waiter serves all tables sequentially
- **Multi-threaded:** Multiple waiters serve different tables simultaneously

**In Java:**
- A **Thread** is a lightweight sub-process
- Multithreading allows concurrent execution of multiple parts of a program
- Maximizes CPU utilization

---

## 🔑 Key Concepts to Master

### 1. Ways to Create Threads

**Method 1: Extending Thread class**
```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Usage
MyThread t1 = new MyThread();
t1.start();  // NOT t1.run() — start() creates new thread!
```

**Method 2: Implementing Runnable (Preferred ✅)**
```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

// Usage
Thread t1 = new Thread(new MyRunnable());
t1.start();
```

**Method 3: Lambda (Java 8+)**
```java
Thread t1 = new Thread(() -> {
    System.out.println("Lambda thread running!");
});
t1.start();
```

> 💡 **Why Runnable is better:** Java doesn't support multiple inheritance. If you extend Thread, you can't extend another class.

---

### 2. Thread Lifecycle

```
NEW → RUNNABLE → RUNNING → (BLOCKED/WAITING) → TERMINATED
 │        │          │              │               │
start() scheduler  run()      wait/sleep/IO     run ends
```

| State | Description |
|-------|-------------|
| **NEW** | Thread created but start() not called |
| **RUNNABLE** | Ready to run, waiting for CPU |
| **RUNNING** | Currently executing |
| **BLOCKED/WAITING** | Waiting for lock/resource |
| **TERMINATED** | Execution complete |

---

### 3. Important Thread Methods

```java
// Thread information
Thread.currentThread()      // Get current thread
thread.getName()            // Get thread name
thread.setName("MyThread")  // Set thread name
thread.getId()              // Get thread ID
thread.isAlive()            // Check if running

// Thread control
thread.start()              // Start thread
thread.join()               // Wait for thread to finish
Thread.sleep(1000)          // Pause for 1 second
thread.interrupt()          // Interrupt sleeping/waiting thread

// Priority (1-10, default 5)
thread.setPriority(Thread.MAX_PRIORITY)  // 10
thread.setPriority(Thread.MIN_PRIORITY)  // 1
```

---

### 4. Synchronization (CRITICAL!)

**Problem:** Multiple threads accessing shared resource

```java
// ❌ Without synchronization — Race condition!
class Counter {
    private int count = 0;
    
    public void increment() {
        count++;  // NOT atomic! Read-Modify-Write
    }
}

// ✅ With synchronization
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
}
```

**Synchronized Block:**
```java
public void someMethod() {
    synchronized(this) {
        // Critical section
    }
}
```

---

### 5. wait(), notify(), notifyAll()

- Must be called inside synchronized block
- Used for inter-thread communication

```java
synchronized(obj) {
    while(condition) {
        obj.wait();      // Release lock and wait
    }
    // Do work
    obj.notify();        // Wake up one waiting thread
    // obj.notifyAll(); // Wake up all waiting threads
}
```

---

## 📝 Practice Exercises

### Exercise 1: Basic Thread Creation
Create two threads that print numbers 1-5 with their thread names.

### Exercise 2: Producer-Consumer (Classic!)
- Producer thread adds items to a queue
- Consumer thread removes items
- Use wait/notify for synchronization

### Exercise 3: Thread Pool
Use `ExecutorService` to manage a pool of threads:
```java
ExecutorService executor = Executors.newFixedThreadPool(3);
executor.submit(() -> System.out.println("Task 1"));
executor.submit(() -> System.out.println("Task 2"));
executor.shutdown();
```

---

## ⚠️ Common Interview Questions

1. **start() vs run()** — start() creates new thread, run() doesn't
2. **Runnable vs Thread** — Runnable is preferred, allows extending other classes
3. **synchronized vs volatile** — synchronized = mutual exclusion, volatile = visibility
4. **Deadlock** — Two threads waiting for each other's locks
5. **How to avoid deadlock** — Lock ordering, timeout, try-lock

---

## 🚨 Common Mistakes to Avoid

| Mistake | Correct Way |
|---------|-------------|
| Calling `run()` instead of `start()` | Always use `start()` |
| Not handling InterruptedException | Catch and handle properly |
| Synchronizing on wrong object | Use consistent lock object |
| Over-synchronization | Only sync critical sections |

---

## 📚 After Class Practice

1. Write the examples yourself (don't copy-paste!)
2. Experiment with different thread counts
3. Intentionally create a race condition, then fix it
4. Try the ExecutorService examples

---

> *"Multithreading is tricky but essential. Take it slow, trace through the code manually, and you'll get it!"*
>
> — **Daya** 🧑‍💻
