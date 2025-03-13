package siat.study.stream;

public class StreamDTO {
    private String name;
    public StreamDTO(){

    }
    public StreamDTO(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StreamDTO){
            return name.equals(((StreamDTO)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
