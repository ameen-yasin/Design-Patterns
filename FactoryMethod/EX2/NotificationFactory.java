package FactoryMethod.EX2;

public class NotificationFactory {
	public Notification createNotification(String channel) {
		Notification notification = null;

		if ("SMS".equals(channel))
			notification = new SMSNotification();
		else if ("EMAIL".equals(channel))
			notification = new EmailNotification();
		else if ("PUSH".equals(channel))
			notification = new PushNotification();
		return notification;
	}
}
