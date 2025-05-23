package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }


    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(String title){
        System.out.println(title);
        taskService.addTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        System.out.println(id);
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        System.out.println(id);
        taskService.toggleTask(id);
        return "redirect:/";
    }

}
