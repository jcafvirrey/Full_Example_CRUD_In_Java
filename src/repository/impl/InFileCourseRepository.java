package repository.impl;

import model.Course;
import repository.CourseRepository;

import java.util.List;

public class InFileCourseRepository implements CourseRepository {
    @Override
    public Course create(Course c) {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return List.of();
    }

    @Override
    public boolean update(Course c) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
