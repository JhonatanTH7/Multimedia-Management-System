package com.Courses.MultimediaManagementSystem.domain.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.Courses.MultimediaManagementSystem.util.enums.MultimediaType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "multimedia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Multimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MultimediaType type;

    @Column(columnDefinition = "TEXT")
    private String url;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "fk_id_lesson", referencedColumnName = "id")
    private Lesson lesson;

}
