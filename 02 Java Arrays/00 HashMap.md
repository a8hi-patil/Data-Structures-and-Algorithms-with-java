🔹 Initialization
HashMap<Integer, String> map = new HashMap<>(); // empty map
HashMap<Integer, String> map2 = new HashMap<>(10); // with initial capacity
HashMap<Integer, String> map3 = new HashMap<>(map); // copy from another map
HashMap<Integer, String> map4 = new HashMap<>(10, 0.75f); // capacity + load factor

🔹 Adding / Updating
map.put(1, "A"); // add entry
map.put(2, "B"); // add entry
map.put(1, "C"); // update value for key 1 (overwrite)

map.putIfAbsent(3, "D"); // add only if key not already present

🔹 Access / Get
map.get(1); // get value for key=1
map.getOrDefault(5, "NA"); // return "NA" if key not present

🔹 Removing
map.remove(2); // remove by key
map.remove(3, "D"); // remove only if key + value both match
map.clear(); // remove all entries

🔹 Searching
map.containsKey(1); // true if key exists
map.containsValue("A"); // true if value exists

🔹 Properties
map.size(); // number of entries
map.isEmpty(); // true if empty

🔹 Iteration
// 1. Iterate over keys
for (Integer key : map.keySet()) {
System.out.println(key);
}

// 2. Iterate over values
for (String val : map.values()) {
System.out.println(val);
}

// 3. Iterate over key-value pairs
for (Map.Entry<Integer, String> entry : map.entrySet()) {
System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// 4. forEach (lambda)
map.forEach((k, v) -> System.out.println(k + " = " + v));

🔹 Utility
map.clone(); // shallow copy of map
map.equals(map2); // compare two maps
map.replace(1, "X"); // replace value at key=1
map.replace(2, "B", "Y"); // replace only if old value matches
map.merge(1, "Z", (oldV, newV) -> oldV + newV); // merge values
