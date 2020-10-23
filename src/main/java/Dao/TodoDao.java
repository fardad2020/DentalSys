package Dao;

import Model.Todo;

import java.sql.SQLException;
import java.util.List;

public interface TodoDao {

    void insertTodo(Todo todo) throws SQLException;

    Todo SelectTodo(long todoId);

    List<Todo> selectAllTodos();

    boolean deleteTodo(int id) throws SQLException;

    boolean updateTodo(Todo todo) throws SQLException;

}
