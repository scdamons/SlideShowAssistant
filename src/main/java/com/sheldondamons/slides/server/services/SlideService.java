package com.sheldondamons.slides.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheldondamons.slides.model.repository.*;

/**
 * @author Sheldon Damons 2019
 *
 */
@Service
public class SlideService {

  private final PresentationRepository presentationRepository;
  private final PresentationSlidesRepository presentationSlidesRepository;
  private final PresentationTemplateRepository presentationTemplateRepository;
  private final PresentationTemplateSlideRepository presentationTemplateSlideRepository;
  private final SlideDataRepository slideDataRepository;
  private final SlideDataTypeRepository slideDataTypeRepository;
  private final SlideSlideDataRepository slideSlideDataRepositor;
  private final SlideRepository slideRepository;
  private final UserGroupRepository userGroupRepository;

  /**
   * @param presentationRepository
   * @param presentationSlidesRepository
   * @param presentationTemplateRepository
   * @param presentationTemplateSlideRepository
   * @param slideDataRepository
   * @param slideDataTypeRepository
   * @param slideSlideDataRepositor
   * @param slideRepository
   * @param userGroupRepository
   */
  @Autowired
  public SlideService(PresentationRepository presentationRepository, PresentationSlidesRepository presentationSlidesRepository, PresentationTemplateRepository presentationTemplateRepository, PresentationTemplateSlideRepository presentationTemplateSlideRepository, SlideDataRepository slideDataRepository, SlideDataTypeRepository slideDataTypeRepository, SlideSlideDataRepository slideSlideDataRepositor, SlideRepository slideRepository, UserGroupRepository userGroupRepository) {
    super();
    this.presentationRepository = presentationRepository;
    this.presentationSlidesRepository = presentationSlidesRepository;
    this.presentationTemplateRepository = presentationTemplateRepository;
    this.presentationTemplateSlideRepository = presentationTemplateSlideRepository;
    this.slideDataRepository = slideDataRepository;
    this.slideDataTypeRepository = slideDataTypeRepository;
    this.slideSlideDataRepositor = slideSlideDataRepositor;
    this.slideRepository = slideRepository;
    this.userGroupRepository = userGroupRepository;
  }


}
