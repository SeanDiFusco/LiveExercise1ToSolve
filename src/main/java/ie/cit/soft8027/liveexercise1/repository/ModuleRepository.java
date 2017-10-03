package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import ie.cit.soft8027.liveexercise1.entity.LearningOutcome;
import ie.cit.soft8027.liveexercise1.entity.Module;

public interface ModuleRepository {

	public Module getById(int id);
	public List<Module> findAll();
	
}
