ArrayList: Dynamic array
LinkedList: Doubly linked list
Vector: Dynamic array (synchronized)
Stack: Dynamic array (LIFO structure, synchronized)
CopyOnWriteArrayList: Dynamic array (copy-on-write mechanism)
HashMap: Array + Linked list (or Tree in case of collisions)
LinkedHashMap: Doubly linked list + HashMap
WeakHashMap: Hash table (keys are weak references)
IdentityHashMap: Array-based hash table (key equality based on reference)
TreeMap: Red-Black tree
NavigableMap: Red-Black tree (TreeMap implements it)
ConcurrentHashMap: Segment-based hash table
ConcurrentSkipListMap: Skip list (sorted and concurrent)
HashSet: Hash table (backed by HashMap)
LinkedHashSet: Hash table + Doubly linked list
TreeSet: Red-Black tree (backed by TreeMap)
EnumSet: Bit vector (optimized for enums)
CopyOnWriteArraySet: Dynamic array (copy-on-write mechanism)
SortedSet: Red-Black tree (interface, implemented by TreeSet)
ConcurrentSkipListSet: Skip list (concurrent, sorted)
PriorityQueue: Binary heap
Deque: Double-ended queue (interface, implemented by ArrayDeque or LinkedList)
ArrayDeque: Resizable array (double-ended queue)
LinkedList: Doubly linked list
ConcurrentLinkedDeque: Lock-free linked nodes (double-ended queue)
BlockingQueue: Interface (various blocking implementations)
ArrayBlockingQueue: Circular array (bounded blocking queue)
LinkedBlockingQueue: Linked nodes (bounded/unbounded blocking queue)
PriorityBlockingQueue: Binary heap (blocking queue)
SynchronousQueue: Direct handoff mechanism (no internal storage)
DelayQueue: Priority queue + delayed scheduling
ConcurrentLinkedQueue: Lock-free linked nodes (FIFO queue)