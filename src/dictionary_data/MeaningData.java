package dictionary_data;

public class MeaningData {
    private String description1;
    private String description2;
    private String description3;

    public MeaningData(String description1) {
        this.description1 = description1;
    }

    public MeaningData(String description1, String description2) {
        this.description1 = description1;
        this.description2 = description2;
    }

    public MeaningData(String description1, String description2, String description3) {
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
    }

    public String getDescription1() {
        return description1;
    }
    public void setDescription1(String description1) {
        this.description1 = description1;
    }
    public String getDescription2() {
        return description2;
    }
    public void setDescription2(String description2) {
        this.description2 = description2;
    }
    public String getDescription3() {
        return description3;
    }
    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    @Override
    public String toString() {
        return "dictionary_data.MeaningData{" +
                "description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                ", description3='" + description3 + '\'' +
                '}';
    }
}
