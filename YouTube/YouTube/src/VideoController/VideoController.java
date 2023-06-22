package VideoController;

import java.util.ArrayList;

import com.youtube.model.User;
import com.youtube.model.Video;

import UserController.UserController;

public class VideoController {
	UserController uc = new UserController();
	ArrayList<Video> videoList = new ArrayList<>();
	
	public Video upload(Video video) {
		 videoList.add(video);
		return video;
	}

	
	public ArrayList<Video> videoList() {
		return videoList;
	}

	
	public Video viewVideo(int index) {
		return videoList.get(index);
	}

	
	public Video updateVideo(String id, String password, int index, Video video) {
		if(uc.login(id, password) && id == video.user.id)
		return videoList.set(index, video);
		return null;
	}

	
	public boolean deleteVideo(String id, String password, Video video) {
	
		User user = video.user;
		if(uc.login(id, password) && id == user.id)
		
		return videoList.remove(video);
		return false;
	}


 
	/*영상 업로드
	 *영상 목록
	 *영상 1개 보기
	 *동영상 수정
	 *동영상 삭제
	 */

}







