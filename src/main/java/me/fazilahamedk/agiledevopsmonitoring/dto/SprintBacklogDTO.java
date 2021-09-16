package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class SprintBacklogDTO
{
    private Integer sprintID;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<UserStoryDTO> userStoryDTOs;
}