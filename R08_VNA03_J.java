//Rule 8 Visibility and Atomicity (VNA)
//Example VNA03-J. Do not assume that a group of calls to independently atomic methods is atomic
final class Adder {
    // ...
    private final AtomicReference<BigInteger> first;
    private final AtomicReference<BigInteger> second;

    public Adder(BigInteger f, BigInteger s) {
        first = new AtomicReference<BigInteger>(f);
        second = new AtomicReference<BigInteger>(s);
    }

    public synchronized void update(BigInteger f, BigInteger s) {
        first.set(f);
        second.set(s);
    }

    public synchronized BigInteger add() {
        return first.get().add(second.get());
    }

}
    public BigInteger add() { // Unsafe
        return first.get().add(second.get());
    }
}
