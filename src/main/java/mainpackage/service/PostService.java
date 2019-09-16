package mainpackage.service;


import mainpackage.model.PostModel;
import org.springframework.stereotype.Component;

@Component
public class PostService {

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
