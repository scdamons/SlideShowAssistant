package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.SlideSlideData;
import com.sheldondamons.slides.model.repository.SlideSlideDataRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class SlideSlideDataController {

  @Autowired
  private SlideSlideDataRepository slideRepository;

  @RequestMapping(method = RequestMethod.GET, value="/slide-slide-data")
  public List<SlideSlideData> getSlideSlideDatas() {
    List<SlideSlideData> retList = new ArrayList<>();
    slideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/slide-slide-data/{slide-slide-data-id}")
  public Optional<SlideSlideData> getSlideSlideDatas(@PathVariable(value = "slide-slide-data-id") int slideSlideDataId) {
    return slideRepository.findById(slideSlideDataId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/slide-slide-data")
  public SlideSlideData createSlideSlideData(SlideSlideData slideSlideData) {
    return slideRepository.save(slideSlideData);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/slide-slide-data/{slide-slide-data-id}")
  public SlideSlideData updateSlideSlideData(SlideSlideData slideSlideData) {
    return slideRepository.save(slideSlideData);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/slide-slide-data/{slide-slide-data-id}")
  public void deleteSlideSlideData(SlideSlideData slideSlideData) {
    slideRepository.delete(slideSlideData);
    return;
  }

}
