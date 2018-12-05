package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute ;
import java.util.Map ;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.HashMap ;


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

    @RequestMapping(value="/room/{id}")
    public @ResponseBody ModelAndView joinRoom(@PathVariable("id") String id, @ModelAttribute("wm") WatchModel wm){
	    Map<String, Object> params = new HashMap<>();
	    wm.setRoom(id);
	    params.put("wm",wm);
	    return new ModelAndView("video",params);
	
    }
}
	

