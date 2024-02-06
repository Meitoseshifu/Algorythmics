package balabux.production;

public class DemoApp1<T> {
    public static void main(String[] args) {
        var head = createLinkedList(4, 3, 9, 1);
        printReversedRecursively(head);
    }

    /**
     * Creates a list of linked {@link Node} objects based on the given array of elements and returns a head of the list.
     *
     * @param elements an array of elements that should be added to the list
     * @param <T>      elements type
     * @return head of the list
     */
    public static <T> Node<T> createLinkedList(T... elements) {
        Node<T> head = null;
        Node<T> tail = null;
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (head == null) {
                head = tail = new Node<>(elements[i]);
            } else {
                tail.next = new Node<>(elements[i]);
                tail = tail.next;
            }
        }
        return head;
    }

    /**
     * Prints a list in a reserved order using a recursion technique. Please note that it should not change the list,
     * just print its elements.
     * <p>
     * Imagine you have a list of elements 4,3,9,1 and the current head is 4. Then the outcome should be the following:
     * 1 -> 9 -> 3 -> 4
     *
     * @param head the first node of the list
     * @param <T>  elements type
     */
    public static <T> void printReversedRecursively(Node<T> head) {
        if (head.next == null) {
            System.out.println(head.element);
        } else {
            printReversedRecursively(head.next);
        }
    }

    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}


