package by.zhenekns.dev.app.springauth.mail;

import org.springframework.stereotype.Component;


public interface EmailSender {
    void send(String to, String email);
}
