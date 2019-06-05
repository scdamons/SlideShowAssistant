package com.sheldondamons.slides.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sheldondamons.slides.model.entity.PresentationTemplateSlide;

/**
 * @author Sheldon Damons 2019
 *
 */
@Repository
public interface PresentationTemplateSlideRepository extends PagingAndSortingRepository<PresentationTemplateSlide, Integer> {

}
