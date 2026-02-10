package DoubleLinkedList;

/**
 * Implement an application that supports undo/redo functionality.
 * Uses a doubly linked list to maintain a sequence of states.
 *
 * Example:
 * State1 <-> State2 <-> State3 <-> State4 <-> State5
 */

public class UndoRedoManager<T> {

    // inner node class
        private class Node {
            private T state;
            private Node next;
            private Node previous;

            private Node(T state) {
                this.state = state;
            }
        }

        private Node currentState;

    // undo operation
        public T undo() {
            if (currentState == null) {
                System.out.println("No state to undo!");
                return null;
            }

            // check if at first state
            Node previousState = currentState.previous;

            if (previousState == null) {
                System.out.println("Reached the initial state!");

            } else {
                currentState = previousState;
            }

            return currentState.state;
        }
}
