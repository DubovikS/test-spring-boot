package com.sergey.music;

import com.sergey.music.Interfaces.MessageInterface.MessageInterface;
import com.sergey.music.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    MessageInterface messageInterface;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "info";
    }

    @GetMapping("/greetingMustache")
    public String greetingMustache(@RequestParam(name="name", required=false, defaultValue="World") String name,  Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("messages",  messageInterface.findAll());
        return "main";
    }

    @PostMapping
    public String addMessage(@RequestParam String text, @RequestParam String tag, Map<String, Object> model){
        Message message = new Message(text, tag);
        messageInterface.saveMessage(message);

        List<Message> messageList = messageInterface.findAll();
        model.put("messages", messageList);
        return "main";
    }

}
