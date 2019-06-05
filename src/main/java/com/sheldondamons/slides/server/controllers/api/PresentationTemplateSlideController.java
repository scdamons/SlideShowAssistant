package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.PresentationTemplateSlide;
import com.sheldondamons.slides.model.repository.PresentationTemplateSlideRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class PresentationTemplateSlideController {

  @Autowired
  private PresentationTemplateSlideRepository presentationTemplateSlideRepository;

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-template-slide")
  public List<PresentationTemplateSlide> getPresentationTemplateSlides() {
    List<PresentationTemplateSlide> retList = new ArrayList<>();
    presentationTemplateSlideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-template-slide/{presentation-template-slide-id}")
  public Optional<PresentationTemplateSlide> getPresentationTemplateSlides(@PathVariable(value = "presentation-template-slide-id") int presentationTemplateSlideId) {
    return presentationTemplateSlideRepository.findById(presentationTemplateSlideId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/presentation-template-slide")
  public PresentationTemplateSlide createPresentationTemplateSlide(PresentationTemplateSlide presentationTemplateSlide) {
    return presentationTemplateSlideRepository.save(presentationTemplateSlide);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/presentation-template-slide/{presentation-template-slide-id}")
  public PresentationTemplateSlide updatePresentationTemplateSlide(PresentationTemplateSlide presentationTemplateSlide) {
    return presentationTemplateSlideRepository.save(presentationTemplateSlide);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/presentation-template-slide/{presentation-template-slide-id}")
  public void deletePresentationTemplateSlide(PresentationTemplateSlide presentationTemplateSlide) {
    presentationTemplateSlideRepository.delete(presentationTemplateSlide);
    return;
  }

}
