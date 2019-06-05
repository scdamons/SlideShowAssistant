package com.sheldondamons.slides.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sheldondamons.slides.model.entity.PresentationTemplate;

/**
 * @author Sheldon Damons 2019
 *
 */
@Repository
public interface PresentationTemplateRepository extends PagingAndSortingRepository<PresentationTemplate, Integer>{

}
