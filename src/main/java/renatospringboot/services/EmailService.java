package renatospringboot.services;

import org.springframework.mail.SimpleMailMessage;

import renatospringboot.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
