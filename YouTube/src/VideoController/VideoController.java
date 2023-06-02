package VideoController;

import com.youtube.model.Video;

public class VideoController {

	Video[] videoList = new Video[5];
	int index = 0;
	
	
	public Video upload(Video video) {
		return videoList[index++] = video;
	}

	
	public Video[] videoList() {
		return videoList;
	}

	
	public Video viewVideo(int index) {
		return videoList[index];
	}

	
	public Video updateVideo(int index, Video video) {
		return videoList[index] = video;
	}

	
	public boolean deleteVideo() {
		return false;
	}


 
	/*영상 업로드
	 *영상 목록
	 *영상 1개 보기
	 *동영상 수정
	 *동영상 삭제
	 */

}







