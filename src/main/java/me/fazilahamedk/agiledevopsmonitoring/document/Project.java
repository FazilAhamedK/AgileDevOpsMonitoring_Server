package me.fazilahamedk.agiledevopsmonitoring.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.fazilahamedk.agiledevopsmonitoring.dto.MemberDTO;
import me.fazilahamedk.agiledevopsmonitoring.dto.ProductBacklogDTO;
import me.fazilahamedk.agiledevopsmonitoring.dto.ProjectDTO;
import me.fazilahamedk.agiledevopsmonitoring.dto.SprintBacklogDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@Builder
public class Project
{
    private Integer projectID;
    private String projectName;
    private Integer numberOfSprints;
    private Integer numberOfDaysPerSprint;
    private List<MemberDTO> memberDTOs;
    private ProductBacklogDTO productBacklogDTO;
    private List<SprintBacklogDTO> sprintBacklogDTOs;

    public static Project toProject(ProjectDTO projectDTO)
    {
        return Project.builder().projectID(projectDTO.getProjectID())
                      .projectName(projectDTO.getProjectName())
                      .numberOfSprints(projectDTO.getNumberOfSprints())
                      .numberOfDaysPerSprint(
                              projectDTO.getNumberOfDaysPerSprint())
                      .memberDTOs(projectDTO.getMemberDTOs())
                      .productBacklogDTO(projectDTO.getProductBacklogDTO())
                      .sprintBacklogDTOs(projectDTO.getSprintBacklogDTOs())
                      .build();
    }

    public static ProjectDTO toProjectDTO(Project project)
    {
        return ProjectDTO.builder().projectID(project.getProjectID())
                         .projectName(project.getProjectName())
                         .numberOfSprints(project.getNumberOfSprints())
                         .numberOfDaysPerSprint(
                                 project.getNumberOfDaysPerSprint())
                         .memberDTOs(project.getMemberDTOs())
                         .productBacklogDTO(project.getProductBacklogDTO())
                         .sprintBacklogDTOs(project.getSprintBacklogDTOs())
                         .build();
    }
}
