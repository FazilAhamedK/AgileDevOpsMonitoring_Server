package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EffortBurndown
{
    private Integer day;
    private Float effortPendingInHours;
}