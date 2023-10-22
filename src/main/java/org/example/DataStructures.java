package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import org.example.TaskItem;

public class DataStructures {
    public static void main(String[] args){

    }
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskItem.taskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskItem.taskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskItem.taskStatus.COMPLETED));
    }

    // TODO create a method to get all objects
    public List<TaskItem> getTasks() {
        return tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status

    public List<TaskItem> getByStatus(TaskItem.taskStatus status) {
        return tasks
                .stream()
                .filter(task -> {return task.taskStatus.equals(status);}).toList();
    }

    // TODO create a method to find tasks whose id parameter greater than or equal to 2

    public List<TaskItem> getById() {
        return tasks
                .stream()
                .filter(task -> {return task.taskId>= 2;}).toList();
    }

    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task
    public void printDescription(){
        tasks
                .stream()
                .forEach(task -> {
                    System.out.println(task.taskDescription);});
    }
}



