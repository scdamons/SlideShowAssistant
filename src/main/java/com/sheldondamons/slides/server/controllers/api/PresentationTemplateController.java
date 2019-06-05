package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.PresentationTemplate;
import com.sheldondamons.slides.model.repository.PresentationTemplateRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class PresentationTemplateController {

  @Autowired
  private PresentationTemplateRepository presentationTemplateRepository;

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-template")
  public List<PresentationTemplate> getPresentationTemplates() {
    List<PresentationTemplate> retList = new ArrayList<>();
    presentationTemplateRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/presentation-template/{presentation-template-id}")
  public Optional<PresentationTemplate> getPresentationTemplates(@PathVariable(value = "presentation-template-id") int presentationTemplateId) {
    return presentationTemplateRepository.findById(presentationTemplateId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/presentation-template")
  public PresentationTemplate createPresentationTemplate(PresentationTemplate presentationTemplate) {
    return presentationTemplateRepository.save(presentationTemplate);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/presentation-template/{presentation-template-id}")
  public PresentationTemplate updatePresentationTemplate(PresentationTemplate presentationTemplate) {
    return presentationTemplateRepository.save(presentationTemplate);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/presentation-template/{presentation-template-id}")
  public void deletePresentationTemplate(PresentationTemplate presentationTemplate) {
    presentationTemplateRepository.delete(presentationTemplate);
    return;
  }

}
