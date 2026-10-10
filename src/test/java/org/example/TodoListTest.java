package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TodoListTest {
     @Test
    void addAndList() {

        TodoList todoList = new TodoList();

        todoList.add(" task1 ");

        assertEquals(1, todoList.size());
        assertEquals("task1", todoList.getAll().get(0));
    }

    @Test
    void remove() {

        TodoList todoList = new TodoList();

        todoList.add("a");
        todoList.add("b");

        assertTrue(todoList.remove(0));

        assertEquals(1, todoList.size());

        assertFalse(todoList.remove(10));
    }

    @Test
    void addEmptyIgnored() {

        TodoList todoList = new TodoList();

        todoList.add(" ");

        assertEquals(0, todoList.size());
    }
}
