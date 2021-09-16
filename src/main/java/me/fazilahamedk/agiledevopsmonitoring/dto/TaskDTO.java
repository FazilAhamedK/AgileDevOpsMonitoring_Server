package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class TaskDTO
{
    private Integer taskID;
    private String description;
    private TaskType taskType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String assigneeEmail;
    private Float totalEffortEstimatedInHours;
    private List<EffortBurndown> actualEffortBurndown;
}