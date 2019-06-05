package com.sheldondamons.slides.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sheldondamons.slides.model.entity.Slide;

/**
 * @author Sheldon Damons 2019
 *
 */
@Repository
public interface SlideRepository extends PagingAndSortingRepository<Slide, Integer> {

}
