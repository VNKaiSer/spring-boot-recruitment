package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.backend.enums.SkillLevel;
import vn.edu.iuh.fit.backend.ids.JobSkillID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_skill")
@IdClass(JobSkillID.class)
public class JobSkill {
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

}
