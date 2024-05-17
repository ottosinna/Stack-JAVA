The theme idea is having a game library wich has the game name and price. 

The provided code defines a stack data structure using a generic type T.
The StackInterface<T> declares methods for common stack operations such as 
push, pop, peek, isEmpty, size, and contains. The Stack<T> class implements 
this interface using a linked list structure with a private inner class Node<T>, 
which stores the item and a reference to the next node. The stack operations 
(push, pop, peek, isEmpty, and size) are efficient with constant time complexity O(1), 
while the contains method, which checks for the presence of an item, has linear 
time complexity O(n). Additionally, a Game class is defined, implementing 
the Comparable<Game> interface to allow for comparison based on price, 
and includes fields for the name and price of the game, with appropriate 
getters, a constructor, and a toString method.
