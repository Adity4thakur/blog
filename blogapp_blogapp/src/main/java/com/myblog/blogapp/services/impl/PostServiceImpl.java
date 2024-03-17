package com.myblog.blogapp.services.impl;

import org.springframework.stereotype.Service;

import com.myblog.blogapp.entity.POST;
import com.myblog.blogapp.payload.PostDto;
import com.myblog.blogapp.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	private PostRepository postRepo;
	
	
	
	public PostServiceImpl(PostRepository postRepo) {
		this.postRepo = postRepo; // remove the super
	}



	@Override // ALT + ENTER add the method
	public PostDto createPost(PostDto postDto) {
		// this will intrect with repository layer and save the data but (data base take
		// data from entity class)

		POST post = new POST(); // err to ask ankit(change to mybolg calss `)
		post.setTittle(postDto.getTittle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		
		POST postEntity = postRepo.save(post);
		
		return null;
		
	}

}
