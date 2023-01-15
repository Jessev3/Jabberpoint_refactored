
public class PresentationViewer implements Mediator {
    private Presentation presentation;
    private SlideViewerComponent slideViewComponent;
    private SlideViewerFrame slideViewerFrame;

    public PresentationViewer() {
    }

    public void registerComponent(PresentationViewerComponent component) {
        component.setMediator(this);
        switch (component.getComponentName()) {
            case "Presentation" -> this.presentation = (Presentation) component;
            case "SlideViewerFrame" -> this.slideViewerFrame = (SlideViewerFrame) component;
            case "SlideViewerComponent" -> this.slideViewComponent = (SlideViewerComponent) component;
        }
    }


    @Override
    public Presentation getPresentation() {
        return this.presentation;
    }

    @Override
    public SlideViewerFrame getSlideViewerFrame() {
        return this.slideViewerFrame;
    }

    @Override
    public SlideViewerComponent getSlideViewComponent() {
        return this.slideViewComponent;
    }

    @Override
    public void setSlideNumber(Slide currentSlide) {
        if (this.slideViewComponent != null) {
            this.slideViewComponent.update(currentSlide);
        }
    }

    @Override
    public int getSlideNumber() {
        return this.presentation.getSlideNumber();
    }

    @Override
    public int getSize() {
        return this.presentation.getSize();
    }

    @Override
    public String getTitle() {
        return this.presentation.getTitle();
    }

    @Override
    public void setTitle() {
        this.slideViewerFrame.setTitle(getTitle());
    }

    @Override
    public void getAndSetWindow() {
        this.slideViewerFrame.getContentPane().add(this.slideViewComponent);
        this.slideViewerFrame.addKeyListener(new KeyController(this.presentation)); //Add a controller
        this.slideViewerFrame.setMenuBar(new MenuController(this.slideViewerFrame, this.presentation));	//Add another controller
    }
}
