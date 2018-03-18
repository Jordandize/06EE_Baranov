package ua.edu.constantine.relations.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.edu.constantine.relations.dao.LecturesDAO;
import ua.edu.constantine.relations.data.Lecture;

@Component("worker")
public class LectureWorker {
	
	@Autowired
	private LecturesDAO dao;
	
	public Lecture addLecture(Lecture lecture) {
		lecture = dao.addLecture(lecture);
		System.out.println(lecture);
		return lecture;
	}
	
	public Lecture getLecture(long id) {
		Lecture lecture = dao.getLecture(id);
		System.out.println(lecture);
		return lecture;
	}
	
	public void saveLecture(Lecture lecture) {
		dao.saveLecture(lecture);
	}

}
