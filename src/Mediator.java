public interface Mediator {
    void registerComponent(PresentationViewerComponent presentationViewerComponent);

    SlideViewerFrame getSlideViewerFrame();

    SlideViewerComponent getSlideViewComponent();
    Presentation getPresentation();
    void setSlideNumber(Slide currentSlide);

    int getSlideNumber();

    int getSize();
    String getTitle();

    void setTitle();
    void getAndSetWindow();
}
