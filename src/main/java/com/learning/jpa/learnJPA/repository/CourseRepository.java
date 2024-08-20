package com.learning.jpa.learnJPA.repository;

import com.learning.jpa.learnJPA.data.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(Long id)
    {
       return em.find(Course.class,id);
    }

    public Course save(Course course)
    {
        if(course.getId()==null)
        {
            em.persist(course);
        }
        else {
            return em.merge(course);
        }
        return course;
    }

    public Course update(Course course)
    {
        return em.merge(course);
    }

    public void deleteBy(Long id)
    {
        Course course  = findById(id);
        if(course!=null)
        {
            em.remove(course);
        }

    }

    public List<Course> fetchAllCourse()
    {
        TypedQuery<Course> ctq = em.createNamedQuery("fetch_all_courses",Course.class);
        return ctq.getResultList();

    }

}
