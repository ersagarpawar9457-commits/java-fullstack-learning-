# 📝 Revision Quiz

> Test yourself on all topics!
> **Time:** ~20-30 minutes
> **Rules:** Answer WITHOUT looking at notes first!

---

## 🎯 Instructions

1. Answer each question in your head or write answers below
2. Check answers ONLY after completing all sections
3. Mark your score at the end
4. Review weak areas from notes

---

# Section A: Java Basics (10 Questions)

### Q1. What are the 4 pillars of OOP?
```
Your answer:
1. Inheritance
2. Polymorphism
3. Abstraction
4. Encapsulation
```
**✅ CORRECT!** All 4 pillars named correctly.

---

### Q2. What is the difference between `==` and `.equals()` in Java?
```
Your answer:
== use for compare primitive datatypes
.equals() use for check referential datatypes
```
**🔶 PARTIALLY CORRECT!**

**Full Answer:**
| Operator | What it compares |
|----------|------------------|
| `==` | Primitives: **values**. Objects: **memory references** |
| `.equals()` | Compares **actual content/values** of objects |

```java
String a = new String("hello");
String b = new String("hello");
a == b        // false (different memory)
a.equals(b)   // true (same content)
```

---

### Q3. What is the difference between `ArrayList` and `LinkedList`? When to use which?
```
Your answer:

```

### Q4. What is the difference between `throw` and `throws`?
```
Your answer:

```

### Q5. What is Encapsulation? Give a one-line definition.
```
Your answer:

```

### Q6. What is the difference between `abstract class` and `interface`?
```
Your answer:

```

### Q7. What is Autoboxing and Unboxing?
```
Your answer:

```

### Q8. What is the difference between Checked and Unchecked exceptions?
```
Your answer:

```

### Q9. What is the difference between `HashSet` and `TreeSet`?
```
Your answer:

```

### Q10. What does the `final` keyword do when applied to: a) variable, b) method, c) class?
```
Your answer:
a) variable:
b) method:
c) class:
```

---

# Section B: Multithreading (5 Questions)

### Q11. What is the difference between `start()` and `run()` methods?
```
Your answer:

```

### Q12. Name 2 ways to create a thread in Java.
```
Your answer:
1.
2.
```

### Q13. What is a Race Condition?
```
Your answer:

```

### Q14. What keyword is used to prevent race conditions?
```
Your answer:

```

### Q15. What is Deadlock?
```
Your answer:

```

---

# Section C: HTML & CSS (10 Questions)

### Q16. What is the CSS Box Model? List components from inside to outside.
```
Your answer:

```

### Q17. What is the difference between `display: flex` and `display: grid`?
```
Your answer:

```

### Q18. What does `justify-content` control in Flexbox?
```
Your answer:

```

### Q19. What does `align-items` control in Flexbox?
```
Your answer:

```

### Q20. What is the difference between pseudo-class and pseudo-element? Give examples.
```
Your answer:
Pseudo-class:
Pseudo-element:
```

### Q21. What is the difference between `block` and `inline` elements?
```
Your answer:

```

### Q22. What does `box-sizing: border-box` do?
```
Your answer:

```

### Q23. How do you make a responsive grid that adjusts columns automatically?
```
Your answer (CSS):

```

### Q24. What is Semantic HTML? Give 3 examples of semantic tags.
```
Your answer:

```

### Q25. What is CSS Specificity order (highest to lowest)?
```
Your answer:

```

---

# Section D: Git (5 Questions)

### Q26. What is the difference between `git pull` and `git fetch`?
```
Your answer:

```

### Q27. What command creates a new branch AND switches to it?
```
Your answer:

```

### Q28. What is the Staging Area in Git?
```
Your answer:

```

### Q29. What does `git add .` do?
```
Your answer:

```

### Q30. What is a Pull Request?
```
Your answer:

```

---

# ✅ Answer Key

<details>
<summary>Click to reveal answers (ONLY after completing!)</summary>

## Section A Answers:

**Q1:** Encapsulation, Inheritance, Polymorphism, Abstraction

**Q2:** `==` compares memory references, `.equals()` compares actual content/values

**Q3:** ArrayList = fast random access O(1), slow insert/delete O(n). LinkedList = slow access O(n), fast insert/delete at ends O(1). Use ArrayList for reading, LinkedList for frequent modifications.

**Q4:** `throw` = actually throw an exception. `throws` = declare that method might throw an exception.

**Q5:** Bundling data and methods together, hiding internal details using access modifiers.

**Q6:** Abstract class can have abstract + concrete methods, single inheritance. Interface has abstract methods (+ default in Java 8+), multiple inheritance allowed.

**Q7:** Autoboxing = automatic primitive → wrapper conversion. Unboxing = automatic wrapper → primitive conversion.

**Q8:** Checked = must be handled at compile-time (IOException). Unchecked = runtime exceptions, optional to handle (NullPointerException).

**Q9:** HashSet = no order, uses hashing, O(1). TreeSet = sorted order, O(log n).

**Q10:** a) variable = constant, cannot change. b) method = cannot be overridden. c) class = cannot be extended/inherited.

## Section B Answers:

**Q11:** `start()` creates a new thread and calls run(). `run()` just executes in current thread (no new thread).

**Q12:** 1) Extend Thread class 2) Implement Runnable interface

**Q13:** Bug when multiple threads access shared data simultaneously without synchronization.

**Q14:** `synchronized`

**Q15:** Two or more threads waiting for each other forever to release locks.

## Section C Answers:

**Q16:** Content → Padding → Border → Margin

**Q17:** Flex = 1D (row OR column). Grid = 2D (rows AND columns).

**Q18:** Alignment along the MAIN axis (horizontal in row direction)

**Q19:** Alignment along the CROSS axis (vertical in row direction)

**Q20:** Pseudo-class = element state (`:hover`, `:focus`). Pseudo-element = part of element (`::before`, `::after`).

**Q21:** Block = full width, starts new line (div, p). Inline = only needed width, no new line (span, a).

**Q22:** Includes padding and border in the element's total width/height.

**Q23:** `grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));`

**Q24:** Tags that describe meaning. Examples: `<header>`, `<nav>`, `<main>`, `<article>`, `<footer>`

**Q25:** Inline styles > ID (#) > Class (.) > Element (tag)

## Section D Answers:

**Q26:** `fetch` = downloads changes but doesn't merge. `pull` = fetch + merge.

**Q27:** `git checkout -b <branch-name>`

**Q28:** Intermediate area where changes are prepared before committing.

**Q29:** Stages ALL changed files for commit.

**Q30:** Request to merge your branch/changes into another branch.

</details>

---

# 📊 Score Card

| Section | Correct | Total | Percentage |
|---------|---------|-------|------------|
| Java Basics | /10 | 10 | % |
| Multithreading | /5 | 5 | % |
| HTML & CSS | /10 | 10 | % |
| Git | /5 | 5 | % |
| **TOTAL** | **/30** | **30** | **%** |

---

## 🎯 Result Interpretation

| Score | Level | Action |
|-------|-------|--------|
| 25-30 | 🌟 Excellent | Ready for next topics! |
| 20-24 | 👍 Good | Minor revision needed |
| 15-19 | 📚 Fair | Review weak sections |
| <15 | 🔄 Needs Work | Re-read notes thoroughly |

---

> *"Testing yourself is the best way to learn. Mistakes show you where to focus!"*
>
> — **Daya** 🧑‍💻
