package com.springacl.board.web;

import com.springacl.board.domain.Message;
import com.springacl.board.service.MessageBoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/messageDelete*")
public class MessageDeleteController {
    private MessageBoardService messageBoardService;

    @Autowired
    public void MessageDeleteController(MessageBoardService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String messageDelete(@RequestParam(required = true, value = "messageId")
    Long messageId, Model model) {
        Message message = messageBoardService.findMessageById(messageId);
        messageBoardService.deleteMessage(message);
        model.addAttribute("messages", messageBoardService.listMessages());

        return "redirect:messageList";
    }
}
