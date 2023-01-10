public class AccessorFactory {
    public static Reader createReader(String readerType) {
        return switch (readerType) {
            case "DEMO" -> new DemoPresentationReader();
            case "XML" -> new XMLReader();
            default -> throw new IllegalArgumentException("Unknown reader type: " + readerType);
        };
    }

    public static Writer createWriter(String writerType) {
        if (writerType.equals("XML")) {
            return new XMLWriter();
        }
        throw new IllegalArgumentException("Unknown writer type: " + writerType);
    }
}
