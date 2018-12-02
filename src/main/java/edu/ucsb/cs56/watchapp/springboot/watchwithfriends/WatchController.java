package edu.ucsb.cs56.pconrad.springboot.watchapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//TODO:ADAPT THIS FILE TO WATCHWITHFRIENDS APP

@Controller
public class WatchController {

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

    @RequestMapping("/join")
    public String join() {
        return "join";
    }

}
	

