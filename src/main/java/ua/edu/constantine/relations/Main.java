package ua.edu.constantine.relations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.edu.constantine.relations.data.Lecture;
import ua.edu.constantine.relations.workers.LectureWorker;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Lecture lecture = new Lecture("Jordan", 1000000.0);
		LectureWorker worker = (LectureWorker) context.getBean("worker");
		worker.addLecture(lecture);
	}
}
