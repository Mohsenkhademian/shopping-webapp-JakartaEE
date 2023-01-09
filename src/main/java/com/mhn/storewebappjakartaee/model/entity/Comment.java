package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "commentEntity")
@Table(name = "t_comment")
public class Comment extends BaseEntity {

    @JoinColumn(name = "user_id")
    private long userId;

    @Column(name = "c_text")
    private String text;

}
