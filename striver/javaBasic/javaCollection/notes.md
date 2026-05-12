Java collections framework is powerful toolbox of data structures

inside toolbox
List
Set
Queue
Map
Stack
Heap
Algorithms
Iterators

iterables are
List, set, queue, deque

maps is not iterable

# Core Data structures

# 1. ArrayList

dynamic array

ArrayList<Integer> arr = new ArrayList<>();

Normal array:
fixed size

ArrayList:
creates bigger array when full
copies old elements

***Operation***
arr.add(10);
arr.get(0);
arr.set(0, 99);
arr.remove(0);
arr.size();

# 2. Linked List
Linkedlist<Integer> list = new Linkedlist<>();

# 3. Stack
Stack<Integer> st = new Stack<>();

st.push(10);
st.pop(20);

st.pop();
st.peek();

new in modern java


Deque<Integer> st = new ArrayDeque<>();

# 4. Queue
Queue<Integer> q = new LinkedList<>();

# 5. PriorityQueue (Heap)
PriorityQueue<Integer> pq = new PriorityQueue<>();

PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Collections.reverseOrder());


# 6. HashSet

HashSet<Integer> set = new HashSet<>();


# 7. TreeSet

TreeSet<Integer> set = new TreeSet<>();


# 8. HashMap

HashMap<String, Integer> map = new HashMap<>();


# 9. TreeMap
TreeMap<Integer, String> map = new TreeMap<>();

