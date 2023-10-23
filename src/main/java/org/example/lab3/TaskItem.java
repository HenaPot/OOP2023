package org.example.lab3;

public class TaskItem {
    public static void main(String[] args){
        TaskItem task = new TaskItem(99, "this is a test task", taskStatus.CANCELLED);
        System.out.println(task.getTaskDescription());
    }
    public enum taskStatus {
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }
    public int taskId;
    public String taskDescription;
    public static taskStatus taskStatus;

    public TaskItem(int id, String description, taskStatus status) {
        this.taskId = id;
        this.taskDescription = description;
        taskStatus = status;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }
}
