import javax.swing.*;

public class SlideViewerComponentFactory {
    public static SlideViewerComponent createSlideViewerComponent(Presentation pres, JFrame frame) {
        return new SlideViewerComponent(pres, frame);
    }
}
