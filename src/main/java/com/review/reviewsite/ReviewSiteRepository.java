package com.review.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository {

	private Map<Long, Review> reviewRepository = new HashMap<Long, Review>();

	public void addReview(Review review) {
		reviewRepository.put(review.getId(), review);

	}
	public int getSizeOfRepository() {
		return reviewRepository.size();
		
	}
	public Collection<Review> getReviews() {
		return reviewRepository.values();
	}
	public ReviewSiteRepository() {
	Review loneSurvivorReview = new Review(2L, "Lone Survivor Review", "/img/Lone_Survivor_poster.jpg", "Action", "This is a great american movie" );
	Review savagesReview = new Review(3L, "Savages Review", "/img/savage.jpg", "Action", "Thriller throughout");
	Review onlyTheBraveReview = new Review(4L, "Only The Brave Review", "/img/only_the_brave_2017.jpg", "Adventure", "One of the saddest true stories");
	this.addReview(loneSurvivorReview);
	this.addReview(savagesReview);
	this.addReview(onlyTheBraveReview);
	
	
	}
	public Review findById(Long id) {
	
		return reviewRepository.get(id);
	}

}
