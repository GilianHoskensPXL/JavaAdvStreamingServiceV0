package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.opdracht1.Movie {

    private String topic;

    public Documentary(String title, be.pxl.ja.opdracht1.Rating maturityRating) {
        super(title, maturityRating);
        this.setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("Playing the documentary" + this + " [Topic: " + this.topic + "]");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the documentary" + this + " [Topic: " + this.topic + "]");
    }
}
