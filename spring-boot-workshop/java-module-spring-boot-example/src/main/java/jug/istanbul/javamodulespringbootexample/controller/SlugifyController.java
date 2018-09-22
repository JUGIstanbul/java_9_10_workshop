package jug.istanbul.javamodulespringbootexample.controller;

import jug.istanbul.slugifier.Slugifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@Controller
@RequestMapping(path = "slugify/v1")
public class SlugifyController {

    @PostMapping
    public @ResponseBody String getSlugifiedText(@RequestBody String text) {
        return Slugifier.slugify(text);
    }
}
