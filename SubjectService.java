package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Subject;
import repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRep;

	public List<Subject> getAllsubject() {

		List<Subject> subject = new ArrayList<>();
		subjectRep.findAll().forEach(subject::add);
		return subject;

	}

	public void addSubject(Subject subject) {
		subjectRep.save(subject);
	}

	public void updateSubject(String id, Subject subject) {
		subjectRep.save(subject);
	}

	public void deleteSubject(String id) {
		subjectRep.deleteById(id);
	}
}
