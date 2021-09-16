package me.fazilahamedk.agiledevopsmonitoring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MemberDTO
{
    private Integer memberID;
    private String fullName;
    private String email;
    private List<MemberRole> memberRoles;
    private Boolean isActive;
}
