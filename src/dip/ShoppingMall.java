package dip;

// tightly coupled

public class ShoppingMall {

	BankCard card;

	ShoppingMall(BankCard card) {
		this.card = card;
	}

	public void doPurchase(long amount) {
		card.doTransaction(amount);
	}

	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchase(1000);
	}

}
