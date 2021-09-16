package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserStoryDTO
{
    private Integer userStoryID;
    private String description;
    private MoSCoW moSCoW;
    private List<String> assigneeEmails;
    private List<TaskDTO> taskDTOs;
}