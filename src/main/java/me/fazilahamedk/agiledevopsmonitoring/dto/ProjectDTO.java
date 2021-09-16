package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ProjectDTO
{
    private Integer projectID;
    private String projectName;
    private Integer numberOfSprints;
    private Integer numberOfDaysPerSprint;
    private List<MemberDTO> memberDTOs;
    private ProductBacklogDTO productBacklogDTO;
    private List<SprintBacklogDTO> sprintBacklogDTOs;
}
