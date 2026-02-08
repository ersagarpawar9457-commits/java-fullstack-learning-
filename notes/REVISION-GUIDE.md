# 📖 Complete Revision Guide

> Quick revision of ALL topics covered in your classes
> **Time to revise:** ~30-45 minutes
> **Last Updated:** February 8, 2026

---

# ☕ JAVA SECTION

---

## 1️⃣ Control Flow

### If-Else
```java
if (condition) {
    // code
} else if (anotherCondition) {
    // code
} else {
    // default
}
```

### Switch (Java 14+)
```java
String result = switch (day) {
    case "MON", "TUE" -> "Weekday";
    case "SAT", "SUN" -> "Weekend";
    default -> "Unknown";
};
```

### Loops
```java
// For loop
for (int i = 0; i < 10; i++) { }

// While
while (condition) { }

// Do-while (runs at least once)
do { } while (condition);

// For-each
for (String item : list) { }
```

---

## 2️⃣ OOP (4 Pillars)

| Pillar | Meaning | Keyword |
|--------|---------|---------|
| **Encapsulation** | Hide data + expose methods | `private`, getters/setters |
| **Inheritance** | Child extends Parent | `extends`, `super` |
| **Polymorphism** | Same method, different behavior | Overloading, `@Override` |
| **Abstraction** | Hide complexity | `abstract`, `interface` |

### Quick Code
```java
// Encapsulation
private int age;
public int getAge() { return age; }

// Inheritance
class Dog extends Animal { }

// Polymorphism
@Override
public void sound() { System.out.println("Bark"); }

// Abstraction
interface Flyable { void fly(); }
abstract class Shape { abstract double area(); }
```

---

## 3️⃣ Arrays

```java
// Declaration
int[] arr = new int[5];
int[] arr = {1, 2, 3, 4, 5};

// 2D Array
int[][] matrix = new int[3][3];

// Common operations
arr.length          // Size
Arrays.sort(arr)    // Sort
Arrays.toString(arr) // Print
```

---

## 4️⃣ Collections

| Type | Implementation | Order | Duplicates |
|------|----------------|-------|------------|
| List | ArrayList, LinkedList | ✅ Yes | ✅ Yes |
| Set | HashSet, TreeSet | ❌/✅ | ❌ No |
| Map | HashMap, TreeMap | ❌/✅ | Keys: No |
| Queue | PriorityQueue, Deque | FIFO | ✅ Yes |

### Quick Code
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.get(0);

Set<String> set = new HashSet<>();
set.add("Unique");

Map<String, Integer> map = new HashMap<>();
map.put("key", 1);
map.get("key");
```

---

## 5️⃣ Exception Handling

```java
try {
    // risky code
} catch (SpecificException e) {
    // handle
} finally {
    // always runs
}

// throw - create exception
throw new IllegalArgumentException("message");

// throws - declare method might throw
public void read() throws IOException { }
```

| Checked | Unchecked (Runtime) |
|---------|---------------------|
| IOException | NullPointerException |
| SQLException | ArrayIndexOutOfBoundsException |
| Must handle | Optional to handle |

---

## 6️⃣ Wrapper Classes

| Primitive | Wrapper |
|-----------|---------|
| int | Integer |
| double | Double |
| boolean | Boolean |
| char | Character |

```java
// Autoboxing (primitive → wrapper)
Integer num = 5;

// Unboxing (wrapper → primitive)
int n = num;

// Parse string
int x = Integer.parseInt("123");
```

---

## 7️⃣ Methods/Functions

```java
// Syntax
accessModifier returnType methodName(parameters) {
    // body
    return value;
}

// Example
public static int add(int a, int b) {
    return a + b;
}

// Overloading (same name, different params)
public int add(int a, int b) { }
public double add(double a, double b) { }
```

---

## 8️⃣ Multithreading (Currently Learning!)

### Create Threads
```java
// Method 1: Extend Thread
class MyThread extends Thread {
    public void run() { }
}

