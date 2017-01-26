package com.pillar.data;

import java.util.ArrayList;

public class VendingMachine {
	public Coins coin;

	

	public Coins getCoin() {
		return coin;
	}

	public void setCoin(Coins coin) {
		this.coin = coin;
	}

	//public double coinSize;
	public double transactionTotal;
	public String displayText;
	// public ArrayList<Double> returnCoins;
	public Foods dispenseProduct;
	public ArrayList<Foods> menu;
	public double returnTotal;
	public String buttonPressed;
	public double machineBalance;

	public VendingMachine() {
		this.displayText = "INSERT COIN";

		// take this out later
		// returnCoins = new ArrayList<Double>();
		menu = new ArrayList<Foods>(10);
		menu.add(new Drinks("Cola", 1.00, "C", 10));
		menu.add(new Snacks("Candy", 0.65, "N", 5));
		menu.add(new Snacks("Chips", 0.50, "P", 0));

	}
	
	public VendingMachine(String button, double total) {
		this.buttonPressed = button;
		this.transactionTotal = total;
	}
	
	public double getMachineBalance() {
		return machineBalance;
	}

	public void setMachineBalance(double machineBalance) {
		this.machineBalance = machineBalance;
	}

	public String getButtonPressed() {
		return buttonPressed;
	}

	public void setButtonPressed(String buttonPressed) {
		this.buttonPressed = buttonPressed;
	}

	public double getReturnTotal() {
		return returnTotal;
	}

	public void setReturnTotal(double returnTotal) {
		this.returnTotal = returnTotal;
	}

	public ArrayList<Foods> getMenu() {
		return menu;
	}

	public void setDispenseProduct(Foods dispenseProduct) {
		this.dispenseProduct = dispenseProduct;
	}
	/*
	 * public double getCoins() { return coins; }
	 * 
	 * public void setCoins(double coins) { this.coins = coins; }
	 */

	public double getTransactionTotal() {
		return this.transactionTotal;
	}

	public Object getDisplayText() {
		return this.displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public void setTransactionTotal(double total) {
		this.transactionTotal = total;
	}

	public Foods getDispenseProduct() {
		return this.dispenseProduct;
	}
	
	/*public double getCoinWeight() {
		return coinWeight;
	}

	public void setCoinWeight(double coinWeight) {
		this.coinWeight = coinWeight;
	}

	public double getCoinSize() {
		return coinSize;
	}

	public void setCoinSize(double coinSize) {
		this.coinSize = coinSize;
	}*/
	/*
	 * public ArrayList<Double> getReturnCoins() { return returnCoins; }
	 * 
	 * public void setReturnCoins(ArrayList<Double> returnCoins) {
	 * this.returnCoins = returnCoins; }
	 */
	
	

}
