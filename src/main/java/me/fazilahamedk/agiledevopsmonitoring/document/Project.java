package me.fazilahamedk.agiledevopsmonitoring.document;

import lombok.Getter;
import lombok.Setter;
import me.fazilahamedk.agiledevopsmonitoring.dto.MemberDTO;
import me.fazilahamedk.agiledevopsmonitoring.dto.ProductBacklogDTO;
import me.fazilahamedk.agiledevopsmonitoring.dto.SprintBacklogDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Project
{
    private Integer projectID;
    private String projectName;
    private Integer numberOfSprints;
    private Integer numberOfDaysPerSprint;
    private List<MemberDTO> memberDTOs;
    private ProductBacklogDTO productBacklogDTO;
    private List<SprintBacklogDTO> sprintBacklogDTOs;
}
