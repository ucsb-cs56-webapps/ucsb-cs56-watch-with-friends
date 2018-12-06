package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute ;
import java.util.Map ;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.HashMap ;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class WatchController {


    @Autowired
    private WatchCodeRepository repository;

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

    @RequestMapping("/temp")
    public String temp() {
    	return "temp";
    }

    @RequestMapping(value="/room/{id}")
    public @ResponseBody ModelAndView joinRoom(@PathVariable("id") String id, @ModelAttribute("wm") WatchCode wc){
	    Map<String, Object> params = new HashMap<>();
	   // repository.save(new WatchCode("https://www.youtube.com/embed/vJR_-O_tLFo", "Test", id));
	    wc = repository.findByHash(id);
	    params.put("roomName", wc.getName());
            params.put("id", wc.getHash());
            params.put("videoURL", wc.getLink());
	    return new ModelAndView("video",params);
	
    }

    @RequestMapping(value="/vid/{id}/{url}")
    public String setVid (@PathVariable("id") String id, @PathVariable("url") String url, @ModelAttribute("wm") WatchCode wc){
        wc = repository.findByHash(id);
//	repository.save(new WatchCode("two","things","here"));
	wc.setLink("https://www.youtube.com/embed/" + url);
	repository.save(wc);
	return "temp";
    }



    @RequestMapping(value="/create/{rn}/{id}")
    public @ResponseBody ModelAndView createSite (@PathVariable("id") String id, @PathVariable("rn") String rn, @ModelAttribute("wm") WatchCode wc){
        repository.save(new WatchCode("https://i.ibb.co/KW5TFrj/Unavalible.png",rn,id));
	Map<String, Object> params = new HashMap<>();
        params.put("roomName", rn);
        params.put("id", id);
        params.put("videoURL", "none");
        return new ModelAndView("video",params);
    }

}
	

