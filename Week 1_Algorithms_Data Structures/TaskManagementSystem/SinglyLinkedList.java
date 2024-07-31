package TaskManagementSystem;
public class SinglyLinkedList {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Method to add a task at the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a task by taskId
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Method to delete a task by taskId
    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        Task t1 = new Task("T001", "Design Homepage", "Pending");
        Task t2 = new Task("T002", "Develop API", "In Progress");
        Task t3 = new Task("T003", "Test Application", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("All tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for task T002:");
        Task foundTask = taskList.searchTask("T002");
        if (foundTask != null) {
            System.out.println("Task found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting task T002:");
        taskList.deleteTask("T002");

        System.out.println("All tasks after deletion:");
        taskList.traverseTasks();
    }
}

