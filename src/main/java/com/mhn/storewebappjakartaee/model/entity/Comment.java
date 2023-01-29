package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
