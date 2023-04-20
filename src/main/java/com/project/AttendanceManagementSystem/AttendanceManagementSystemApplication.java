package com.project.AttendanceManagementSystem;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import com.project.AttendanceManagementSystem.api.TeacherController;
import com.project.AttendanceManagementSystem.dao.BatchRepository;
import com.project.AttendanceManagementSystem.dao.StudentRepository;
import com.project.AttendanceManagementSystem.dao.TeacherRepository;
import com.project.AttendanceManagementSystem.entity.BatchEntity;
import com.project.AttendanceManagementSystem.entity.StudentEntity;
import com.project.AttendanceManagementSystem.entity.TeacherEntity;
import com.project.AttendanceManagementSystem.model.Batch;
import com.project.AttendanceManagementSystem.model.Teacher;

@SpringBootApplication(scanBasePackages = {"com.project"})
public class AttendanceManagementSystemApplication {
	
	@Autowired
	private BatchRepository batchRepository;

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(AttendanceManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner runScript() {
		return args -> {
			
			
			TeacherEntity t1=new TeacherEntity("001", "Ankit", "Mehra", "ankit001", "ankit", "9900998729", "25000", "not_opened");
		    teacherRepository.save(t1);
		    TeacherEntity t2=new TeacherEntity("002", "Sonu", "Nigam", "sonu002", "sonu", "9900878987", "30000", "not_opened");
		    teacherRepository.save(t2);
		    TeacherEntity t3=new TeacherEntity("003", "Katrina", "Kaif", "katrina003", "katrina", "9425022909", "25000", "not_opened");
		    teacherRepository.save(t3);
		    
			
		    

		    
		    studentRepository.save(new StudentEntity("001", "Kaushal", "Arora", "kaushal001", "1234", "male", "9988776655", "not_opened"));
		    studentRepository.save(new StudentEntity("002", "Rajeev", "Singh", "rajeev002", "rajeev", "male", "9900998877", "not_opened"));
		    studentRepository.save(new StudentEntity("003", "Pooja", "Agrawal", "pooja003", "pooja", "female", "9008899009", "not_opened"));
		    studentRepository.save(new StudentEntity("004", "Akshay", "Kumar", "akshay004", "akshay", "male", "9425099800", "not_opened"));
		    studentRepository.save(new StudentEntity("005", "Ranbir", "Kapoor", "ranbir005", "ranbir", "male", "9425077229", "not_opened"));
		    studentRepository.save(new StudentEntity("006", "Yogita", "Mehra", "yogita108", "yogita", "female", "9425094354", "not_opened"));

		    
		    batchRepository.save(new BatchEntity("b1", "Core java", "25", t1));
		    batchRepository.save(new BatchEntity("b2", "Advance Java", "35", t2));
		    batchRepository.save(new BatchEntity("b3", "PHP", "40", t3));
		    
			Resource resource = new ClassPathResource("database.sql");
			ScriptUtils.executeSqlScript(dataSource().getConnection(), new EncodedResource(resource, "UTF-8"));
		};
	}

	
	private DataSource dataSource() {
		return new DriverManagerDataSource("jdbc:h2:mem:testdb", "sa", "sa");
	}

}
