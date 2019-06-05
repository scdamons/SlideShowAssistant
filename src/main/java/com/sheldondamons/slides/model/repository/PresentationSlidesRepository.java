package com.sheldondamons.slides.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sheldondamons.slides.model.entity.PresentationSlides;

/**
 * @author Sheldon Damons 2019
 *
 */
@Repository
public interface PresentationSlidesRepository extends PagingAndSortingRepository<PresentationSlides, Integer>{

}
