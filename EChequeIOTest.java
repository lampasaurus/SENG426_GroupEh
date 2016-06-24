package eCheque;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static org.mockito.Mockito.*;
import org.powermock.*;
import org.powermock.api.mockito.PowerMockito;

import org.junit.Test;
import org.junit.runner.RunWith;

public class EChequeIOTest {

	@Test
	public void testCreateEChequeIO() {
		EChequeIO object = new EChequeIO();
		
		assertNotNull(object);
	}
	
	@Test
	public void testSaveChequeValid() {
		ObjectOutputStream mockOutStream = mock(ObjectOutputStream.class);
		FileOutputStream mockFileStream = mock(FileOutputStream.class);
		File mockFile = mock(File.class);
		ECheque mockCheque = mock(ECheque.class);
		
		// mock File constructor
		try {
			PowerMockito.whenNew(File.class).withAnyArguments().thenReturn(mockFile);
		} catch (Exception e1) {
			fail("Something went wrong with this test. Powermockito not found.");
		}
		
		// mock FileOutput Constructor
		try {
			when(new FileOutputStream(mockFile)).thenReturn(mockFileStream);
		} catch (FileNotFoundException e) {
			fail("Something went wrong with this test. MockFile not found.");
		}
		
		// mock ObjectOutputConstructor
		try {
			when(new ObjectOutputStream(mockFileStream)).thenReturn(mockOutStream);
		} catch (IOException e) {
			fail("Something went wrong with this test. MockFileStream not found.");
		}
		
		// create EChequeIO
		EChequeIO testIO = new EChequeIO();
		
		// call
		try {
			testIO.savecheque(mockCheque, "fileName");
		} catch (Exception IOException) {
			fail("What");
		}
		
	}
	
//	@Test
//	public void testSaveChequeInValid() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void testReadChequeValid() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void testReadChequeInValid() {
//		fail("Not yet implemented");
//	}

}
