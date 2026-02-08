# 📦 Collections in Java

> Quick reference for Java Collections Framework
> **Covered in:** Offline Classes ✅

---

## 🎯 Collections Hierarchy

```
                    Collection (Interface)
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
      List              Set              Queue
        │                 │                 │
   ┌────┴────┐      ┌────┴────┐       ┌────┴────┐
ArrayList LinkedList HashSet TreeSet PriorityQueue Deque
```

**Separate:** `Map` (not part of Collection interface)
```
                       Map
                        │
              ┌─────────┼─────────┐
           HashMap   TreeMap  LinkedHashMap
```

---

## 📋 Quick Comparison

### List vs Set vs Map

| Feature | List | Set | Map |
|---------|------|-----|-----|
| Duplicates | ✅ Allowed | ❌ No | Keys: No, Values: Yes |
| Order | Maintained | Depends | Depends |
| Null | ✅ Allowed | One null (HashSet) | One null key |
| Access | By index | By value | By key |

---

## 🔑 Key Implementations

### ArrayList
```java
// Fast random access, slow insert/delete in middle
List<String> list = new ArrayList<>();
list.add("Java");
list.get(0);      // O(1)
list.remove(0);   // O(n)
```
**Use when:** Frequent reads, rare modifications

### LinkedList
```java
// Slow random access, fast insert/delete
List<String> list = new LinkedList<>();
list.addFirst("First");
list.addLast("Last");
```
**Use when:** Frequent insert/delete at ends

### HashSet
```java
// No order, no duplicates, O(1) operations
Set<String> set = new HashSet<>();
set.add("Java");
set.contains("Java");  // O(1)
```
**Use when:** Need unique elements, don't care about order

### TreeSet
```java
// Sorted order, no duplicates
Set<String> set = new TreeSet<>();
set.add("Banana");
set.add("Apple");
// Iteration: Apple, Banana (sorted!)
```
**Use when:** Need sorted unique elements

### HashMap
```java
// Key-Value pairs, O(1) operations
Map<String, Integer> map = new HashMap<>();
map.put("Java", 1);
map.get("Java");       // Returns 1
map.containsKey("Java"); // true
```
**Use when:** Need key-value lookup

### TreeMap
```java
// Sorted by keys
Map<String, Integer> map = new TreeMap<>();
map.put("Banana", 2);
map.put("Apple", 1);
// Keys in order: Apple, Banana
```

---

## 💡 Common Operations

```java
// Size
list.size();
map.size();

// Check empty
list.isEmpty();

// Clear all
list.clear();

// Iterate - for-each
for (String item : list) {
    System.out.println(item);
}

// Iterate - forEach with lambda
list.forEach(item -> System.out.println(item));

// Iterate Map
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

---

## ⚠️ Common Mistakes

| Mistake | Solution |
|---------|----------|
| Modifying while iterating | Use Iterator.remove() |
| Using mutable objects as keys | Make keys immutable |
| Not overriding equals/hashCode | Always override both for custom objects |
| Choosing wrong collection | Understand use case first |

---

## ❓ Interview Questions

1. **ArrayList vs LinkedList** — ArrayList for random access, LinkedList for frequent insertions
2. **HashSet internal working** — Uses HashMap internally, values are dummy objects
3. **HashMap working** — Array of buckets, uses hashCode() and equals()
4. **When to use TreeMap** — When you need sorted keys
5. **Fail-fast vs Fail-safe** — ConcurrentModificationException vs copy iteration

---

*Review these concepts from your class notes!*
