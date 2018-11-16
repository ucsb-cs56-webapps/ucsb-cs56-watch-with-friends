package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/music")
    public String music() {
        return "music";
    }

	@RequestMapping("/favs")
	public String favs() {
        return "favs";
    }

	@RequestMapping("/chat")
	public String chat() {
        return "chat";
    }
        @RequestMapping("/share")
        public String share() {
        return "share";
    }
        @RequestMapping("/video")
        public String video() {
        return "video";
    }

}
	

