1D ArrayList
✅ Initialization
ArrayList<Integer> list = new ArrayList<>(); // empty list
ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c")); // with values
ArrayList<Integer> list3 = new ArrayList<>(10); // initial capacity

✅ Adding Elements
list.add(10); // add at end
list.add(0, 5); // add at index
list.addAll(list2); // add all from another list
list.addAll(1, list2); // addAll at index

✅ Access & Update
int val = list.get(0); // access element
list.set(0, 100); // update element

✅ Removing
list.remove(0); // remove by index
list.remove(Integer.valueOf(10)); // remove by value
list.clear(); // remove all elements

✅ Searching
list.contains(100); // true/false
list.indexOf(100); // first index
list.lastIndexOf(100); // last index

✅ Properties
list.size(); // number of elements
list.isEmpty(); // true if empty

✅ Iteration
for (int x : list) { }
list.forEach(System.out::println);
Iterator<Integer> it = list.iterator();
while (it.hasNext()) { it.next(); }

✅ Conversion
Object[] arr = list.toArray(); // to Object[]
Integer[] arr2 = list.toArray(new Integer[0]); // to Integer[]
Collections.sort(list); // sort
Collections.reverse(list); // reverse
Collections.shuffle(list); // shuffle

2D ArrayList (ArrayList of ArrayList)
✅ Initialization
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

// Fixed size init
int rows = 3, cols = 3;
for (int i = 0; i < rows; i++) {
matrix.add(new ArrayList<>());
for (int j = 0; j < cols; j++) {
matrix.get(i).add(0); // default value
}
}

✅ Adding Elements
matrix.get(0).add(10); // add element in row 0
matrix.get(1).add(20); // add element in row 1

// add a whole row
ArrayList<Integer> newRow = new ArrayList<>(Arrays.asList(7, 8, 9));
matrix.add(newRow);

✅ Access & Update
int val = matrix.get(1).get(2); // access [row][col]
matrix.get(1).set(2, 99); // update [row][col]

✅ Removing
matrix.get(0).remove(1); // remove element from row 0, col 1
matrix.remove(2); // remove whole row

✅ Properties
matrix.size(); // number of rows
matrix.get(0).size(); // number of columns in row 0

✅ Iteration
for (ArrayList<Integer> row : matrix) {
for (int val : row) {
System.out.print(val + " ");
}
}

🔹 Utility Tricks
Collections.sort(matrix.get(0)); // sort first row
Collections.reverse(matrix.get(1)); // reverse second row
