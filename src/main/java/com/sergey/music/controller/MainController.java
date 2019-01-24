package com.sergey.music.controller;

import antlr.StringUtils;
import com.sergey.music.Common;
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

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "index";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        model.put("messages", messageInterface.findAll());
        return "main";
    }

    @PostMapping("/main")
    public String addMessage(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);
        if (Common.notEmpty(text) && Common.notEmpty(tag)) {
            messageInterface.saveMessage(message);
        }

        List<Message> messageList = messageInterface.findAll();
        model.put("messages", messageList);
        return "main";
    }

    @GetMapping("/nails")
    public String nails(Map<String, Object> model) {
        return "index";
    }


}
