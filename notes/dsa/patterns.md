# 🧩 DSA Patterns & Techniques

> Common patterns for solving coding problems

---

## 📋 Quick Pattern Reference

| Pattern | Use When | Example Problems |
|---------|----------|------------------|
| Two Pointers | Sorted array, find pairs | Two Sum II, Container with Water |
| Sliding Window | Subarray/substring | Max Sum Subarray, Longest Substring |
| Fast & Slow Pointers | Cycle detection | Linked List Cycle, Middle of List |
| Binary Search | Sorted array | Search in Rotated Array |
| BFS/DFS | Trees, Graphs | Level Order, Path Finding |
| Dynamic Programming | Overlapping subproblems | Fibonacci, Knapsack |
| Backtracking | All combinations | Permutations, N-Queens |

---

## 🎯 Two Pointers

**When to use:** Sorted arrays, finding pairs, palindrome

```java
// Find pair with target sum in sorted array
public int[] twoSum(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            return new int[]{left, right};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[]{-1, -1};
}
```

---

## 🪟 Sliding Window

**When to use:** Subarray/substring of fixed or variable size

```java
// Max sum of subarray of size k
public int maxSum(int[] nums, int k) {
    int windowSum = 0, maxSum = 0;
    
    for (int i = 0; i < nums.length; i++) {
        windowSum += nums[i];
        
        if (i >= k - 1) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= nums[i - k + 1];
        }
    }
    return maxSum;
}
```

---

## 🐢🐇 Fast & Slow Pointers

**When to use:** Cycle detection, finding middle

```java
// Detect cycle in linked list
public boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        
        if (slow == fast) return true;
    }
    return false;
}
```

---

## 🔍 Binary Search

**When to use:** Sorted array, O(log n) needed

```java
public int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
```

---

## 🗺️ HashMap Usage

**When to use:** O(1) lookup, frequency count, two sum

```java
// Two Sum using HashMap
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{-1, -1};
}
```

---

## 💡 Pattern Recognition Tips

1. **Sorted array?** → Two Pointers or Binary Search
2. **Find subarray/substring?** → Sliding Window
3. **Cycle or middle?** → Fast & Slow Pointers
4. **Need O(1) lookup?** → HashMap/HashSet
5. **All combinations?** → Backtracking
6. **Optimal substructure?** → Dynamic Programming

---

*Add more patterns as you solve problems!*
