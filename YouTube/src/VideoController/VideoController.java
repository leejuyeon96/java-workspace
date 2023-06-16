package VideoController;

import java.util.ArrayList;

import com.youtube.model.Video;

public class VideoController {
	
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

	
	public Video updateVideo(int index, Video video) {
		 return videoList.set(index, video);
	}

	
	public boolean deleteVideo(Video video) {
		return videoList.remove(video);
	}


 
	/*영상 업로드
	 *영상 목록
	 *영상 1개 보기
	 *동영상 수정
	 *동영상 삭제
	 */

}







