package me.fazilahamedk.agiledevopsmonitoring.repository;

import me.fazilahamedk.agiledevopsmonitoring.document.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, Integer>
{}