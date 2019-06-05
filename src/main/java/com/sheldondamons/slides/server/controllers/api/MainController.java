package com.sheldondamons.slides.server.controllers.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sheldon Damons 2019
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping(method = RequestMethod.GET)
  public String getIndex() {
    return "slides";
  }
}
