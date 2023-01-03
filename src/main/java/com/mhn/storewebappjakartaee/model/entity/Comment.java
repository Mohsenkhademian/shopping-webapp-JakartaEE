package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "commentEntity")
@Table(name = "comment")
public class Comment extends BaseEntity {

    @Column(name = "c_text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
