class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> count = new HashMap<>();

       for(int a: arr){
           count.put(a, count.getOrDefault(a, 0)+1);
       }

       HashSet<Integer>set = new HashSet(count.values());

        return set.size() == count.size();
    }
}

/*
Sure, here's a line-by-line explanation of the code:

```java
class Solution {
```
This line defines a new class named `Solution`.

```java
    public boolean uniqueOccurrences(int[] arr) {
```
This line defines a public method named `uniqueOccurrences` that takes an array of integers (`int[] arr`) as input and returns a boolean value.

```java
        HashMap<Integer, Integer> count = new HashMap<>();
```
This line initializes a new `HashMap` named `count`. This `HashMap` will store each integer from the array as a key and its corresponding count as a value.

```java
        for (int a : arr) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
```
These lines iterate over each integer `a` in the array `arr`. For each integer, it increments its count in the `HashMap`. If the integer is not already in the `HashMap`, it defaults the count to 0 and then increments it.

```java
        HashSet<Integer> set = new HashSet<>(count.values());
```
This line initializes a new `HashSet` named `set` with the values from the `HashMap` (i.e., the counts of each integer).

```java
        return set.size() == count.size();
    }
}
```
This line checks if the size of the `HashSet` is equal to the size of the `HashMap`. If they are equal, it means that all counts are unique; otherwise, there are some duplicate counts. So, it returns `true` if all counts are unique and `false` otherwise. The method and class definitions are then closed with braces. 

In summary, this code checks if all integers in the given array have unique counts. If so, it returns true; otherwise, it returns false.
*/