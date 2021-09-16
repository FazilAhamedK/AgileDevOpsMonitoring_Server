package me.fazilahamedk.agiledevopsmonitoring.service;

import me.fazilahamedk.agiledevopsmonitoring.document.Project;
import me.fazilahamedk.agiledevopsmonitoring.dto.ProjectDTO;
import me.fazilahamedk.agiledevopsmonitoring.exception.ExceptionConstants;
import me.fazilahamedk.agiledevopsmonitoring.exception.NotFoundException;
import me.fazilahamedk.agiledevopsmonitoring.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void createProject(ProjectDTO projectDTO)
    {
        projectRepository.save(Project.toProject(projectDTO));
    }

    @Override
    public List<ProjectDTO> findAllProjects() throws NotFoundException
    {
        List<Project> projects = projectRepository.findAll();

        if (projects.isEmpty())
        {
            throw new NotFoundException(ExceptionConstants.NO_PROJECT_FOUND.toString());
        }
        else
        {
            return projects.stream().map(Project::toProjectDTO).collect(Collectors.toList());
        }
    }

    @Override
    public ProjectDTO findProject(Integer projectID) throws NotFoundException
    {
        Optional<Project> projectOptional = projectRepository.findById(projectID);

        if (projectOptional.isPresent())
        {
            return Project.toProjectDTO(projectOptional.get());
        }
        else
        {
            throw new NotFoundException(ExceptionConstants.PROJECT_NOT_FOUND_FOR_ID.toString());
        }
    }
}