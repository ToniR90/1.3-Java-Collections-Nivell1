public class Month {

    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean check = false;
        if(this == obj){
            check = true;
        }else if(obj != null && getClass() == obj.getClass()){
            Month month = (Month) obj;
            if(name.equals(month.getName())){
                check = true;
            }
        }
        return check;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
