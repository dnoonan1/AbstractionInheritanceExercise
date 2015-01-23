package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class ByteReaderWriter {
    public abstract byte read();
    public abstract void write(byte b);
    public abstract void write(byte[] b);
}
