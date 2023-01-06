package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.service.CommentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CommentServiceTest {
    private CommentService commentService;

    @BeforeEach
    void setUp() throws Exception{
        commentService = CommentService.getCommentService();
    }

    @Test
    void testSave() throws Exception {
        Comment comment = Comment.builder().text("This is a test comment").userId(1L).build();
        Comment savedComment = commentService.save(comment);
        assertNotNull(savedComment.getId());
        assertEquals(comment.getText(), savedComment.getText());
    }

    @Test
    void testUpdate() throws Exception {
        Comment comment = Comment.builder().text("This is a test comment to be updated").build();
        Comment savedComment = commentService.save(comment);
        assertNotNull(savedComment.getId());

        savedComment.setText("This is an updated test comment");
        savedComment.setUserId(2L);
        commentService.update(savedComment);
        Comment updatedComment = commentService.findById(savedComment.getId());
        assertEquals(savedComment.getText(), updatedComment.getText());
    }

    @Test
    void testDelete() throws Exception {
        Comment comment = Comment.builder().text("This is a test comment to be deleted").build();
        Comment savedComment = commentService.save(comment);
        assertNotNull(savedComment.getId());

        commentService.delete(savedComment.getId());
        Comment deletedComment = commentService.findById(savedComment.getId());
        assertNull(deletedComment);
    }

    @Test
    void testFindAll() throws Exception {
        Comment comment1 = Comment.builder().text("This is the first test comment").build();
        commentService.save(comment1);
        Comment comment2 = Comment.builder().text("This is the second test comment").build();
        commentService.save(comment2);

        List<Comment> comments = commentService.findAll();
        assertEquals(2, comments.size());
        assertTrue(comments.stream().anyMatch(c -> c.getText().equals(comment1.getText())));
        assertTrue(comments.stream().anyMatch(c -> c.getText().equals(comment2.getText())));
    }

    @Test
    void testFindById() throws Exception {
        Comment comment = Comment.builder().text("This is a test comment to be found by id").build();
        Comment savedComment = commentService.save(comment);
        assertNotNull(savedComment.getId());

        Comment foundComment = commentService.findById(savedComment.getId());
        assertEquals(savedComment.getId(), foundComment.getId());
        assertEquals(savedComment.getText(), foundComment.getText());
    }
}
