package com.design.patterns.singleton;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SingletonTests {
	@Autowired
	SingA singA1;
	
	@Autowired
	SingA singA2;
	
	@Autowired
	SingB singB1;

	@Autowired
	SingB singB2;

	@Test
	public void test() {
		assertThat(singA1).isEqualTo(singA2);
		assertThat(singB1).isEqualTo(singB2);
		
	}


}
