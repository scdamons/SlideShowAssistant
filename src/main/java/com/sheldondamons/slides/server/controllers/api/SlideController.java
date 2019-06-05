package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.Slide;
import com.sheldondamons.slides.model.repository.SlideRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class SlideController {

  @Autowired
  private SlideRepository slideRepository;

  @RequestMapping(method = RequestMethod.GET, value="/slide")
  public List<Slide> getSlides() {
    List<Slide> retList = new ArrayList<>();
    slideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/slide/{slide-id}")
  public Optional<Slide> getSlides(@PathVariable(value = "slide-id") int slideId) {
    return slideRepository.findById(slideId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/slide")
  public Slide createSlide(Slide slide) {
    return slideRepository.save(slide);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/slide/{slide-id}")
  public Slide updateSlide(Slide slide) {
    return slideRepository.save(slide);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/slide/{slide-id}")
  public void deleteSlide(Slide slide) {
    slideRepository.delete(slide);
    return;
  }

}
