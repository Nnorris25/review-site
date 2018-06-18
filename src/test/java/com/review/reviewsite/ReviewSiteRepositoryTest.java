package com.review.reviewsite;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.hamcrest.*;

public class ReviewSiteRepositoryTest {
	ReviewSiteRepository reviewRepo = new ReviewSiteRepository();
	Review review = new Review(999L, "Test Title", "testImgUrl", "category", "content");

	@Test
	public void shouldAddNewReviewToSite() {
		int reviewRepoSizeBeforeAdding = reviewRepo.getSizeOfRepository();
		reviewRepo.addReview(review);
		int reviewRepoSizeAfterAdding = reviewRepo.getSizeOfRepository();
		assertThat(reviewRepoSizeAfterAdding, is(equalTo(reviewRepoSizeBeforeAdding + 1)));

	}

	@Test
	public void shouldReturnAllValuesOfRepository() {
		int actualSizeOfCollection = reviewRepo.getReviews().size();
		int expectedSizeOfCollection = 3;

		assertThat(actualSizeOfCollection, is(equalTo(expectedSizeOfCollection)));

	}
	
	@Test
	public void shouldReturnAReview() {
		reviewRepo.getReviews();
		for(Review review: reviewRepo.getReviews()) {
			assertTrue(review instanceof Review);
		}
		
		
		
	}
	
	
	@Test
	public void shouldReturnAReviewById() {
		reviewRepo.addReview(review);
		Review underTest = reviewRepo.findById(999L);
		
		Long expectedReviewId = 999L;
		assertThat(underTest.getId(), is(equalTo(expectedReviewId)));
		
		
		
	}
	
	
	
	

}
