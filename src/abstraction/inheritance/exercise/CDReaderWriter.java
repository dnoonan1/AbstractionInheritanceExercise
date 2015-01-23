package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class CDReaderWriter extends DiscReaderWriter {
    // other extensions include DVDReaderWriter and BluRayReaderWriter
    
    @Override
    public byte read() {
        // implement reading
        throw new UnsupportedOperationException(); // not yet implemented!
    }
    
    @Override
    public void write(byte b) {
        // implement writing a single byte
    }
    
    @Override
    public void write(byte[] b) {
        // implement writing an array of bytes
    }
    
    @Override
    public byte[] encode(byte[] b) {
        throw new UnsupportedOperationException(); // not yet implemented!
    }
    
    @Override
    public byte[] decode(byte[] b) {
        throw new UnsupportedOperationException(); // not yet implemented!
    }
    
}
