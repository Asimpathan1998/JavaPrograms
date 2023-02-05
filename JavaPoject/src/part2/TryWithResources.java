package part2;

class One implements AutoCloseable {
	public void close() {
		System.out.println("Close - One");
	}
}

class Two implements AutoCloseable {
	public void close() {
		System.out.println("Close - Two");
	}
}

class Three implements AutoCloseable {
	public void close() {
		System.out.println("Close - Three");
	}
}

class TryWithResources {
	public static void main(String[] args) {
		try (One one = new One(); Two two = new Two();Three three = new Three()) {
			System.out.println("Try");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Catch");
		} finally {
			System.out.println("Finally");
		}
	}
}
