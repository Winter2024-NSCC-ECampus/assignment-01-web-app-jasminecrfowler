## Custom Data Structure (Linked List)
This project implements a **custom linked list** in Java. It includes various methods for adding, removing, and searching elements dynamically.

### Features
- **`append(value)`** → Adds a node to the end of the list.
- **`prepend(value)`** → Adds a node to the beginning of the list.
- **`size()`** → Returns the total number of nodes.
- **`getHead()`** → Returns the first node.
- **`getTail()`** → Returns the last node.
- **`at(index)`** → Returns the node at the given index.
- **`pop()`** → Removes the last element.
- **`contains(value)`** → Checks if a value exists.
- **`find(value)`** → Returns the index of a value.

## Project Structure**
```
CustomDataStructure/
│── src/
│   ├── Node.java
│   ├── CustomLinkedList.java
│   ├── Main.java
│── README.md
```

##  Installation & Setup**
### Clone the GitHub Repository
```sh
git clone https://classroom.github.com/a/N8xli-cI
```

### Open in IntelliJ IDEA**
1. Open IntelliJ and select **"Open Project"**.
2. Navigate to the `CustomDataStructure` folder and open it.
3. Ensure **Java SDK (JDK 17 or above)** is installed.

### Run the Code**
1. Open `Main.java`.
2. Click **Run** (`Shift + F10`) or **Right-click > Run 'Main.main()'`.

---

## Output
```
Linked List: 5 -> 10 -> 20 -> 30 -> null
Size: 4
Head: 5
Tail: 30
Value at index 2: 20
Contains 20? true
Contains 50? false
Index of 20: 2
Index of 50: -1
After pop: 5 -> 10 -> 20 -> null
```
