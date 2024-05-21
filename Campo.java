public class Campo{
    private char simbolo;
    public ccampo(){
        this.simbolo=' ';
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo==' '){
            this.simbolo=simbolo;
        }else{
            System.outprint("Campo ja usado");
        }

    }
}