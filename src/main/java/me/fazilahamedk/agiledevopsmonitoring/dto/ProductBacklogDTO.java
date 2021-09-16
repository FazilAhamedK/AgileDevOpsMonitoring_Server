package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductBacklogDTO
{
    private List<UserStoryDTO> userStoryDTOs;
}