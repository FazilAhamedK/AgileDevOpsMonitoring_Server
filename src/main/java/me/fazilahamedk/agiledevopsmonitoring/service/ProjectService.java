package me.fazilahamedk.agiledevopsmonitoring.service;

import me.fazilahamedk.agiledevopsmonitoring.dto.ProjectDTO;
import me.fazilahamedk.agiledevopsmonitoring.exception.NotFoundException;

import java.util.List;

public interface ProjectService
{
    void createProject(ProjectDTO projectDTO);

    List<ProjectDTO> findAllProjects() throws NotFoundException;

    ProjectDTO findProject(Integer projectID) throws NotFoundException;
}