package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "commentEntity")
@Table(name = "t_comment")
@NamedQueries(
        {
                @NamedQuery(name = "Comment.findByCommentText" , query = "select comment from commentEntity comment where comment.text =:text"),

        }
)
public class Comment extends BaseEntity {

    @Column(name = "c_text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(name = "c_lickecount")
    private int likeCount;

    @Column(name = "c_datetime")
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
