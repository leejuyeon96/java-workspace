package ImageController;

import java.util.ArrayList;

import com.youtube.model.Image;

import UserController.UserController;

public class ImageController {
	UserController uc = new UserController();
		ArrayList<Image> imageList = new ArrayList<>();
		
		public Image upload(Image image) {
			imageList.add(image);
			return image;
		}

		
		public ArrayList<Image> imageList() {
			return imageList;
		}

		
		public Image viewImage(int index) {
			return imageList.get(index);
		}

		
		public Image updateImage(String id, String password, int index, Image image) {
			if(uc.login(id, password) && id == image.user.id) 
			return imageList.set(index, image);
			return null;
		}

		
		public boolean deleteImage(String id, String password, Image image) {
			if(uc.login(id, password) && id == image.user.id)
			return imageList.remove(image);
			return false;
		}
}
