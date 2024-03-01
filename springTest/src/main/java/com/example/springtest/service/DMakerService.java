package com.example.springtest.service;

import com.example.springtest.dto.CreateDeveloper;
import com.example.springtest.entity.Developer;
import com.example.springtest.repository.DeveloperRepository;
import com.example.springtest.type.DeveloperLevel;
import com.example.springtest.type.DeveloperSkillType;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;


    @Transactional
    public void createdDeveloper(CreateDeveloper.Request request) {
        validateCreateDeveloperRequest(request);
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("s")
                .age(5)
                .build();

        developerRepository.save(developer);
    }

    private void validateCreateDeveloperRequest(CreateDeveloper.Request request) {
        if (request.getDeveloperLevel() == DeveloperLevel.SENIOR && request.getExperienceYears() < 10) {
            throw new RuntimeException("SENIOR need 10 years experience.");
        }
    }
}
