package mainpackage.service;


import mainpackage.model.PostModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	PostService() {
		System.out.println("*******PostService Constructor");
	}

	public PostModel[] getAllPosts() {
		PostModel[] postModels = new PostModel[1];
		PostModel postModel = new PostModel();
		postModel.setBody("This post Body 1");
		postModel.setId(1);
		postModel.setTitle("Spring Container");
		postModels[0] = postModel;
		return  postModels;

	}
}
