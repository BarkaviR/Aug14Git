package org.cli;

public class Client {

	int a = 10, b = 20;

	private void cliId() {
		System.out.println("Client Id : 5456356");
	}

	private void cliName() {
		System.out.println("Client Name : Anitha");
	}

	public static void main(String[] args) {

		Client c = new Client();
		c.cliId();
	}
}
