package imageviewer.model;

public abstract class Image {

    public abstract BitMap getBitMap();

    public abstract Image getNext();

    public abstract Image getPrev();

    public abstract void setNext(Image image);

    public abstract void setPrev(Image image);

}
