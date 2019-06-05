package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.SlideData;
import com.sheldondamons.slides.model.repository.SlideDataRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class SlideDataController {

  @Autowired
  private SlideDataRepository slideRepository;

  @RequestMapping(method = RequestMethod.GET, value="/slide-data")
  public List<SlideData> getSlideDatas() {
    List<SlideData> retList = new ArrayList<>();
    slideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/slide-data/{slide-data-id}")
  public Optional<SlideData> getSlideDatas(@PathVariable(value = "slide-data-id") int slideDataId) {
    return slideRepository.findById(slideDataId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/slide-data")
  public SlideData createSlideData(SlideData slideData) {
    return slideRepository.save(slideData);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/slide-data/{slide-data-id}")
  public SlideData updateSlideData(SlideData slideData) {
    return slideRepository.save(slideData);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/slide-data/{slide-data-id}")
  public void deleteSlideData(SlideData slideData) {
    slideRepository.delete(slideData);
    return;
  }

}
