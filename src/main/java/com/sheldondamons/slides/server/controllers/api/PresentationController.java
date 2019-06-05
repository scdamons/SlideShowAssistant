package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.Presentation;
import com.sheldondamons.slides.model.repository.PresentationRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class PresentationController {

  @Autowired
  private PresentationRepository presentationRepository;

  @RequestMapping(method = RequestMethod.GET, value="/presentation")
  public List<Presentation> getPresentations() {
    List<Presentation> retList = new ArrayList<>();
    presentationRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/presentation/{presentation-id}")
  public Optional<Presentation> getPresentations(@PathVariable(value = "presentation-id") int presentationId) {
    return presentationRepository.findById(presentationId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/presentation")
  public Presentation createPresentation(Presentation presentation) {
    return presentationRepository.save(presentation);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/presentation/{presentation-id}")
  public Presentation updatePresentation(Presentation presentation) {
    return presentationRepository.save(presentation);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/presentation/{presentation-id}")
  public void deletePresentation(Presentation presentation) {
    presentationRepository.delete(presentation);
    return;
  }

}
