package com.sample.test;

import java.util.List;

class Main implements AutoCloseable {

	Main(int a) {

	}

	public void test(int number) throws Exception {
		List<Integer> list = null;
		try (Main m = new Main(list.size())) {
		} catch (Exception e) {
			throw new Exception(e.getMessage(),e);
		}

	}

	@Override
	public void close() throws Exception {
	}
}
