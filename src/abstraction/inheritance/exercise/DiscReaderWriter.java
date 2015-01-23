package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public abstract class DiscReaderWriter extends ByteReaderWriter {    
    public abstract byte[] encode(byte[] b);
    public abstract byte[] decode(byte[] b);
}
