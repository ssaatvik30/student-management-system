package com.saatvik.sms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.saatvik.sms.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
