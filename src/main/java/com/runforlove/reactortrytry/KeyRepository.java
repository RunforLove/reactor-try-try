package com.runforlove.reactortrytry;

import com.google.common.base.Charsets;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import org.springframework.stereotype.Component;

@Component
public class KeyRepository {
	private static final HashFunction SHA512 = Hashing.sha512();
	
	public byte[] getOrCreateBy(String key) {
		byte[] b128 = new byte[16];
		SHA512.hashString(key, Charsets.UTF_8).writeBytesTo(b128, 0, b128.length);
		return b128;
	}
	
}
