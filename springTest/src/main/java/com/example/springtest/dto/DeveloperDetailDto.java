package com.example.springtest.dto;

import com.example.springtest.code.StatusCode;
import com.example.springtest.entity.Developer;
import com.example.springtest.type.DeveloperLevel;
import com.example.springtest.type.DeveloperSkillType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeveloperDetailDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;

    private Integer experienceYears;
    private String memberId;
    private String name;
    private StatusCode statusCode;
    private Integer age;

    public static DeveloperDetailDto fromEntity(Developer developer) {
        return DeveloperDetailDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .experienceYears(developer.getExperienceYears())
                .memberId(developer.getMemberId())
                .name(developer.getName())
                .statusCode(developer.getStatusCode())
                .age(developer.getAge())
                .build();
    }
}