// Method 2: Implement Runnable ✅
Thread t = new Thread(() -> System.out.println("Running"));
t.start();
```

### Key Points
- `start()` creates new thread, `run()` doesn't
- Use `synchronized` to prevent race conditions
- `wait()`, `notify()` for thread communication

---

# 🎨 FRONTEND SECTION

---

## 9️⃣ HTML Basics

```html
<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
</head>
<body>
    <h1>Heading</h1>
    <p>Paragraph</p>
    <a href="#">Link</a>
    <img src="image.jpg" alt="description">
    <div class="container">Block element</div>
    <span>Inline element</span>
</body>
</html>
```

### Semantic Elements
`<header>`, `<nav>`, `<main>`, `<section>`, `<article>`, `<footer>`

---

## 🔟 CSS Box Model

```
┌─────────────────────────┐
│        MARGIN           │
│  ┌───────────────────┐  │
│  │     BORDER        │  │
│  │ ┌───────────────┐ │  │
│  │ │   PADDING     │ │  │
│  │ │ ┌───────────┐ │ │  │
│  │ │ │  CONTENT  │ │ │  │
│  │ │ └───────────┘ │ │  │
│  │ └───────────────┘ │  │
│  └───────────────────┘  │
└─────────────────────────┘
```

```css
.box {
    width: 200px;
    padding: 20px;
    border: 1px solid black;
    margin: 10px;
    box-sizing: border-box; /* Include padding/border in width */
}
```

---

## 1️⃣1️⃣ Flexbox

```css
.container {
    display: flex;
    justify-content: center;      /* Main axis */
    align-items: center;          /* Cross axis */
    flex-direction: row;          /* row | column */
    flex-wrap: wrap;
    gap: 10px;
}

.item {
    flex: 1;                      /* Grow equally */
}
```

---

## 1️⃣2️⃣ CSS Grid

```css
.container {
    display: grid;
    grid-template-columns: 1fr 2fr 1fr;
    grid-template-rows: auto;
    gap: 20px;
}

.item {
    grid-column: span 2;          /* Span 2 columns */
}
```

**Responsive Grid:**
```css
grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
```

---

## 1️⃣3️⃣ Pseudo-classes & Pseudo-elements

### Pseudo-classes (state)
```css
a:hover { color: red; }
input:focus { border: blue; }
li:first-child { font-weight: bold; }
li:nth-child(2n) { background: gray; }
```

### Pseudo-elements (content)
```css
p::before { content: "→ "; }
p::after { content: " ←"; }
p::first-letter { font-size: 2em; }
::selection { background: yellow; }
```

---

# 🔧 GIT & GITHUB

---

## 1️⃣4️⃣ Git Commands

```bash
# Setup
git init                    # Initialize repo
git clone <url>             # Clone remote repo

# Daily workflow
git status                  # Check status
git add .                   # Stage all changes
git commit -m "message"     # Commit
git push                    # Push to remote

# Branches
git branch                  # List branches
git branch <name>           # Create branch
git checkout <name>         # Switch branch
git checkout -b <name>      # Create + switch
git merge <branch>          # Merge branch

# Sync
git pull                    # Fetch + merge
git fetch                   # Just fetch

# Undo
git checkout -- <file>      # Discard changes
git reset HEAD~1            # Undo last commit
```

---

# ✅ QUICK SELF-TEST

Answer these without looking above:

### Java
1. What are the 4 OOP pillars?
2. ArrayList vs LinkedList — when to use which?
3. `throw` vs `throws` — difference?
4. How to create a thread? (2 ways)

### CSS
5. What's the box model order (inside to outside)?
6. `justify-content` vs `align-items`?
7. `:hover` is pseudo-class or pseudo-element?

### Git
8. What does `git add .` do?
9. How to create and switch to a new branch in one command?

---

## 📊 Your Mastery Checklist

| Topic | Confident? |
|-------|------------|
| If-else, Loops | ☐ |
| OOP (4 pillars) | ☐ |
| Arrays | ☐ |
| Collections | ☐ |
| Exceptions | ☐ |
| Wrapper Classes | ☐ |
| Multithreading | ☐ *(learning)* |
| HTML Structure | ☐ |
| CSS Box Model | ☐ |
| Flexbox | ☐ |
| Grid | ☐ |
| Pseudo-class/element | ☐ |
| Git Commands | ☐ |

---

> *"Revision is where learning becomes permanent. Read this once today, once before bed, and once tomorrow morning. You'll retain 90%!"*
>
> — **Daya** 🧑‍💻

---
