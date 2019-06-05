package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.PresentationSlides;
import com.sheldondamons.slides.model.repository.PresentationSlidesRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class PresentationSlidesController {

  @Autowired
  private PresentationSlidesRepository presentationSlidesRepository;

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-slides")
  public List<PresentationSlides> getPresentationSlidess() {
    List<PresentationSlides> retList = new ArrayList<>();
    presentationSlidesRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-slides/{presentation-slides-id}")
  public Optional<PresentationSlides> getPresentationSlidess(@PathVariable(value = "presentation-slides-id") int presentationSlidesId) {
    return presentationSlidesRepository.findById(presentationSlidesId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/presentation-slides")
  public PresentationSlides createPresentationSlides(PresentationSlides presentationSlides) {
    return presentationSlidesRepository.save(presentationSlides);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/presentation-slides/{presentation-slides-id}")
  public PresentationSlides updatePresentationSlides(PresentationSlides presentationSlides) {
    return presentationSlidesRepository.save(presentationSlides);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/presentation-slides/{presentation-slides-id}")
  public void deletePresentationSlides(PresentationSlides presentationSlides) {
    presentationSlidesRepository.delete(presentationSlides);
    return;
  }

}
