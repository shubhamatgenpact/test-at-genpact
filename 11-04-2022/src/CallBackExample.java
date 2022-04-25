interface ClientEvent {
	public void clickMode();
}

class ClickHandler implements ClientEvent {

	@Override
	public void clickMode() {
		System.out.println("Hey.. you have clicked...");
	}
}

class Button {
	public void onClick(ClientEvent clientEvent) {
		clientEvent.clickMode();
	}
}

public class CallBackExample {
	public static void main(String[] args) {
		Button b1 = new Button();

		ClickHandler c1 = new ClickHandler();
		b1.onClick(c1);

		Button b2 = new Button();
		b2.onClick(new ClientEvent() {

			@Override
			public void clickMode() {
				// TODO Auto-generated method stub
				System.out.println("You have clicked a button");
			}
		});

	}
}
