public class Team {
    private String name;
    Team(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        //ToDo Auto-generated method stub
        return name;
    }
    @Override
    public boolean equals(Object obj){
        //ToDo Auto-generated methos stub
        return this.name.equals(((Team)obj).name);
    }
}
