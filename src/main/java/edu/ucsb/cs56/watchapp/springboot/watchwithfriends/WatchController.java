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
    public @ResponseBody ModelAndView joinRoom(@PathVariable("id") Long id, @ModelAttribute("wm") WatchModel wm){
	    Map<String, Object> params = new HashMap<>();
	    wm.setID(""+id);
	    params.put("roomName", wm.getRoomName());
        params.put("id", wm.getID());
        params.put("videoURL", wm.getURL());
	    return new ModelAndView("video",params);
	
    }

    @RequestMapping(value="/vid/{id}/{url}")
    public void setVid (@PathVariable("id") String id, @PathVariable("url") String url, @ModelAttribute("wm") WatchModel wm){
        wm.setVid(id, url);
    }

    @RequestMapping(value="/create/{id}")
    public @ResponseBody ModelAndView createSite (@PathVariable("id") String id, @ModelAttribute("wm") WatchModel wm){
        wm.create(id);
        Map<String, Object> params = new HashMap<>();
        params.put("roomName", "temp name");
        params.put("id", id);
        params.put("videoURL", "https://www.youtube.com/embed/EF4jGOpBZT0");
        return new ModelAndView("video",params);
    }

}
	

