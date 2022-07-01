package repository;

import org.springframework.data.repository.CrudRepository;

import bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String>{

}
