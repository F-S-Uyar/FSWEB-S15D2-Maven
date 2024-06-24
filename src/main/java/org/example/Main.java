package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Set<Task> annsTasks = new HashSet<>();
//        Task taskAnn = new Task("workintech","dummy desc", "ann", Status.IN_PROGRESS, Priority.HIGH)
//        Task taskAnn2 = new Task("workintech","dummy desc 2", "ann", Status.IN_PROGRESS, Priority.HIGH)
//
//        annsTasks.add(taskAnn);
//        annsTasks.add(taskAnn2);
//
//        Set<Task> bobsTasks = new HashSet<>();
//        Task bobTask = new Task("workintech","dummy desc", "bob", Status.IN_PROGRESS, Priority.HIGH)
//        Task bobTask2 = new Task("workintech","dummy desc 2", "bob", Status.IN_PROGRESS, Priority.HIGH)
//
//        bobsTasks.add(bobTask);
//        bobsTasks.add(bobTask2);
//
//        Set<Task> carolsTasks = new HashSet<>();
//        Task carolsTask = new Task("workintech","dummy desc", "carol", Status.IN_PROGRESS, Priority.HIGH)
//        Task carolsTask2 = new Task("workintech","dummy desc 2", "carol", Status.IN_PROGRESS, Priority.HIGH)
//
//        bobsTasks.add(carolsTask);
//        bobsTasks.add(carolsTask2);
//
//        Set<Task> unassignedTasks = new HashSet<>();
//        Task unassignedTask = new Task("workintech","dummy desc", "null", Status.IN_PROGRESS, Priority.HIGH)
//        unassignedTasks.add(unassignedTask);
//
//        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
//        System.out.println("bobstasks: " + taskData.getTasks("bob"));
//        System.out.println("annstasks: " + taskData.getTasks("ann"));
//        System.out.println("alltasks: " + taskData.getTasks("all"));

        StringSet.findUniqueWords();
    }
}