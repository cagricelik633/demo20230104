package tr.edu.medipol.yova.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - On hazirliklar
        String orjinalMetin = null;

        // WHEN - Asil testi gerceklestir
        String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);

        // THEN - Kontroller
        assertEquals("Uctashoshosaf...", sonuc);
	
	
		
	}

}
