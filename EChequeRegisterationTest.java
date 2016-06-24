package eCheque;

import static org.junit.Assert.*;

import org.junit.Test;


public class EChequeRegisterationTest {

	@Test
	public void testCreateEChequeRegisteration() {
		EChequeRegisteration object = new EChequeRegisteration();
		
		assertNotNull(object);
		
		String bankName = object.getBankName();
		assertNull(bankName);
		
		String bankAddress = object.getBankAddress();
		assertNull(bankAddress);
		
		String accountNumber = object.getAccountNumber();
		assertNull(accountNumber);
		
		String clientName = object.getClientName();
		assertNull(clientName);
		
		String eWalletLocation = object.getEWalletLoaction();
		assertNull(eWalletLocation);
		
		int userNameHash = object.getUsername();
		assertEquals(0, userNameHash);
		
		int passwordHash = object.getPasword();
		assertEquals(0, passwordHash);
	}

	@Test
	public void testSetGetBankName() {
		String NAME = "RBC";
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setBankName(NAME);
		
		String nname = object.getBankName();
		
		assertEquals(NAME, nname);
	}
	
	@Test
	public void testSetGetBankAddress() {
		String ADDRESS = "300 Finnerty Road";
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setBankAddress(ADDRESS);
		
		String aaddress = object.getBankAddress();
		
		assertEquals(ADDRESS, aaddress);
	}
	
	@Test
	public void testSetGetAccountNumber() {
		String NUMBER = "12345";
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setAccountNumber(NUMBER);
		
		String nnumber = object.getAccountNumber();
		
		assertEquals(NUMBER, nnumber);
	}
	
	@Test
	public void testSetGetClientName() {
		String NAME = "Archer";
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setClientName(NAME);
		
		String nname = object.getClientName();
		
		assertEquals(NAME, nname);
	}
	
	@Test
	public void testSetGetEWalletLocation() {
		String LOCATION = "/home/archer/Desktop";
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setEWalletLoaction(LOCATION);
		
		String llocation = object.getEWalletLoaction();
		
		assertEquals(LOCATION, llocation);
	}
	
	@Test
	public void testSetGetUsernameHash() {
		int UHASH = 1345;
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setUsername(UHASH);
		
		int hash = object.getUsername();
		
		assertEquals(UHASH, hash);
	}
	
	@Test
	public void testSetGetPasswordHash() {
		int PHASH = 7789;
		
		EChequeRegisteration object = new EChequeRegisteration();
		
		object.setPasword(PHASH);
		
		int hash = object.getPasword();
		
		assertEquals(PHASH, hash);
	}
}
