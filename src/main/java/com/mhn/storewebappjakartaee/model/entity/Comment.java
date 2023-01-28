package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "commentEntity")
@Table(name = "t_comment")
public class Comment extends BaseEntity {

    @Column(name = "c_text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
}
