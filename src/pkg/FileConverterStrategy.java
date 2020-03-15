package pkg;

public interface FileConverterStrategy {
    public void write(String filename, byte[] data);
}
