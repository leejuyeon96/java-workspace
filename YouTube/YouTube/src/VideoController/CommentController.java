package VideoController;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.Comment;
import com.youtube.model.User;

import UserController.UserController;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	//c 댓글작성 -- > 로그인된 회원만 가능!
	public void addComment(String id, String password, Comment comment) {
	
		if(uc.login(id, password)) {
			comments.add(comment);
		}
	}
	public Comment viewComment(int index) {
		return comments.get(0);
		
		
	}
	public void updateComment(String id, String password, int index, Comment comment) {
			if(uc.login(id, password) && id == comment.user.id)
			comments.set(index, comment);
		
	}
	public void deleteComment(String id, String password, int index) {
		User user = comments.get(index).user;
		if(uc.login(id, password) && id == user.id)
		comments.remove(index);
		
	}
	//r 댓글 1개 보기
	//u 댓글 수정 -- > 로그인한 회원과 이댓글을 작성한 작성자가 일치
	//d 댓글 삭제 -- > 로그인한 회원과 이댓글을 작성한 작성자가 일치
	
}
